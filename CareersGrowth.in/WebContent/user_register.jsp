<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<title>user registration</title>
</head>
<body>
	<form action="registerurl" autocomplete="off">
		<div class="container">
			<h1>Register</h1>
			<div class="form-group">
				<label for="firstName">First Name</label> <input type="text"
					name="firstName" id="firstNameId" placeholder="enter firstName"
					required="required" class="form-control">
			</div>
			<div class="form-group">
				<label for="lastName">Last Name</label> <input type="text"
					name="lastName" id="lastNameId" placeholder="enter lastName"
					required="required" class="form-control">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					name="password" id="passwordId" placeholder="enter password"
					required="required" class="form-control">
			</div>
			<div class="form-group">
				<label for="email">Email</label> <input type="email" name="email"
					id="emailId" placeholder="enter email" required="required"
					class="form-control">
			</div>
			<div class="form-group">
				<label for="mobileNo">MobileNo</label> <input type="text"
					name="mobileNo" id="mobileNoId" placeholder="enter mobileNo"
					required="required" class="form-control">
			</div>
			<div class="form-group">
				<label for="address">Address</label>
				<textarea rows="6" cols="3" required="required" name="address" class="form-control">
			</textarea>
			</div>

			<div class="form-group">
				<label for="gender">Gender</label> <input type="radio" name="gender"
					id="maleId" value="male" checked="checked">Male<input type="radio"
					name="gender" id="femaleId" value="female">Female
			</div>
			<div class="form-group">
				<label for="uploadResume">UploadResume</label> <input type="file"
					name="uploadResume" id="uploadResumeId" class="form-file">
			</div>
			<div class="form-group">
				<button type="reset" class="btn btn-info">RESET</button>
				<button type="submit" class="btn btn-primary">REGISTER</button>
			</div>
		</div>
	</form>
</body>
</html>