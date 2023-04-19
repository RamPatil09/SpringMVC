<!DOCTYPE html>
<html>

<head>
<title>Applicant Details</title>

</head>

<body>
	<table>
		<tr>
			<td>Application Date : ${accountOpeningDetails.applicationDate }</td>
		</tr>
		<tr>
			<td>Applicant Full Name : ${accountOpeningDetails.prefix}
				${accountOpeningDetails.firstName.toUpperCase()}
				${accountOpeningDetails.middleName.toUpperCase()}
				${accountOpeningDetails.surname.toUpperCase()}</td>
		</tr>
		<tr>
			<td>Nationality :
				${accountOpeningDetails.nationality.toUpperCase()}</td>
			<td>Pan No : ${accountOpeningDetails.panNo}</td>
		</tr>
		<tr>
			<td>Aadhaar Card No : ${accountOpeningDetails.aadhaarCardNo}</td>
		</tr>
		<tr>
			<td>Date Of Birth : ${accountOpeningDetails.dateOfBirth}</td>
			<td>Sex : ${accountOpeningDetails.sex.toUpperCase()}</td>
		</tr>

		<tr>
			<td>Mother Maiden Name :
				${accountOpeningDetails.motherMaidenName.toUpperCase()}</td>
		</tr>
		<tr>
			<td>Branch Code :
				${accountOpeningDetails.branchCode.toUpperCase()}</td>
		</tr>
	</table>
</body>

</html>