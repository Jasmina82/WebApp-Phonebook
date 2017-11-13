<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">

<title>Search</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/header.css" type="text/css">
<link rel="stylesheet" href="css/footer.css" type="text/css">
<link rel="stylesheet" href="css/searchstyle.css" />
<link rel="stylesheet" href="css/font-awesome.css" />
</head>
<body>
<%@include file="headerHome.jsp"%>
	<form action="/WebApp-Phonebook/SearchServlet" method="post">
		<div class="search-box">
			<input class="search-box-input" type="search" name="name"
				placeholder="search...">

			<button class="search-box-icon">
				<i class="fa fa-search" aria-hidden="true"></i>
			</button>
		</div>
		<%@include file="footer.jsp"%>
	</form>
	
	
</body>
</html>