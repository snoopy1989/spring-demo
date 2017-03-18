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
		
			<form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="India" label="India" />
		
		</form:select>
		
		<br /> <br />
		<input type="submit" value="Submit"> <!-- calls setter of Student class -->
		
	</form:form>

</body>


</html>