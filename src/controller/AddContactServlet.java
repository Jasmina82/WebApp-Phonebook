package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Contact;
import beans.ContactBO;

/**
 * Servlet implementation class AddContactServlet
 */
@WebServlet("/AddContactServlet")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = (String) request.getSession(false).getAttribute("username");
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String city = request.getParameter("city");

		Contact newContact = new Contact(name, lastName, email, phoneNumber, city);
		ContactBO contactBo = new ContactBO();

		if (newContact.validate()) {
			if (contactBo.addContact(newContact, user)) {
				request.getSession().setAttribute("act", "New contact added: ");
				request.getSession().setAttribute("message", name + " " + lastName);
				request.getRequestDispatcher("messageManagement.jsp").forward(request, response);
			}
			else if(!contactBo.addContact(newContact, user)) {
				request.getSession().setAttribute("username", user);
				request.getSession().setAttribute("act", "Not added ! Contact: ");
				request.getSession().setAttribute("message", name + " " + lastName);
				request.getRequestDispatcher("messageManagement.jsp").forward(request, response);
			}
		}
		else if(newContact.getMessage().equals(null)) {
			request.getSession().setAttribute("username", user);
			request.getRequestDispatcher("newContact.jsp").forward(request, response);
		}
		else {
			request.getSession().setAttribute("username", user);
			request.setAttribute("errorMessage", newContact.getMessage());
			request.getRequestDispatcher("newContact.jsp").forward(request, response);
		}

	}

}
