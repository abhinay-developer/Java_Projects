<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css" />
<title>addproducts</title>
</head>
<body>
	<form action="addproductsurl" method="POST">
		<div class="container">
			<h1 class="jumbotron text-center">AddProducts</h1>
			<div class="container">
				<label>Heading</label> <input type="text" name="heading"
					required="required" placeholder="enter heading" id="headingId"
					class="form-control">
			</div>
			<div class="container">
				<label>Searchkeyword</label> <input type="text" name="searchkeyword"
					required="required" placeholder="enter searchkeyword"
					id="searchkeywordId" class="form-control">
			</div>
			<div class="container">
				<label>Description</label> <input type="text" name="description"
					required="required" placeholder="enter description"
					id="descriptionId" class="form-control">
				<div class="mt-2 container">
					<input type="submit" value="ADD" class="btn btn-primary">
					<input type="reset" value="Cancel" class="btn btn-primary">
				</div>
			</div>
		</div>
	</form>
</body>
</html>