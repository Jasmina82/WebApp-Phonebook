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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<link rel="stylesheet" href="css/headerHome.css" type="text/css">
<link rel="stylesheet" href="css/footerForList.css" type="text/css">
<body>
	<%@include file="headerHome.jsp"%>

	<h1 class="text-center">List of all contacts</h1>

	<form action="/WebApp-Phonebook/ListAllContacts" method="post">
		<div class="container">

			<div>
				<table class="table table-bordered table-striped table-hover text-center">
					<thead>
						<tr>
							<td colspan="7">Contact's info</td>
						</tr>
					</thead>

					<tr>
						<th class="text-center">Num
						</td>
						<th class="text-center">Name
						</td>
						<th class="text-center">Last name
						</td>
						<th class="text-center">Email
						</td>
						<th class="text-center">Phone number
						</td>
						<th class="text-center">City
						</td>
						<th class="text-center">Date of input
						</td>

					</tr>

					<c:forEach items="${contactsList}" var="contact" varStatus="contactsId">

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
				</table>

			</div>


		</div>


</form>


	<%@include file="footer.jsp"%>
	
</body>
</html>