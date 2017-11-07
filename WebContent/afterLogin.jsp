<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="css/welcomeNewUserStyle.css" />
</head>
<body class="menu">
	<form action="/WebApp-Phonebook/LoginServlet"  method="post" >
		<nav id="start"> <a href="newContact.jsp">Add contact</a> <a
			href="home.jsp">Search contacts</a> <a href="allContacts.jsp">List
			contacts</a> </nav>
			
			
		<h1>	 <%=request.getSession().getAttribute("act") %>  <%=request.getSession().getAttribute("username") %></h1>
			
			
			</form>
</body>
</html>