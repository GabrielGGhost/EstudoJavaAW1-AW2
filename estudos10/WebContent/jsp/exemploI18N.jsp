<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teste de i18n com JSTL</title>
</head>
<body>
	<h1>Teste JSTL fmt - i18n</h1>
	Localização selecionada = ${param.language} <br/>
	<fmt:setLocale value="${param.language}"/>
		<fmt:bundle basename="com.estudo.bundles.${param.language}" prefix="Login.">
			<fmt:message key="mensagem.boasvindas"> </fmt:message>
		</fmt:bundle>  
</body>
</html>