<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>

<title>Student Registration Form</title>

</head>

<body>

	<h2>Student Registration Form</h2>
	<form:form action="processForm" modelAttribute="student">

		First Name : <form:input path="firstName" />
		<br>
		<br>
		Last Name : <form:input path="lastName" />
		<br>
		<br>
		Age : <form:input path="age" />
		<br>
		<br>
		Email : <form:input path="email" />
		<br>
		<br>
		Blood Group : <form:input path="bloodGroup" />
		<br>
		<br>
		Phone Number : <form:input path="phoneNumber" />
		<br>
		<br>
		Country: <form:select path="country">
			<form:options items="${student.countryOptions }" />
		</form:select>
		<br>
		<br>
		Favorite Programming Language :
		<br>
		<br>
		Java<form:radiobutton path="favoriteLanguage" value="Java" />
		C#<form:radiobutton path="favoriteLanguage" value="C#" />
		PHP<form:radiobutton path="favoriteLanguage" value="Php" />
		Python<form:radiobutton path="favoriteLanguage" value="Python" />
		<br>
		<br>
		Favorite Operating Systems : 
		<br>
		Windows<form:checkbox path="favroiteOS" value="Windows" />
		Linux<form:checkbox path="favroiteOS" value="Linux" />
		Mac<form:checkbox path="favroiteOS" value="Mac" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>

</html>