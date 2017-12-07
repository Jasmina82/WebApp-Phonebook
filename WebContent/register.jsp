<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="mobile-web-app-capable" content="yes">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="css/registerstyle.css" type="text/css">

<link rel="stylesheet" href="css/footer.css" type="text/css">
<title>Register</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<h1>Register</h1>

	<div class="signup">
	<form action="/WebApp-Phonebook/RegisterServlet" method="post">
		<div class="signup-form">
		
				<div class="form-group">
					<input type="text" name="name" placeholder="Name"
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="text" name="lastname" placeholder="Last name"
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="text" name="username" placeholder="Username"
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="password" name="password" placeholder="Password"
						class="form-control" required />
				</div>
				<div class="form-group"></div>
				<div class="form-group">
					<input type="password" name="repeatPassword"
						placeholder="Confirm password" class="form-control" required />
				</div>
				<div class="form-group">
					<input type="text" name="email" placeholder="Email"
						class="form-control" requaired />
				</div>
				<div class="form-group">
					<input type="text" name="repeatEmail" placeholder="Repeat Email"
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="text" name="city" placeholder="City"
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="submit" name="submit" value="Register" class="btn-reg" />
				</div>
			</form>
			<c:if test="${message}!=null}">
			${message}
			</c:if>
		</div>
	</div>
	          
	
	<%@include file="footer.jsp"%>
</body>
</html>