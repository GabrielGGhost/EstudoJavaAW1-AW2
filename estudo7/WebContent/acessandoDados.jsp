<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Map, java.util.HashMap"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Map pref = new HashMap();
		pref.put("idioma", "portugues");
		String nomeChave = "idioma";
		request.setAttribute("preferencias", pref);
		request.setAttribute("chave", nomeChave);
	%>
	
	Via operador[]: O idioma de prefer�ncia � ${preferencias["idioma"]} <br>
	Via operador . : O idioma de prefer�ncia � ${preferencias.idioma} <br>
	Via operador [] e par�metro vari�vel : O idioma de prefer�ncia � ${preferencias[chave]} <br>

</body>
</html>