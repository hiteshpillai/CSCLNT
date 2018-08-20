<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Sign Up</title>
</head>
<body>
	<form:form method="POST" action="/CustSignUp" modelAttribute="customer">
		<form:label path="c_name">Name</form:label>
		<form:input path="c_name" />

		<form:label path="c_email">Email</form:label>
		<form:input path="c_email" />

		<form:label path="c_password">Password</form:label>
		<form:input path="c_password" />

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>