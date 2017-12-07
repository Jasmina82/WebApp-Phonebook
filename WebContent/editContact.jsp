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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/addContactstyle.css" type="text/css">
<link rel="stylesheet" href="css/headerHome.css" type="text/css">
<link rel="stylesheet" href="css/footer.css" type="text/css">
<body>
	<%@include file="headerHome.jsp"%>

	<h1>Edit contact</h1>

	<div class="signup">
		<form action="/WebApp-Phonebook/EditContactServlet" method="post">
			<div class="signup-form">

				<div class="form-group">
					<input type="text" name="name" placeholder=${contact.name}
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="text" name="lastname" placeholder=${contact.lastName}
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="text" name="email" placeholder=${contact.email}
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="phone" name="phoneNumber" placeholder=${contact.phone}
						class="form-control" required />
				</div>
				<div class="form-group">
					<input type="text" name="city" placeholder=${contact.city}
						class="form-control" required /><br />
					<br />
				</div>
				<input type="hidden" name="hiddenId" value="${contact.id}"/>

				<div class="form-group">
					<input type="submit" name="submit" value="Edit contact"
						class="btn-reg" />
				</div>
		</form>
	</div>
	</div>

	<%@include file="footer.jsp"%>

</body>
</html>