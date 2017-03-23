<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student"> <!-- student muss gleich sein wie im Model vom Controller -->
		
		First name: <form:input path="firstName"/> <!-- property of Student class, calls getter -->
		<br /> <br />
		Last name: <form:input path="lastName"/>
		<br /> <br />
		
		Country:<!-- call student.setCountry -->
		<form:select path="country"> 
		
			<form:options items="${student.countryOptions}" /> <!-- collection of data -->
			
		</form:select>
		
		<br /> <br />
		
		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
		
		<br /> <br />
		
		Favorite Operating Systems
		
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		
		<br /> <br />
		
		<input type="submit" value="Submit"> <!-- calls setter of Student class -->
		
	</form:form>

</body>


</html>