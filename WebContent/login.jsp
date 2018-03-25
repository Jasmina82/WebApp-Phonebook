<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="mobile-web-app-capable" content="yes">

<title>Login</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/mainStyle.css" />
</head>
<body>
	<%@include file="header.jsp"%>

	<div class="login">

		<div class="login-form">
			<h1>Login form</h1>
			<form class="manipl-con" action="/WebApp-Phonebook/LoginServlet"
				method="post">
				<div class="form-group">
					<label for="username">Username</label> <input type="text"
						name="username" class="form-control" required>
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						name="password" class="form-control" required>
				</div>
				<input type="submit" name="submit" value="login"
					class="form-control btn btn-primary">
				<p class="text-center">
					Not registered? <a href=register.jsp> Register here</a>
			</form>
		</div>
	</div>

	
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>