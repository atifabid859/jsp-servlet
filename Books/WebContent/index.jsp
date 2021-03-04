<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>insert</title>
</head>
<body>
<form action="Reguist"method="post">
<table>
<tr>
<td>UserName</td>
<td><input type="text"name="name"placeholder="Enter UserName"required></td>
</tr>

<tr>
<td>Password</td>
<td><input type="Password"name="password"placeholder="Enter Password"required></td>
</tr>

<tr>
<td>Mobile Number</td>
<td><input type="text" name="mnumber"placeholder="Enter Mobile Number"required></td>
</tr>

<tr>
<td>Email</td>
<td><input type="email" name="email"placeholder="Enter Email"required></td>
</tr>
<tr>
<td><input type="submit"name="submit"value="save"></td>
</tr>

</table>
</form>
</body>
</html>