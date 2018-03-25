<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit contact</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="mobile-web-app-capable" content="yes">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/mainStyle.css" />
<body>
	<%@include file="headerHome.jsp"%>

	<h1>Edit contact</h1>


	<form class="manipl-con" action="/WebApp-Phonebook/EditContactServlet"
		method="post">
		<div class="signup-form">

			<div class="form-group">
				<input type="text" name="name" placeholder=${contact.name
					}
						class="form-control" required />
			</div>
			<div class="form-group">
				<input type="text" name="lastname" placeholder=${contact.lastName
					}
						class="form-control" required />
			</div>
			<div class="form-group">
				<input type="text" name="email" placeholder=${contact.email
					}
						class="form-control" required />
			</div>
			<div class="form-group">
				<input type="phone" name="phoneNumber" placeholder=${contact.phone
					}
						class="form-control" required />
			</div>
			<div class="form-group">
				<input type="text" name="city" placeholder=${contact.city
					}
						class="form-control" required /><br /> <br />
			</div>
			<input type="hidden" name="hiddenId" value="${contact.id}" />

			<div class="form-group">
				<button type="submit" class="btn btn-success">Edit</button>
			</div>
		</div>
	</form>

	<script src="js/jquery-3.3.1.min.js"></script>
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