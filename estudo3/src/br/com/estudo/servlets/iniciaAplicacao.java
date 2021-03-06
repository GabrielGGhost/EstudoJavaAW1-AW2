package br.com.estudo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudo.model.Cliente;

/**
 * Servlet implementation class iniciaAplicacao
 */
@WebServlet("/iniciaAplicacao")
public class iniciaAplicacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public iniciaAplicacao() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cliente usuario = (Cliente) request.getSession().getAttribute("usuario");
				
		
		out.println("<html>");
		out.println("<head><title>Bem vindo!</title></head>");
		out.println("<body>");
		out.println("<h2>" + usuario.getNome() + "<br>");
		out.println("Seja bem vindo &grave; nossa loja online!");
		out.println("</h2>");
		out.println("<br><br><br>");
		out.println("<a href='efetuaLogin'>Logout</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
