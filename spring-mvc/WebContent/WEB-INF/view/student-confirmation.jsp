<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>Student Confirmation</title>
</head>


<body>

	<h3>Confirmed Students</h3>

	First Name : ${student.firstName }
	<br>
	<br> Last Name : ${student.lastName }
	<br>
	<br> Age : ${student.age }
	<br>
	<br> Email : ${student.email }
	<br>
	<br>Blood Group : ${student.bloodGroup }
	<br>
	<br>Phone Number : ${student.phoneNumber }
	<br>
	<br>Country : ${student.country }
	<br>
	<br>Favorite Programming Language : ${student.favoriteLanguage }
	<br>
	<br>Favorite Operating Systems :
	<ul>
		<c:forEach var="temp" items="${student.favroiteOS }">
			<li>${temp}</li>
		</c:forEach>
	</ul>


</body>

</html>