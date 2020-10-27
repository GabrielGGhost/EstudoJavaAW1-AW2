<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@attribute name="nome" required="true" rtexprvalue="true" %>
<%@attribute name="sexo" required="true" rtexprvalue="true" %> 

<c:choose>
	<c:when test="${sexo == 'F' }">
		Bem-Vinda ${nome}!
	</c:when>
	
	<c:when test="${sexo == 'M' }">
		Bem-Vindo ${nome}!
	</c:when>
	
	<c:otherwise>
		Bem-Vindo(a) ${nome}!
	</c:otherwise>
</c:choose>