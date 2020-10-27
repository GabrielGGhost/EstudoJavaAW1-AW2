package com.estudo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidaUsuario
 */
@WebServlet("/validaUsuario")
public class ValidaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidaUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>ValiedaUsuario</title></head>");
		out.println("<body>");
		
		String lembrarSenha = request.getParameter("lembrarSenha");
		String usuario = request.getParameter("username");
		String senha = request.getParameter("password");
		
		if((lembrarSenha != null) && lembrarSenha.equals("true")){
			response.addCookie(new Cookie("username", usuario));
			response.addCookie(new Cookie("password", senha));
		} else {
			out.println("Username e Password inválidos!");
		}
		
		out.println("</body>");
		out.println("</html>");

	}

}
