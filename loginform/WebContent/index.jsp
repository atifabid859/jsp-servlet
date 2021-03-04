<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
<a href="welcome.html">second</a>
	<form action="welcome.html">
		<table>
			<tr>
				<td>Full Name</td>
				<td><input type="text" name="fname" required="required"
					class="fname"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname" required="required"
					class="lname"></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="email" required="required"
					class="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required="required"
					class="password"></td>
			</tr>

			<tr>
				<td>Address</td>
				<td><input type="text" name="address" required="required"
					class="address"></td>
			</tr>

			<tr>
				<td>Contact No</td>
				<td><input type="text" name="contact" required="required"
					class="contact"></td>
			</tr>
			<tr>
				<td>Sex</td>
				<td><input type="radio" class="male" name="gender" value="male">male
					<input type="radio" class="male" name="gender" value="male">female
					<input type="radio" class="male" name="gender" value="male">other
				</td>
			</tr>
<tr>
<td><input type="submit"name="sign up" value="Sign Up" class="sign up"></td>
</tr>
		</table>

	</form>
</body>
</html>