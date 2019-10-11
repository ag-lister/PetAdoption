<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Agency Page</title>
</head>
<body>
<form action = "editAgencyItemServlet" method="post">
Name: 
<input type ="text" name = "name" value="${itemToEdit.agencyName}">
<br />
Address: 
<input type = "text" name = "address" value= "${itemToEdit.agencyAddress}">
<br />
Phone: 
<input type = "text" name = "phone" value= "${itemToEdit.agencyPhone}">
<br />
Email:
<input type = "text" name = "email" value= "${$itemToEdit.agencyEmail}">
<br />
<input type = "hidden" name = "id" value="${itemToEdit.agencyID}">
<input type = "submit" value="Save Edited Item">
</form>
</body>
</html>