<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Phase 2 project Registration</title>
</head>
<body>
	<p>Register</p>
	<form action="/register" method=post>
		<p>Enter Name</p>
		<input type="text" name="name" />
		<p>Enter a Username</p>
		<input type="text" name="username" />
		<p>Create a Password</p>
		<input type="text" name="password" /> </br>
		<button type="submit">Submit</button>
	</form>
	<a href="/login">Login Here</a>

</body>
</html>