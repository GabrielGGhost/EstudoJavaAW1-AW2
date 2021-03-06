<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo de operadores EL</title>
</head>
<body>
	<h1>Exemplo de operadores</h1>

	<table border='1'>
		<thead> 
			<tr>
				<th>Express�o</th>
				<th>Valor</th>
			</tr>
		</thead>
		<tr>
			<td>\${1+2}</td>
			<td>${1+2}</td>
		</tr>
		<tr>
			<td>\${15.5 -4}</td>
			<td>${15.5 -4}</td>
		</tr>
		<tr>
			<td>\${25*10}</td>
			<td>${25*10}</td>
		</tr>
		<tr>
			<td>\${15%6} ou \${15 mod 6}</td>
			<td>${15%6} ou ${15 mod 6}</td>
		</tr>
		<tr>
			<td>\${15/5} ou \${15 div 5}</td>
			<td>${15/5} ou ${15 div 5}</td>
		</tr>
		<tr>
			<td>\${5 == 5} ou \${5 eq 5}</td>
			<td>${5 == 5} ou ${5 eq 5}</td>
		</tr>
		<tr>
			<td>\${5 != 5} ou \${5 ne 5}</td>
			<td>${5 != 5} ou ${5 ne 5}</td>
		</tr>
		<tr>
			<td>\${10 > 20} ou \${10 gt 20}</td>
			<td>${10 > 20} ou ${10 gt 20}</td>
		</tr>
		<tr>
			<td>\${10 < 20} ou \${10 lt 20}</td>
			<td>${10 < 20} ou ${10 lt 20}</td>
		</tr>
		<tr>
			<td>\${10 >= 20} ou \${10 ge 20}</td>
			<td>${10 >= 20} ou ${10 ge 20}</td>
		</tr>
		<tr>
			<td>\${10 <= 20} ou \${10 le 20}</td>
			<td>${10 <= 20} ou ${10 le 20}</td>
		</tr>
		<tr>
			<td>\${true && false} ou \${true and false}</td>
			<td>${true && false} ou ${true and false}</td>
		</tr>
		<tr>
			<td>\${true || false} ou \${true or false}</td>
			<td>${true || false} ou ${true or false}</td>
		</tr>
		<tr>
			<td>\${!true} ou \${not true}</td>
			<td>${!true} ou ${not true}</td>
		</tr>
		<tr>
			<td>\${!false} ou \${not false}</td>
			<td>${!false} ou ${not false}</td>
		</tr>
		<tr>
			<td>\${1 > 2 ? 1 : 2}</td>
			<td>${1 > 2 ? 1 : 2}</td>
		</tr>
		<tr>
			<td>\${"gabriel" != "Gabriel" ? "Acesso Negado" : "Acesso permitido"}</td>
			<td>${"gabriel" != "gabriel" ? "Acesso Negado" : "Acesso permitido"}</td>
		</tr>
		<tr>
			<td>\${empty variavel}</td>
			<td>${empty variavel}</td>
		</tr>
		<tr>
			<td>\${empty "sadas"}</td>
			<td>${empty "sadas"}</td>
		</tr>
		<tr>
			<td>\${1 += 2}</td>
			<td>${1 += 2}</td>
		</tr>
		<tr>
			<td>\${1 + 2}</td>
			<td>${1 + 2}</td>
		</tr> 
	</table>
</body>
</html>