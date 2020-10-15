<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.estudo.model.Usuario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Usuario[] usuarios = (Usuario[]) request.getAttribute("users");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuários</title>
</head>
<body>
	<table border="1">
		<tr>
			<td> 
				Usando o objeto implícito session (HttpSession) <br>
				Session ID: <%=session.getId() %>
			</td>
		</tr>
		<tr>
			<td>
				Usando o objeto implícito application (ServletContext) <br>
				Server Info: <%=application.getServerInfo() %>
			</td>
		</tr>
		<tr>
			<td>
				Lista de usuários cadastrados no sistema
			</td>
		</tr>
		<tr>
			<td>
				<table border="1">
				<%for(Usuario usuario: usuarios) {%>
					<tr>
						<td>Nome:</td>
						<td><%=usuario.getUsuario()%></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><%=usuario.getEmail()%></td>
					</tr>
					<tr>
						<td>Telefone:</td>
						<td><%=usuario.getTelefone()%></td>
					</tr>
					<tr>
						<td>Endereco:</td>
						<td><%=usuario.getEndereco()%></td>
					</tr>
					<%} %>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>