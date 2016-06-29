<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head><style>
.button {
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
}
</style>
<title>All Students</title>
</head>
<body>
<h1 style="color:#4CAF50;">List Of Students</h1>
  <form action="/sdnext">
	<button type="submit"  class="button">For Home Press Here</button>
	</form>
<c:if test="${!empty students}">
	<table align="left" border="1">
		<tr>
			<th><h3 style="color:#AD9818">Student ID</h3></th>
			<th><h3 style="color:#AD9818">Student First Name</h3></th>
			<th><h3 style="color:#AD9818">Student First Name</h3></th>
			<th><h3 style="color:#AD9818">Student RollNumber</h3></th>
			<th><h3 style="color:#AD9818">Student Mobile</h3></th>
			<th><h3 style="color:#AD9818">Student Address</h3></th>
		
		</tr>

		<c:forEach items="${students}" var="student">
			<tr>
				<td><c:out value="${student.id}"/></td>
				<td><c:out value="${student.fname}"/></td>
				<td><c:out value="${student.lname}"/></td>
				<td><c:out value="${student.rnumber}"/></td>
				<td><c:out value="${student.mobile}"/></td>
				<td><c:out value="${student.address}"/></td>
				</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>