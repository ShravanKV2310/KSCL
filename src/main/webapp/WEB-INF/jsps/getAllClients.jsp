<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Clients</title>
</head>
<body>
	<h1>All Clients</h1>
	<table border='1'>
		<tr>
			<th>Client Id</th>
			<th>Client Name</th>
			<th>Client Code</th>
			<th>Client EmailId</th>
			<th>Client Contact</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
			<c:forEach items="${clients}" var="client">
				<tr>
					<td>${client.id }</td>
					<td>${client.name }</td>
					<td>${client.code }</td>
					<td>${client.email }</td>
					<td>${client.contact }</td>
					<td><a href="updateClient?id=${client.id }">update</a></td>
					<td><a href="deleteClient?id=${client.id }">delete</a></td>
				</tr>
			</c:forEach>
	</table>
	
</body>
</html>