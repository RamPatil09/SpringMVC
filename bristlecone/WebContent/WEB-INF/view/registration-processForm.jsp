<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>

<head>
<title>Employee Details</title>
<style>
.body1 {
	text-align: center; top : 10%;
	left: 37%;
	border-style: solid;
	position: absolute;
	width: 300px;
	top: 10%;
}
</style>
</head>

<body class="body1">

	<h2>Registered Details</h2>
	<br>
	<br> First Name : ${employeeDetails.firstName }
	<br>
	<br> Last Name : ${employeeDetails.lastName }
	<br>
	<br> Blood group : ${employeeDetails.bloodGroup }
	<br>
	<br> Contact Number : ${employeeDetails.contactNumber }
	<br>
	<br> Work Experience : ${employeeDetails.workExperience }
	<br>
	<br> Favorite Languages :
	<ul>
		<c:forEach var="temp" items="${employeeDetails.favoriteLanguages}">

			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>

</html>