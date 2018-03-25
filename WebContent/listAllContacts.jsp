<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List contacts</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="mobile-web-app-capable" content="yes">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/mainStyle.css" />
<body>
	<%@include file="headerHome.jsp"%>

	<h1 class="text-center">List of all contacts</h1>

	<div class="container-fluid table-responsive">
		<form class="contactList" action="/WebApp-Phonebook/ListAllContacts"
			method="post">

			<table
				class="table table-bordered table-striped table-hover table-light">
				<thead>
					<tr>
						<td colspan="7">Contact's info</td>
					</tr>
				</thead>

				<tr>
					<th class="text-center">Num</th>
					<th class="text-center">Name</th>
					<th class="text-center">Last name</th>
					<th class="text-center">Email</th>
					<th class="text-center">Phone number</th>
					<th class="text-center">City</th>
					<th class="text-center">Date of input</th>

				</tr>
				<tbody>
					<c:forEach items="${contactsList}" var="contact"
						varStatus="contactsId">

						<tr>
							<td>${contactsId.count}</td>
							<td>${contact.name}</td>
							<td>${contact.lastName}</td>
							<td>${contact.email}</td>
							<td>${contact.phone}</td>
							<td>${contact.city}</td>
							<td>${contact.date}</td>

						</tr>

					</c:forEach>
				</tbody>
			</table>

		</form>
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