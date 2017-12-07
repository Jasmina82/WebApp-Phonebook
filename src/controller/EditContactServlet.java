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
 * Servlet implementation class EditContactServlet
 */
@WebServlet("/EditContactServlet")
public class EditContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		// request.getSession().setAttribute("id", id);
		ContactBO contactBo = new ContactBO();

		Contact contact = contactBo.getContactById(id);

		request.getSession().setAttribute("contact", contact);
		request.getRequestDispatcher("editContact.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ContactBO contactBo = new ContactBO();
		Contact newContact = new Contact();
		newContact.setMessage(null);
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String city = request.getParameter("city");
		int id = Integer.parseInt(request.getParameter("hiddenId"));

		newContact.setName(name);
		newContact.setLastName(lastName);
		newContact.setEmail(email);
		newContact.setPhone(phoneNumber);
		newContact.setCity(city);

		if (newContact.validate()) {
			if (contactBo.editContact(newContact, id)) {
				request.setAttribute("act", "Contact ");
				request.setAttribute("message", "edited");
				request.getRequestDispatcher("/messageManagement.jsp").forward(request, response);
			} else if (!contactBo.editContact(newContact, id)) {

				request.setAttribute("act", "Something went wrong! ");
				request.setAttribute("message", "Contact is not edited.");
				request.getRequestDispatcher("/messageManagement.jsp").forward(request, response);
			}
		} else {
			request.setAttribute("act", "It seems your inputs not valid!<br/> ");
			request.setAttribute("message", "Contact is not edited.");
			request.getRequestDispatcher("/messageManagement.jsp").forward(request, response);
		}

	}

}
