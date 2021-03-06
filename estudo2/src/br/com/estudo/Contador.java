package br.com.estudo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contador
 */
@WebServlet("/contador")
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parametroInicio = request.getParameter("inicio");
		String parametroFim = request.getParameter("fim");
		
		int inicio = 0, fim = 0;
		try{
			inicio = Integer.parseInt(parametroInicio);
			fim = Integer.parseInt(parametroFim);
			
		} catch (NumberFormatException nfe) {
			throw new ServletException(nfe);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Contador</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Contando de " + inicio + " a " + fim + "</h1>");
		
		for (int i = inicio; i <= fim; i++) {
			out.print(i);
			out.println("<br/>");
		}
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
