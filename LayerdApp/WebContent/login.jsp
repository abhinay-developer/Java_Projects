<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body>
<form action="loginurl" method="POST">
<div class="container">
		<h1 class="jumbotron text-center">Login</h1>
		<div class="form-group">
			<label>UserName</label> <input type="text" name="username"
				required="required" placeholder="enter username" id="usernameId" class="form-control">
		</div>
		<div class="form-group">
			<label>Password</label> <input type="password" name="password"
				required="required" placeholder="enter password" id="passwordId" class="form-control">
			<div class="mt-2 container">
				<input type="submit" value="LOGIN" class="btn btn-primary">
			</div>
			<div class="container">
				<span>CreateAccount?</span> <a href="registration.jsp">Register</a>
			</div>
		</div>
	</div>
	</form>
</body>
</html>