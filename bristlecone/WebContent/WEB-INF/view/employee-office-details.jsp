<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Employee Office Details</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h2>Employee Office Details</h2>
	<form:form action="processForm" modelAttribute="employeeOfficeDetails">
	Employee Name : <form:input path="name" />
		<br>
		<br>
		Office Email : <form:input path="officeMail" />
		<form:errors path="officeMail" cssClass="error" />
		<br>
		<br>Employee ID : <form:input path="employeeId" />
		<form:errors path="employeeId" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>