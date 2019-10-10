<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
Agencies:<br />

<select name="addAgencyServlet" multiple size="6">
<c:forEach items="${requestScope.allItems}" var="currentitem">
   <option value = "${currentitem.id}">${currentitem.agencyName} | ${currentitem.agencyPhone}</option>
</c:forEach>
</select>
<br />
<input type = "submit" value="Create List and Add Items">
</form>
<a href = "index.html">Go add new items instead.</a>
</body>
</html>