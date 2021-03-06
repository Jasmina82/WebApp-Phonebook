package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.User;
import beans.UserBO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User newUser = new User();
		newUser.setMessage(null);

		String name = request.getParameter("name");
		String lastName = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String repeatPassword = request.getParameter("repeatPassword");
		String email = request.getParameter("email");
		String repeatEmail = request.getParameter("repeatEmail");
		String city = request.getParameter("city");

		newUser.setName(name);
		newUser.setLastName(lastName);
		newUser.setUsername(username);
		newUser.setPassword(password);
		newUser.setRepeatPassword(repeatPassword);
		newUser.setEmail(email);
		newUser.setRepeatEmail(repeatEmail);
		newUser.setCity(city);

		UserBO userBo = new UserBO();
		if (newUser.validateRegistration() && !userBo.userExists(username)) {

			userBo.addUser(newUser);
			request.getSession().setAttribute("act", "Welcome ");

			request.getSession().setAttribute("username", username);
			request.getRequestDispatcher("/helloMessage.jsp").forward(request, response);

		} else if (userBo.userExists(username)) {
			request.setAttribute("message", "Username already exists");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		} else {

			request.setAttribute("message", newUser.getMessage());
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}
	}

}
