<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Confirmation Page</title>
</head>
<body>
Student confirmed : ${student.firstName} ${student.lastName}
<br><br>
Country from : ${student.country}
<br><br>
Well versed in : ${student.language}
<br><br>
Gender : ${student.gender}
<br><br>
Operating Systems :
<ul>
    <c:forEach var="temp" items="${student.operatingSystem}" >
        <li> ${temp} </li>
    </c:forEach>
</ul>
</body>
</html>