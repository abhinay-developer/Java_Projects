<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>register</title>
<style>
/* input[type='text'],input[type='password'],input[type='file']{
	width: 35%;
} */
</style>
</head>
<body>
	<form action="registerurl" autocomplete="off" method="post" >
		<div class="container">
			<h1>Register</h1>
			<div class="form-group">
				<label>Firstname</label> <input type="text" name="firstName"
					class="form-control" placeholder="enter userName" required="required" autocomplete="username">
			</div>
			<div class="form-group">
				<label>Lastname</label> <input type="text" name="lastName"
					class="form-control" placeholder="enter lastName" required="required" autocomplete="username">
			</div>
			<div class="form-group">
				<label>Password</label> <input type="password" name="password"
					class="form-control" placeholder="enter password" required="required" autocomplete="password">
			</div>
			<div class="form-group">
				<label>Mobileno</label> <input type="text" name="mobileNo"
					class="form-control" placeholder="enter mobileNo" required="required" autocomplete="cc-number">
			</div>
			<div class="form-group">
				<label>Email</label> <input type="text" name="email"
					class="form-control" placeholder="enter email" required="required" autocomplete="email">
			</div>
			<div class="form-group">
				<label for="textarea">Address</label>
				<textarea rows="5" name="address" class="form-control" required="required">
      
      </textarea>
			</div>
			<div class="form-group">
				<label>Gender</label><input type="radio" name="gender" value="male"
					checked="checked">Male <input type="radio" name="gender"
					value="female">female
			</div>
			<div class="form-group">
				<label>UploadResume</label><input type="file" name="image"
					class="form-control-file">
			</div>
			<div class="mt-4 form-group">
				<button type="reset" class="btn btn-info">Reset</button>
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</div>
	</form>
</body>
</html>