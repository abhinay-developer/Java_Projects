<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<form action="loginurl" method="POST">
<div class="container">
		<h1>Admin Login</h1>
		<div class="container">
			<label>UserName</label> <input type="text" name="username"
				required="required" placeholder="enter username" id="usernameId">
		</div>
		<div class="container">
			<label>Password</label> <input type="password" name="password"
				required="required" placeholder="enter password" id="passwordId">
			<div class="container">
				<input type="submit" value="LOGIN">
			</div>
			<div class="container">
				<span>CreateAccount?</span> <a href="registration.jsp">Register</a>
			</div>
		</div>
	</div>
	</form>
</body>
</html>