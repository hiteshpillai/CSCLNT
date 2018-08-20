<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Sign Up</title>
</head>
<body>
<b><u><h1>Customer </h1><h3>Sign Up</h3></u></b>
	<form:form method="POST" action="/CustSignUp" modelAttribute="customer">
		<table>
			<tr>
				<td><form:label path="Name">Name : </form:label></td>
				<td><form:input path="Name" /></td>
			</tr>
			<tr>
				<td><form:label path="CustId">Customer ID : </form:label></td>
				<td><form:input path="CustId" /></td>
			</tr>
			<tr>
				<td><form:label path="ContactNum">Contact Number : </form:label></td>
				<td><form:input path="ContactNum" /></td>
			</tr>
			<tr>
				<td><form:label path="HouseNum">House Number : </form:label></td>
				<td><form:input path="HouseNum" /></td>
			</tr>
			<tr>
				<td><form:label path="City">City : </form:label></td>
				<td><form:input path="City" /></td>
			</tr>
			<tr>
				<td><form:label path="State">State : </form:label></td>
				<td><form:input path="State" /></td>
			</tr>
			<tr>
				<td><form:label path="BankAccntNum">Bank Account Number : </form:label></td>
				<td><form:input path="BankAccntNum" /></td>
			</tr>
			<tr>
				<td><form:label path="Password">Password</form:label></td>
				<td><form:input path="Password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>