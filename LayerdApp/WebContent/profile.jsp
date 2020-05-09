<%@page import="java.io.PrintWriter"%>
<%@page import="com.abhi.dto.RegisterDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>userprofile</title>
</head>
<body>
<% 
PrintWriter pw=response.getWriter();
 
RegisterDTO userdetails=(RegisterDTO)request.getAttribute("userdetails");
 pw.println(userdetails);


%>
</body>
</html>