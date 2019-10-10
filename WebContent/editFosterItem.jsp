<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Foster Page</title>
</head>
<body>
<form action = "editFosterItemServlet" method="post">
Name: 
<input type ="text" name = "name" value="${itemToEdit.name}">
<br />
Address: 
<input type = "text" name = "address" value= "${itemToEdit.address}">
<br />
Phone: 
<input type = "text" name = "phone" value= "${itemToEdit.phoneNumber}">
<br />
<input type = "hidden" name = "id" value="${itemToEdit.id}">
<input type = "submit" value="Save Edited Item">
</form>
</body>
</html>