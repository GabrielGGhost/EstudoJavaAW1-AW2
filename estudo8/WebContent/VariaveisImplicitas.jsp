<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo Vari�veis EL</title>
</head>
<body>
	<form method="post" action="VariaveisImplicitas.jsp">
		<table border=1>
			<tr>
				<td>
					Obtendo acesso � se��o atrav�s de pageContex<br>
					Session ID: ${pageContext.session.id}
				</td>
			</tr>
			<tr>
				<td>
					Obtendo acesso ao ServletContext atrav�s de OageContext<br>
					Server Info: ${pageContext.servletContext }
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<th>Teste de passagem de par�metros</th>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="txtNome"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="txtEmail"/></td>
			</tr>
		</table>
		<input type="submit" value="Enviar"/>
	</form>
	Apos o envio estes valores estar�o preenchdos <br>
	Bem bindo <b>${param.txtNome}</b><br>
	Voc� foi cadastrado com o e-mail <b>${param.txtEmail}</b>
	
</body>
</html>