<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Agency</title>
</head>
<body>
<form action = "addAgencyServlet" method="post">
Name: 
<input type ="text" name = "name">
<br />
Address: 
<input type = "text" name = "address">
<br />
Phone: 
<input type = "text" name = "phone">
<br />
Email: 
<input type = "text" name = "email">
<br />
<input type = "submit" value="Add Item">
</form> 
<br />
<a href = "index.html">Go to the main page</a>
</body>
</html>