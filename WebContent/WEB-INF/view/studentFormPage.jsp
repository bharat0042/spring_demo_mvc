<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processStudentFormRequestMapping" modelAttribute="student">
	
	First Name : <form:input path="firstName"/>
	
	<br><br>
	
	Last Name : <form:input path="lastName"/>
	
	<br><br>
	
	Country : <form:select path="country">
	              <form:options items="${student.countryOptions}" />
	          </form:select>

    <br><br>
    
    Favorite Language :
    
    <br><br>
    
    Java <form:radiobutton path="language" value="Java"/>
    C++ <form:radiobutton path="language" value="C++"/>
    PHP <form:radiobutton path="language" value="PHP"/>
    Go <form:radiobutton path="language" value="Go"/>
	
	<br><br>
	
	Gender :
    
    <br><br>
    
    <form:radiobuttons path="gender" items="${student.genderOptions}"/>
	
	<br><br>
	
	Operating Systems:
	
	<br><br>
	    
    <form:checkboxes path="operatingSystem" items="${student.operatingSystemsList}"/>
	
	<br><br>
	
	<input type="submit" value="Submit">
	
	</form:form>

</body>
</html>