<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Client</title>
</head>
<body>
	<h1>Update Client Here...</h1>
	<form action="updateClientDetails" method="post">
		<table>
			<tr>
				<td>Client Id:</td>
				<td><input type="text" name="id" value="${client.id}"readonly></td>
			</tr>
			<tr>
				<td>Client Name:</td>
				<td><input type="text" name="name" value="${client.name}"/></td>
			</tr>
			<tr>
				<td>Client Code:</td>
				<td><input type="text" name="code" value="${client.code}"/></td>
			</tr>
			<tr>
				<td>Client EmailId:</td>
				<td><input type="text" name="email" value="${client.email}"/></td>
			</tr>
			<tr>
				<td>Client Contact:</td>
				<td><input type="text" name="contact" value="${client.contact}"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="update" /></td>
			</tr>
		</table>
		
	</form>
	${msg}
</body>
</html>