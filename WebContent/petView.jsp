<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Pets</title>
</head>
<body>
<form method = "post" action = "petNavigationServlet">
<table>
<tr>
<td> </td>
<td><u>Species</u></td>
<td><u>Breed</u></td>
<td><u>Name</u></td>
<td><u>Age</u></td>
<td><u>Date Sheltered</u></td>
<td><u>Agency Name</u></td>
<td><u>Agency Phone Number</u></td>
</tr>
<c:forEach items="${requestScope.allItems}" var="currentitem">
<tr>
 <td><input type="radio" name="id" value="${currentitem.petID}"></td>
 <td>${currentitem.species}</td>
 <td>${currentitem.breed}</td>
 <td>${currentitem.name}</td>
  <td>${currentitem.age}</td>
  <td>${currentitem.dateSheltered}</td>
  <td>${currentitem.agency.getAgencyName()}</td>
   <td>${currentitem.agency.getAgencyPhone()}</td>
 </tr>
</c:forEach>
</table>
<input type = "submit" value = "edit" name="doThisToItem">
<input type = "submit" value = "delete" name="doThisToItem">
<input type="submit" value = "add" name = "doThisToItem">
</form>
<a href = "index.html">Go to the main page</a>
</body>
</html>