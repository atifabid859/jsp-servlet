<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ValidationForm">
		<table cellspacing="0" cellpadding="2" width="60%" border="1"
			align="center">
			<tr>
				<th colspan="2" bgcolor="black" style="color:white">Validation Form</th>
			</tr>
			<tr>
				<th>Username :</th>
				<th><input type="text" name="username">
			</tr>
			<tr>
				<th>Password :</th>
				<th><input type="text" name="password">
			</tr>
			<tr>
				<th>Confirm Password :</th>
				<th><input type="text" name="conf_password">
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">Save</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

