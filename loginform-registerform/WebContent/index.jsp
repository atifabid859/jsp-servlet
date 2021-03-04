<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Registration Form</h1>
<form action="Firstservlet"method="post">
<table>
<tr>
<td>Name:</td>
<td><input type="text"name="name" placeholder="Enter the Name" required="required"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text"name="email"></td>
</tr>
<tr>
<td>Password:</td><br>
<td><input type="password"name="password"></td>
</tr>
<tr>
<td>Confirm Password:</td>
<td><input type="confirmpassword"name="confirmpassword">
</td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
</tr>
</table>
</form>
</body>
</html>