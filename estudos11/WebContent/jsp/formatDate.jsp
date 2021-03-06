<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo formatDate</title>
</head>
<body>
	<h1>Exempolo JSTL fmt - formatDate</h1>
	
	<%
		pageContext.setAttribute("agora", new java.util.Date());
	%>
	
	<b>Agora, time and date(both) - timeStyle = full, dateStyle=full</b><br/>
	<fmt:formatDate value="${agora}" type="both" timeStyle="full" dateStyle="full"/> <br><br>
	
	<b>Agora, date , dateStyle=medium</b><br/>
	<fmt:formatDate value="${agora}" type="date" dateStyle="medium"/> <br><br>
</body>
</html>