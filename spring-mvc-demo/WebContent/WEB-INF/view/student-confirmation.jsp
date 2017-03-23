<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

	The student is confirmed: ${student.firstName} ${student.lastName} <br />
	from ${student.country} <!-- calls student.getCountry --> <br />
	his favorite Language is: ${student.favoriteLanguage} <br />
	Operating Systems: 
	<ul>
		<c:forEach var="current" items="${student.operatingSystems}">
		<!-- loops through student.getOperatingSystems, current is current item -->
			<li>${current}</li>
		</c:forEach>
	</ul>
	
	

</body>


</html>