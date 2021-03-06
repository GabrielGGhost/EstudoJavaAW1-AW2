<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Format Number</title>
</head>
<body>
	<h1>Exemplo JSTL fmt - formatNumber</h1>
	
	<br>
	value = 1234567, grouping = false, minFractionDigit=2 ===>
	<fmt:formatNumber value="1234567" groupingUsed="false" minFractionDigits="2"/>
	
		<br>
	value = 1234567, grouping = false, minFractionDigit=3 ===>
	<fmt:formatNumber value="1234567" groupingUsed="false" minFractionDigits="3"/>
	
		<br>
	value = 1234567, grouping = true, minFractionDigit=2 ===>
	<fmt:formatNumber value="1234567" type="currency" groupingUsed="true" minFractionDigits="2"/>
	
		<br>
	value = 1234567, grouping = false, minFractionDigit=2 ===>
	<fmt:formatNumber value="1234567" type="percent" groupingUsed="false" minFractionDigits="2"/>
</body>
</html>