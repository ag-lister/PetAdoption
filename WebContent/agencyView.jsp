<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Agencies</title>
</head>
<body>
<form method = "post" action = "agencyNavigationServlet">
<table>
<tr>
<td> </td>
<td><u>Name</u></td>
<td><u>Address</u></td>
<td><u>Phone</u></td>
<td><u>Email</u></td>
</tr>
<c:forEach items="${requestScope.allItems}" var="currentitem">
<tr>
 <td><input type="radio" name="id" value="${currentitem.agencyID}"></td>
 <td>${currentitem.agencyName}</td>
 <td>${currentitem.agencyAddress}</td>
 <td>${currentitem.agencyPhone}</td>
 <td>${currentitem.agencyEmail}</td>
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