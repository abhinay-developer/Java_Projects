<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>login</title>
</head>
<body>
	<form action="loginurl" method="post">
		<div class="container">
			<div class="form-group">
				<label for="username">Username</label> <input type="text"
					name="userName" placeholder="enter userName" class="form-control">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					name="password" placeholder="enter password" class="form-control">
			</div>
			<div class="mt-4 conatiner">
				<button type="reset" class="btn btn-info">Reset</button>
				<button type="submit" class="btn btn-primary">Login</button>
			</div>
			<div class="container">
				If You Don't Have An Account Register Here? <a
					href="user_register.jsp">Register</a>
			</div>
		</div>
	</form>
</body>
</html>