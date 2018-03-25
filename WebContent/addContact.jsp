<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="mobile-web-app-capable" content="yes">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/mainStyle.css" />
<title>Add contact</title>
</head>
<body>
	<%@include file="headerHome.jsp"%>
	<h1>Add contact</h1>


	<form class="manipl-con" action="/WebApp-Phonebook/AddContactServlet"
		method="post">
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
				<input type="text" name="email" placeholder="Email"
					class="form-control" required />
			</div>
			<div class="form-group">
				<input type="phone" name="phoneNumber" placeholder="Phone number"
					class="form-control" required />
			</div>
			<div class="form-group">
				<input type="text" name="city" placeholder="City"
					class="form-control" required /><br />
				<br />
			</div>

			<div class="form-group">
				<button type="submit" class="btn btn-success btn-sm">Add
					contact</button>
			</div>
	</form>
	<c:if test="${errorMessage}!=null}">
			${errorMessage}
			</c:if>

	
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