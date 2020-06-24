<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>index</title>
<style>
img {
	width: 100%;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% auto;
	display: block;
}

.container {
	position: relative;
	text-align: center;
	color: white;
}
/* Centered text */
.up {
	position: absolute;
	top: 40%;
	left: 40%;
	transform: translate(-40%, -40%);
}

.centered {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}

div a {
	text-decoration: none;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp" />
	<section>
		<img alt="image" src="images/image1-min.jpg">
		<div class="up">
			<h3>Are You Registered login here?</h3>
		</div>
		<div class="centered">
			<a href="user_login.jsp">LOGIN</a>
		</div>
	</section>
	<jsp:include page="footer.html" />
</body>
</html>