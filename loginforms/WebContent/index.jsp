<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<form action="LoginDao" method="post">
		<fieldset style="width: 300px">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname" required="required"></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><input type="email" name="email" required="required"></td>
				</tr>



				<tr>
					<td>Password</td>
					<td><input type="password" name="pass" required="required"></td>
				</tr>
				<tr>
					<td><button type="submit">Login</button></td>
				</tr>
			</table>
		</fieldset>
	</form>

</body>
</html>