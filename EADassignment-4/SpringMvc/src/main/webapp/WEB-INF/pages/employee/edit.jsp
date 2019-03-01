<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Login</title>
</head>
<body>
<%@include file="../partials/header.html" %>
	<form action="../update" method="post">
		<span>ID</span><input type="text" name="id" required value="${employee.id}"  readonly="readonly"/><br>
		<span>First Name</span><input type="text" name="firstName" value="${employee.firstName}" required /><br>
		<span>Last Name</span><input type="text" name="lastName" value="${employee.lastName}" required /><br>
		<span>Email Id</span><input type="text" name="email" required value="${employee.email}" /><br>
		<span>Contact Number</span><input type="text" name="contact" value="${employee.contact}"required /><br> 
		
		 <input type="submit" value="submit">
	</form>
</body>
</html>