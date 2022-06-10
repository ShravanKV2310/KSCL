<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kotak Securities Clients</title>
</head>
<body>
	<h1>Add Your Client Here...</h1>
	<form action="saveClientDetails" method="post">
		<table>
			<tr>
				<td>Client Name:</td>
				<td><input type = "text" name="name" /></td>
			</tr>
			<tr>
				<td>Client Code:</td>
				<td><input type = "text" name="code" style="text-transform: uppercase;"/></td>
			</tr>
			<tr>
				<td>Client EmailId:</td>
				<td><input type = "email" name="email" /></td>
			</tr>
			<tr>
				<td>Client Contact:</td>
				<td><input type = "text" name="contact" size="10" maxlength="10"/></td>
			</tr>
			<tr>
				<td><input type = "submit" value="save" /></td>
			</tr>
		</table>
		
	</form>
	${msg}
</body>
</html>