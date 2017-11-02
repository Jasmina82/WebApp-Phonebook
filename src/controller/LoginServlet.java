package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import beans.UserHandler;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserHandler userHandler=new UserHandler();
		
		
		if (userHandler.userExists(username)) {
			if (userHandler.validPassword(username, password)) {

				request.getSession().setAttribute("username", username);
				request.getSession().setAttribute("password", password);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
		}

		else {
			request.setAttribute("message", "Username or password not recognized.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}
