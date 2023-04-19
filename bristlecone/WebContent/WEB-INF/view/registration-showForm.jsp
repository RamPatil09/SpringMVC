<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>Employee Registration Form</title>
<style>
form {
	top: 10%;
	left: 37%;
	border-style: solid;
	background-color: silver;
	position: absolute;
	border-style: solid;
	left: 37%;
}
</style>
</head>

<body>


	<form:form action="processForm" modelAttribute="employeeDetails"
		cssStyle="formProcess">
		<h1 style="background-color: olive;">Employee Registration Form</h1>
		First name : <form:input path="firstName"
			placeholder="Enter your First Name" />
		<br>
		<br>
		Last Name : <form:input path="lastName"
			placeholder="Enter your Last Name" />
		<br>
		<br>
		Blood Group : <form:select path="bloodGroup">
			<form:options items="${employeeDetails.bloodGroupOptions }" />
		</form:select>
		<br>
		<br>
		Contact number : <form:input path="contactNumber"
			placeholder="Enter your Contact Number" />
		<br>
		<br>
		Job Experience :
		<br>
		<br> 
		Fresher<form:radiobutton path="workExperience" value="Fresher" />
		Experienced<form:radiobutton path="workExperience" value="Experienced" />
		<br>
		<br>
		Favorite Language : 
		JAVA<form:checkbox path="favoriteLanguages" value="JAVA" />
		C#<form:checkbox path="favoriteLanguages" value="C#" />
		Kotlin<form:checkbox path="favoriteLanguages" value="Kotlin" />
		C++<form:checkbox path="favoriteLanguages" value="C++" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>


</html>