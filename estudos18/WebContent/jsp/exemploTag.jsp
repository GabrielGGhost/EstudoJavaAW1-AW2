<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="gc" tagdir="/WEB-INF/tags/"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo de Tag File</title>
</head>
<body>
	<h1>Página inicial</h1>
	<gc:saudacao nome="${param.txtNome}" sexo="${param.btSexo}"/>
</body>
</html>