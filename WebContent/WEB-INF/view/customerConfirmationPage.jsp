<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmation Page</title>
</head>
<body>
The customer confirmed is : ${customer.firstName}  ${customer.lastName}
<br><br>
Free passes : ${customer.freePass}
<br><br>
Postal code : ${customer.postalCode}
<br><br>
Postal code : ${customer.courseCode}
</body>
</html>