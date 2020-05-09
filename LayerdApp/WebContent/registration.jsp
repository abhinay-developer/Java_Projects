<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<form action="registerurl" method="post">
		<h1 class="jumbotron text-center">Register here</h1>
		<div class="container">
			<div class="form-group">
				<label>Username</label> <input type="text" name="username"
					required="required" placeholder="enter userName" id="userNameId"
					class="form-control">
			</div>
			<div class="form-group">
				<label>Password</label> <input type="text" name="password"
					required="required" placeholder="enter password" id="passwordId"
					class="form-control">
			</div>
			<div class="form-group">
				<label>E-Mail</label> <input type="text" name="email"
					required="required" placeholder="enter email" id="emailId"
					class="form-control">
			</div>


			<div class="form-group">
				<label>MobileNo</label> <input type="text" name="mobileno"
					required="required" placeholder="enter mobileNo" id="mobileNoId"
					class="form-control">
			</div>
			<div class="form-group">
				<label>Address</label>
				<textarea cols="78" rows="4" name="address" required="required"
					id="addressId" class="container">
			</textarea>

			</div>

			<div class="form-group">
				<label>DateOfBirth</label> <input type="text" name="dateofbirth"
					required="required" placeholder="enter date" id="dateId"
					class="form-control">
			</div>
			<div class="form-group">
				<label>Gender</label> <input type="radio" name="gender"
					required="required" value=Male id="maleId" checked>Male <input
					type="radio" name="gender" required="required" value=female
					id="femaleId">Female
			</div>
			<div class="form-group">
				<label>Picture</label> <input type="file" name="picture"
					id="pictureId" class="form-control">
				<div class="mt-2 container">
					<input type="submit" value="Register" class="btn btn-primary">
					<input type="reset" value="Cancel" class="btn btn-primary">
				</div>
			</div>
	</form>
</body>
</html>