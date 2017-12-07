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
		Contact newContact = new Contact();
		newContact.setMessage(null);

		String username = (String) request.getSession(false).getAttribute("username");
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String city = request.getParameter("city");

		newContact.setName(name);
		newContact.setLastName(lastName);
		newContact.setEmail(email);
		newContact.setPhone(phoneNumber);
		newContact.setCity(city);

		ContactBO contactBo = new ContactBO();
		if(contactBo.getNumOfContacts(username)==1000) {
			request.getSession().setAttribute("username", username);
			request.setAttribute("act", "Not added ! ");
			request.setAttribute("message", "You reached limit of 1000 contacts.");
			request.getRequestDispatcher("/messageManagement.jsp").forward(request, response);
		}

		if (newContact.validate()) {
			if (contactBo.addContact(newContact, username)) {
				request.setAttribute("act", "New contact added: ");
				request.setAttribute("message", name + " " + lastName);
				request.getRequestDispatcher("/messageManagement.jsp").forward(request, response);
			} else if (!contactBo.addContact(newContact, username)) {
				request.getSession().setAttribute("username", username);
				request.setAttribute("act", "Not added ! Contact: ");
				request.setAttribute("message", name + " " + lastName);
				request.getRequestDispatcher("/messageManagement.jsp").forward(request, response);
			}
		}

		else {
			request.getSession().setAttribute("username", username);
			request.setAttribute("errorMessage", newContact.getMessage());
			request.getRequestDispatcher("/addContact.jsp").forward(request, response);
		}

	}

}
