<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
    
    <%
	    //Leitura de par�metros que definem em qual idioma a pag ser� apresentada
	    String pais = request.getParameter("codigoPais");
	    String idioma = request.getParameter("codigoIdioma");
	    
	    //Obten��o da localiza��o enviada pelo browser na request
	    Locale theLocale = request.getLocale();
	    
	    if(pais != null && idioma != null)
	    	//Cria��o do objeto locale com par�metros recebidos pela request
	    	theLocale = new Locale(idioma,pais);
	    	String nomeArquivo = "com.estudo.I18N.Textos";
	    
	    	//Carregamento do arquivo de propriedades para localiza��o theLocale
	    	ResourceBundle bundle = ResourceBundle.getBundle(nomeArquivo, theLocale);
    %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Obten��o do valor associado a textTitulo no idioma especificado -->
<title><%=bundle.getString("textTitulo")%></title>
</head>
<body>
	<!-- Impress�o de dados na tela para acompanhamento -->
	Pais = <%=theLocale.getCountry()%>
	Idioma = <%=theLocale.getLanguage()%>
	<br/><br/><br/>
	<%=bundle.getString("textExplicacao")%>
	<br/><br/>
	<form name="formCadastroCliente" action="">
		<!-- Obten��o dos valores associados aos textos no idoma especificado -->
		<%=bundle.getString("textNome") %>
		<input type="text" name="textNome"/><br>
		
		<%=bundle.getString("textEmail") %>
		<input type="text" name="textEmail"/><br>
		<input type="submit" value="<%=bundle.getString("textBotao") %>>"/><br>
	</form>
	<br/><br/><br/>
	
	<!-- Links para altera��o do idioma em que a p�gina � apresentada. -->
	
	<a href="exemploI18NBasico.jsp?codigoPais=us&codigoIdioma=en">Ver em ingl�s</a>
	<a href="exemploI18NBasico.jsp?codigoPais=pt&codigoIdioma=pt">Ver em portugu�s</a>
	<a href="exemploI18NBasico.jsp?codigoPais=mx&codigoIdioma=es">Ver em espanhol</a>
</body>
</html>