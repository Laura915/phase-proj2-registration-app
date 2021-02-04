<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<p>Login</p>
	<form action="/login" method=post>
		<p>Enter Name</p>
		<input type="text" name="name" />
		<p>Enter Username</p>
		<input type="text" name="username" />
		<p>Enter Password</p>
		<input type="text" name="password" /> </br>
		<button type="submit">Submit</button>
	</form>
	<a href="/register">Register Here</a>
</body>
</html>