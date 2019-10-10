<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Foster</title>
</head>
<body>
<form action = "addFosterServlet" method="post">
Name: 
<input type ="text" name = "name">
<br />
Address: 
<input type = "text" name = "address">
<br />
Phone: 
<input type = "text" name = "phone">
<br />
<input type = "submit" value="Add Foster">
</form> 
<br />
<a href = "index.html">Go to the main page</a>
</body>
</html>