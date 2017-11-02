<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/registerstyle.css" />
<title>Register</title>
</head>
<body class="menu">
	<form action="/WebApp-Phonebook/RegisterServlet" method="post">
		<nav id="start"> <a href="index.jsp">Home</a> <a
			href="login.jsp">Login</a> </nav>

		<h1>Register</h1>

		<div class="container">

			<form>

				<table>
					<tr>
						<td>Enter name:</td>
						<td><input type="text" name="name" placeholder="name"
							required /></td>
					</tr>
					<tr>
						<td>Enter last name:</td>
						<td><input type="text" name="lastname"
							placeholder="last name" required /></td>
					</tr>
					<tr>
						<td>Enter username:</td>
						<td><input type="text" name="username" placeholder="username"
							required /></td>
					</tr>
					<tr>
						<td>Enter password:</td>
						<td><input type="text" name="password" placeholder="password"
							required /></td>
					</tr>
					<tr>
						<td>Repeat password:</td>
						<td><input type="text" name="repeatPassword"
							placeholder="repeatPassword" required /></td>
					</tr>

					<tr>
						<td>Enter email:</td>
						<td><input type="text" name="email" placeholder="email"
							requaired /></td>
					</tr>
					<tr>
						<td>Repeat email:</td>
						<td><input type="text" name="repeatEmail"
							placeholder="repeat email" required /></td>
					</tr>
					<tr>
						<td>Enter city:</td>
						<td><input type="text" name="city" placeholder="city"
							required /></td>
					</tr>
				</table>

				<input type="submit" name="submit" value="Register" class="btn-reg" />
				<p class="login-error"><%=request.getAttribute("message")%></p>
			</form>

		</div>
</body>
</html>