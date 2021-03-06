package com.estudo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estudo.model.Usuario;

/**
 * Servlet implementation class BuscaUsuarios
 */
@WebServlet("/buscaUsuarios")
public class BuscaUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BuscaUsuarios() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario[] usuarios = new Usuario[3];
		
		usuarios[0] = new Usuario("MainUser",
								  "mainUser@email.com",
								  "---",
								  "Rua do osvaldo, 327");
		usuarios[1] = new Usuario("gcUser",
								  "gcUser@email.com",
								  "159966325",
								  "Rua do mario, 327");
		usuarios[2] = new Usuario("ajUser",
								  "ajUser@email.com",
								  "157785478",
								  "Rua do osvaldo, 327");
		
		request.setAttribute("users", usuarios);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/listaUsuarios.jsp");
		rd.forward(request, response);
		 
	}

}
