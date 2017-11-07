package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UserBO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); } catch (ClassNotFoundException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 **/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// HttpSession session = request.getSession(true);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserBO userBo = new UserBO();

		if (userBo.userExists(username)) {
			if (userBo.validPassword(username, password)) {

				request.getSession().setAttribute("username", username);
				request.getSession().setAttribute("act", "Welcome ");
				request.getRequestDispatcher("afterLogin.jsp").forward(request, response);
			}
		}

		else {
			request.setAttribute("message", "Username or password not recognized.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}
