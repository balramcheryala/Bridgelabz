<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>CRUD OPERATIONS</title>
  </head>
  <body>
  <body bgcolor=white>
    <h1 style="color:#4CAF50;">Hibernate in Spring framework to do the data manipulation in MySQL database</h2></h1>
    <h1 style="color:#AD9818;">Choose Your Option</h1>
    <form action="add.html">
	<button type="submit"  class="button">1.Add Student</button>
	</form>
	<form action="students.html">
	<button type="submit"  class="button">2.View Student</button>
	</form>
	<form action="update.html">
	<button type="submit"  class="button">3.Update Student</button>
	</form>
	<form action="deleteop.html">
	<button type="submit"  class="button">4.Delete Student</button>
	</form>
  </body>
</html>