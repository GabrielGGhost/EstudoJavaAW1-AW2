package br.com.estudo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GeraTelaLogin
 */
@WebServlet("/geraTelaLogin")
public class GeraTelaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public GeraTelaLogin() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String msg = (String)request.getAttribute("msg");
		
		
		out.println("<html>");
		out.println("<head><title>Login</title></head>");
		out.println("<body>");
		out.println("<form = method='post' action='" + request.getContextPath() + "/validarLogin'>");;
		out.println("<table width '30%'>");
		if(msg != null && !msg.equals("")) {
			out.println("<tr><td colspan='2'>");
			out.println(msg);
			out.println("</td></tr>");
		}

		out.println("<tr>");
		out.println("<td>Usu&aacute;rio</td>");
		out.println("<td><input type='text' name='username' size='10'>");
		out.println("</td></tr>");
		out.println("<tr>");
		out.println("<td>Senha</td>");
		out.println("<td><input type='password' name='password' size='10");
		out.println("</td></tr>");
		out.println("<tr>");
		out.println("<td colspan='2'>");
		out.println("<button type='submit'>Entrar</button>");
		out.println("</td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html");
	}

}
