<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action='${pageContext.request.contextPath}/buscaCliente'>
		<table>
			<thead>
				<tr>
					<td>
						<table>
							<tr>
								<td class="coluna1">Pesquisar Clientes</td>
								<tD>&nbsp;</tD>
							</tr>
						</table>
					</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>
						<fieldset>
							<table>
								<tbody>
									<td align="right">
										<label for="nome">Nome:</label>
									</td>
									<td align="left">
										<input name="nome" id="nome" type="text" size="40" maxlenght="255"/>
									</td>
									<td>
										<input name="buscar" type="submit" id="buscar1" value="Buscar"/>
									</td>
								</tbody>
							</table>
						</fieldset>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>