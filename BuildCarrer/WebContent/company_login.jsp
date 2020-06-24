<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>login</title>
</head>
<body>
	<form action="companyloginurl" method="post" >
		<div class="container">
		<h1 class="text-primary text-center">Login</h1>
			<div class="form-group">
				<label for="username">Username</label> <input type="text"
					name="companyName" placeholder="enter companyName" class="form-control">
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
					href="company_register.jsp">Copmany Register</a>
			</div>
		</div>
	</form>
</body>
</html>