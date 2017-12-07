<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="mobile-web-app-capable" content="yes">

<title>Login</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/loginstyle.css" type="text/css">
<link rel="stylesheet" href="css/header.css" type="text/css">
<link rel="stylesheet" href="css/footer.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Pacifico"
	rel="stylesheet">
</head>
<body>
	<%@include file="header.jsp"%>

	<div class="login">

		<div class="login-form">
			<h1>Login form</h1>
			<form action="/WebApp-Phonebook/LoginServlet" method="post">
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
	<%@include file="footer.jsp"%>
</body>
</html>