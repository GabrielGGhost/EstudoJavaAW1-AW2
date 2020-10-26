<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de usu�rios</h1>
	
	<c:forEach var="usuario" items="${users}">
		Nome: ${usuario.nome}<br/>
		Endereco: ${usuario.endereco}<br/>
		Telefone: ${usuario.telefone}><br/>
		Email: ${usuario.email}<br/>
		<hr>
	</c:forEach>
</body>
</html>