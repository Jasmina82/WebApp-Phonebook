package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Contact;
import beans.ContactBO;

/**
 * Servlet implementation class ListAllContacts
 */
@WebServlet("/ListAllContacts")
public class ListAllContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListAllContactsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = (String) request.getSession().getAttribute("username");

		ContactBO contactBo = new ContactBO();
		List<Contact> contactsList = new ArrayList<>();
		contactsList = contactBo.listAllContact(username);

		if (!contactsList.isEmpty()) {
			request.getSession().setAttribute("username", username);
			request.setAttribute("contactsList", contactsList);
			request.getRequestDispatcher("/listAllContacts.jsp").forward(request, response);

		} else {

			request.getSession().setAttribute("act", "Your contact list ");
			request.getSession().setAttribute("message", "is empty");
			request.getRequestDispatcher("/messageManagement.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
