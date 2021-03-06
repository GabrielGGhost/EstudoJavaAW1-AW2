<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>
					<table>
						<tr>
							<td class="coluna1">Lista de Clientes</td>
							<td>&nbsp;</td>
						</tr>
					</table>
				</td>
			</tr>
		</thead>
		<tbody>
			<td>
				<fieldset>
					<table>
						<tbody>
							<tr>
								<td><label>Nome</label></td>
								<td><label>Telefone</label></td>
								<td><label>Endere�o</label></td>
							</tr>
							<tr>
								<td colspan="3"><hr></td>
							</tr>
							<c:if test="${empty clientes }">
								<tr>
									<td colspan="3">Nenhum cliente foi encontrado!</td>
								</tr>
							</c:if>
							<c:if test="${not empty clientes}">
								<c:forEach var="cliente" items="${clientes}">
									<tr>
										<td>
											<div>
												${cliente.nome}
											</div>
										</td>
										<td>
											<div>
												${cliente.telefone}
											</div>
										</td>
										<td>
											<div>
												${cliente.endereco}
											</div>
										</td>
									</tr>
									<tr>
										<td colspan="3"><hr></td>
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>
				</fieldset>
			</td>
		</tbody>
	</table>
</body>
</html>