<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Phase 2 project Registration</title>
</head>
<body>
	<form action="register.jsp" method=post>
		<p>Enter Name</p>
		 <input type="text" name="name" />
		 <p>Enter a Username</p>
		 <input type="text" name="username" />
		 <p>Create a Password</p>
		 <input type="text" name="password" />
	</form>
</body>
</html>