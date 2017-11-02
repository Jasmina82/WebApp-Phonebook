<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add contact</title>
<link rel="stylesheet" href="css/newContactstyle.css" />
</head>
<body class="menu">
	<nav id="start"> <a href="newContact.jsp">Add contact</a> <a
		href="home.jsp">Search contacts</a> <a href="allContacts.jsp">List
		contacts</a> </nav>


	<h1>Add contact</h1>

	<div class="container">

		<form>

			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" placeholder="name" /></td>
				</tr>
				<tr>
					<td>Last name:</td>
					<td><input type="text" name="lastname" placeholder="last name" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" placeholder="email" /></td>
				</tr>
				<tr>
					<td>Phone number:</td>
					<td><input type="text" name="phoneNumber"
						placeholder="phone number" /></td>
				</tr>
				<tr>
					<td>Enter city:</td>
					<td><input type="text" name="city" placeholder="city" /></td>
				</tr>
			</table>

			<input type="submit" name="submit" value="Add contact"
				class="btn-reg" />

		</form>

	</div>

</body>
</html>