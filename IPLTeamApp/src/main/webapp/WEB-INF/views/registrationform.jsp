<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style>
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 10px 15px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<center>
<h1 style="color:#4CAF50;"><b>IPL REGISTRATION FORM</b></h1>
<form:form method="post" action="registrationform.html"  modelAttribute="registration"
	commandName="registration">
	<table>
		<tr>
			<td>User Name:<FONT color="#AD1874"><form:errors
				path="userName" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="userName" /></td>
		</tr>

		<tr>
			<td>Password:<FONT color="#AD1874"><form:errors
				path="password" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="password" /></td>
		</tr>

		<tr>
			<td>Confirm Password:<FONT color="#AD1874"><form:errors
				path="confirmPassword" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="confirmPassword" /></td>
		</tr>

		<tr>
			<td>Email:<FONT color="#AD1874"><form:errors path="email" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td>Mobile Number:<FONT color="#AD1874"><form:errors
				path="mobile" /></FONT></td>
		</tr>
		<tr>
		
		<td><form:input path="mobile" /></td>
		<tr>
			<td><button type="submit"  class="button">Submit</td>
		</tr>
	</table>
</form:form>
</body>
</center>
</html>