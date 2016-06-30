<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	  <head><style>
button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}</style>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Creat Update Delete Retrive </title>
	</head>
	<body>
		<h1 style="color:#4CAF50">Edit Student Data</h1>
		<form:form method="POST" action="/sdnext/editsave.html">
	   		<table>
			    <tr>
			        <td><form:label path="id">Student ID:</form:label></td>
			        <td><form:input path="id" value="${student.id}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="fname">Student FirstName:</form:label></td>
			        <td><form:input path="fname" value="${student.fname}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="lname">Student LastName:</form:label></td>
			        <td><form:input path="lname" value="${student.lname}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="rnumber">Student RollNumber:</form:label></td>
			        <td><form:input path="rnumber" value="${student.rnumber}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="mobile">Student Mobile:</form:label></td>
			        <td><form:input path="mobile" value="${student.mobile}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="address">Student Address:</form:label></td>
                    <td><form:input path="address" value="${student.address}"/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><button type="submit"  class="button">Sumbit</td>
		      </tr>
			</table> 
		</form:form>
		
</body>
</html>