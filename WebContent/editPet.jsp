<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Pet</title>
</head>
<body>
<form action = "editPetServlet" method="post">
Species: 
<input type ="text" name = "species" value="${itemToEdit.species}">
<br />
Breed: 
<input type = "text" name = "breed" value= "${itemToEdit.breed}">
<br />
Name: 
<input type = "text" name = "name" value= "${itemToEdit.name}">
<br />
Age: 
<input type = "text" name = "age" value= "${itemToEdit.age}">
<br />
Date Sheltered: 
<input type="text" name="month" placeholder="mm" size="4" value= "${itemToEdit.month}"> 
		<input type="text" name="day" placeholder="dd" size="4" value= "${itemToEdit.day}"> 
		<input type="text" name="year" placeholder="yyyy" size="4" value = "${itemToEdit.year}">
		<br />
<input type = "hidden" name = "id" value="${itemToEdit.petID}">
<input type = "submit" value="Save Edited Item">
</form>
</body>
</html>