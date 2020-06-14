<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>
	<form action="registerurl" method="post">
		<div class="container">
			<h1>Register</h1>
			<div class="form-group">
				<label>Firstname</label> <input type="text" name="firstName"
					class="form-control" placeholder="enter userName">
			</div>
			<div class="form-group">
				<label>Lastname</label> <input type="text" name="lastName"
					class="form-control" placeholder="enter lastName">
			</div>
			<div class="form-group">
				<label>Password</label> <input type="password" name="password"
					class="form-control" placeholder="enter password">
			</div>
			<div class="form-group">
				<label>Mobileno</label> <input type="text" name="mobileNo"
					class="form-control" placeholder="enter mobileNo">
			</div>
			<div class="form-group">
				<label>Email</label> <input type="text" name="email"
					class="form-control" placeholder="enter email">
			</div>
			<div class="form-group">
				<label for="textarea">Address</label>
				<textarea rows="12" cols="6" name="address" class="container">
      
      </textarea>
			</div>
			<div class="form-group">
				<label>Gender</label><input type="radio" name="gender" value="male">Male
				<input type="radio" name="gender" value="female">female
			</div>
			<div class="form-group">
				<label>UploadResume</label><input type="file" name="image"
					class="form-control">
			</div>
			<div class="mt-4 form-group">
				<button type="reset" class="btn btn-info">Reset</button>
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</div>
	</form>
</body>
</html>