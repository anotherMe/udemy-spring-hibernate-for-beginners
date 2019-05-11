<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer confirmation</title>
</head>
<body>
	<p>The customer is confirmed: ${customer.firstName} ${customer.lastName}</p>
	<p>Free passes: ${customer.freePasses}</p>
	<p>Postal code: ${customer.postalCode}</p>
	<p>Course code: ${customer.courseCode}</p>
</body>
</html>