<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title></title>
<style>
header {
	text-align: center;
}

table {
	width: 100%;
	border-style: solid;
	column-width: 200px
}

.error {
	color: red;
}
</style>
</head>


<body>
	<header>ACCOUNT OPENING FORM</header>
	<hr>
	
	
	
	
	<table>
		<form:form action="processForm" modelAttribute="accountOpeningDetails">
			<tr>
				<td>Application Date : <form:input type="date"
						path="applicationDate" />
				</td>
			</tr>

			<tr>

				<td>Prefix : <form:select path="prefix">
						<form:options items="${accountOpeningDetails.prefixOptions }" />
					</form:select></td>
				<td>First Name : <form:input path="firstName" /> <form:errors
						path="firstName" cssClass="error"></form:errors></td>
				<td>Middle Name : <form:input path="middleName" /></td>
				<td>Surname : <form:input path="surname" /> <form:errors
						path="surname" cssClass="error"></form:errors>
				</td>
			</tr>

			<tr>
				<td>Nationality : <form:input path="nationality" /></td>
				<td>Pan NO : <form:input path="panNo" /> <form:errors
						path="panNo" cssClass="error"></form:errors></td>
				<td>Aadhaar Card No : <form:input path="aadhaarCardNo" /> <form:errors
						path="aadhaarCardNo" cssClass="error"></form:errors>
				</td>
			</tr>

			<tr>
				<td>Date Of Birth : <form:input type="date" path="dateOfBirth" />
					<form:errors path="dateOfBirth" cssClass="error"></form:errors></td>
				<td>Sex : <form:select path="sex">
						<form:options items="${accountOpeningDetails.sexOptions}" />
					</form:select>
				</td>
				<td>Mother Maiden Name : <form:input path="motherMaidenName" />
					<form:errors path="motherMaidenName" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Postal Code : <form:input path="postalCode" /> <form:errors
						path="postalCode" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Branch Code : <form:input path="branchCode" /> <form:errors
						path="branchCode" cssClass="error"></form:errors>
				</td>
			</tr>

			<tr>
				<td><input style="left: 30%" type="submit" value="Submit"></td>
			</tr>
		</form:form>
	</table>

	<footer> </footer>
</body>
</html>