<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Pet</title>
</head>
<body>
<h1>Add Pet</h1>
<form action = "petServlet" method="post">
Species: 
<input type ="text" name = "species">
<br />
Breed: 
<input type ="text" name = "breed">
<br />
Name: 
<input type ="text" name = "name">
<br />
Age: 
<input type = "text" name = "age">
<br />
Date Sheltered: 
<input type="text" name="month" placeholder="mm" size="4"> 
		<input type="text" name="day" placeholder="dd" size="4" > 
		<input type="text" name="year" placeholder="yyyy" size="4">
<br />
Agency ID:
<input type ="text" name = "agencyID">
<input type = "submit" value="Add Pet">
</form> 
<br />
<a href = "index.html">Go to the main page</a>
</body>
</html>