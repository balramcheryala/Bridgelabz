<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body bgcolor="lightgrey">
<h1 style="color:blue;">Your login success ...! </h1>
<p><h3 style="color:green;">Welcome ${loginForm.userName}</h3>
<form action="/StudentForm">
<button type="submit">Click Here for  Home </button>
</form>
</body>
</html>