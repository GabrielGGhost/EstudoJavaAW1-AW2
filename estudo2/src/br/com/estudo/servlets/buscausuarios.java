package br.com.estudo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudo.model.Usuario;

/**
 * Servlet implementation class buscausuarios
 */
@WebServlet("/BuscaUsuarios")
public class BuscaUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario[] usuarios = new Usuario[3];
		Usuario u0 = new Usuario("mainUser", "mainUser@email.com.br", "0800705145852", "Rua ruinha ruona");
		Usuario u1 = new Usuario("gcUser", "gcUser@email.com.br", "------", "Rua das cores");
		Usuario u2 = new Usuario("ajUser", "ajUser@email.com.br", "512548745", "Rua planilha");
		
		usuarios[0] = u0;
		usuarios[1] = u1;
		usuarios[2] = u2;
		
		request.setAttribute("users", usuarios);
		RequestDispatcher rd = request.getRequestDispatcher("/ListaUsuarios");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

}