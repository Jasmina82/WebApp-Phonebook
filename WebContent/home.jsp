<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logged in</title>

<link rel="stylesheet" href="css/homestyle.css" />
<link rel="stylesheet" href="css/font-awesome.css" />
</head>
<body class="menu">
	<form action="/WebApp-Phonebook/StartPageServlet" method="post">
		<nav id="start"> <a href="newContact.jsp">Add contact</a> <a
			href="home.jsp">Search contacts</a> <a href="allContacts.jsp">List
			contacts</a> </nav>
		<div class="search-box">
			<input class="search-box-input" type="search" name="search"
				placeholder="search...">

			<button class="search-box-icon">
				<i class="fa fa-search" aria-hidden="true"></i>
			</button>

		</div>
	</form>
</body>
</html>