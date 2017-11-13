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
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchServlet() {
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
		String nameOfContact=request.getParameter("name");
		
		ContactBO contactBo=new ContactBO();
		List<Contact> contacts=new ArrayList<>();
		contacts= contactBo.searchContact(nameOfContact,user);
		
		if(!contacts.isEmpty()) {
			
			request.getSession().setAttribute("username", user);
			request.getSession().setAttribute("contacts",contacts);
			request.getRequestDispatcher("searchResult.jsp").forward(request,response);
		}
		else {
			request.getSession().setAttribute("username", user);
			request.getSession().setAttribute("act", "No result for ");
			request.getSession().setAttribute("message", nameOfContact);
			request.getRequestDispatcher("contactManager.jsp").forward(request, response);
		}

	}

}
