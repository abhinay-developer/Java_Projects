<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>company</title>
</head>
<body>
	<form action="companyurl" autocomplete="off" method="post">
		<div class="container">
			<h1>Company Registration</h1>
			
			<div class="form-group">
				<label>CompanyName</label> <input type="text" name="companyName"
					class="form-control" placeholder="enter companyName"
					required="required" autocomplete="companyName">
			</div>
			<div class="form-group">
				<label>Password</label> <input type="password" name="password"
					class="form-control" placeholder="enter password"
					required="required" autocomplete="password">
			</div>
			<div class="form-group">
				<label>Mobileno</label> <input type="text" name="mobileNo"
					class="form-control" placeholder="enter mobileNo"
					required="required" autocomplete="cc-number">
			</div>
			<div class="form-group">
				<label>Email</label> <input type="text" name="email"
					class="form-control" placeholder="enter email" required="required"
					autocomplete="email">
			</div>
			<div class="form-group">
				<label for="textarea">Address</label>
				<textarea rows="5" name="address" class="form-control"
					required="required">
      
      </textarea>
			</div>
			<div class="mt-4 form-group">
				<button type="reset" class="btn btn-info">Reset</button>
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</div>
	</form>
</body>
</html>