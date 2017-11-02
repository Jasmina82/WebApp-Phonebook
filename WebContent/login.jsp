<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/loginstyle.css" />
<link rel="stylesheet" type="text/css" href="css/font-awesome.css" />


</head>
<body class="menu">
	<form action="/WebApp-Phonebook/LoginServlet" method="post">
		<nav id="start"> <a href="index.jsp">Home</a> <a
			href="register.jsp">Register</a> </nav>
		<div class="container">
			<img src="pics/loginprofile.png">
			<form>
				<div class="form-input">
					<input type="text" name="username" placeholder="Enter username" />
				</div>
				<br />
				<div class="form-input">
					<input type="password" name="password" placeholder="Enter password" />
				</div>
				<input type="submit" name="submit" value="LOGIN" class="btn-login" />

				<p class="login-error">
					<%=request.getAttribute("message")%></p>
			</form>

		</div>
	</form>
</body>
</html>