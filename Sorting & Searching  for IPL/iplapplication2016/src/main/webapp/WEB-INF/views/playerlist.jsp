<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DD Player List</title>
</head>
<style>
table {
  font-family: 'Arial';
  margin: 25px auto;
  border-collapse: collapse;
  border: 1px solid #eee;
  border-bottom: 2px solid #00cccc;
  box-shadow: 0px 0px 20px rgba(0,0,0,0.10),
     0px 10px 20px rgba(0,0,0,0.05),
     0px 20px 20px rgba(0,0,0,0.05),
     0px 30px 20px rgba(0,0,0,0.05);
  tr {
     &:hover {
      background: #f4f4f4;
      
      td {
        color: #555;
      }
    }
  }
  th, td {
    color: #999;
    border: 1px solid #eee;
    padding: 12px 35px;
    border-collapse: collapse;
  }
  th {
    background: #00cccc;
    color: #fff;
    text-transform: uppercase;
    font-size: 12px;
    &.last {
      border-right: none;
    }
  }
} -->
</style>
</head>
<body>
	<form action="playerlist" method="post">
		<table border="1" cellpadding="2" width="70%">
			<tr>
				<th><a href="search?by=name&q=">NAME</a></th>
				<th><a href="search?by=role&q=">ROLE</a></th>
				<th><a href="search?by=batting&q=">BATTING</a></th>
				<th><a href="search?by=bowler&q=">BOWLING</a></th>
				<th><a href="search?by=nation&q=">NATION</a></th>
				<th><a href="search?by=dob&q=">DATE OF BIRTH</a></th>
			</tr>
			<c:forEach var="playerlist" items="${playerlist}">

				<tr>
					<td>${playerlist.name}</td>
					<td>${playerlist.role}</td>
					<td>${playerlist.batting}</td>
					<td>${playerlist.bowler}</td>
					<td>${playerlist.nation}</td>
					<td>${playerlist.dob}</td>

					<%-- <td><a href="editemp/${playerlist.id}">Edit</a></td>
<td><a href="deleteemp/${search?by=dob&q=}">Delete</a></td> --%>
				</tr>

			</c:forEach>
		</table>
		<br />
		</form>
</body>
</html>