package br.com.estudo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudo.model.Cliente;

/**
 * Servlet implementation class ValidarLogin
 */
@WebServlet("/validarLogin")
public class ValidarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		String msg = "";
		String urlDestino = "/geraTelaLogin";
		
		if(user == null || user.equals("")){
			msg = "Por favor, digite o usu�rio";
		} else if (user == null || user.equals("")){
			msg = "Por favor, digite o usu�rio";
		} else {
			if (user.equals("gc") && pass.equals("gc")) {
				Cliente cliente = new Cliente("Estudo3",
											   user,
											   pass,
											   "Rua n�mero 44, 22",
											   "(11) 169854782",
											   true);
				
				request.getSession().setAttribute("usuario", cliente);
				msg = "Usuario autenticado.";
				urlDestino = "/iniciaAplicacao";
			} else {
				msg = "Usu�rio e/ou senha inv�lidos";
			}
			
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher(urlDestino);
			rd.forward(request, response);
		}
	}

}
