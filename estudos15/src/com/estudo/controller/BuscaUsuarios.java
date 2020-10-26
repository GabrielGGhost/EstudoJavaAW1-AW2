package com.estudo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estudo.exception.GlobalcodeException;
import com.estudo.model.*;
import java.util.List;
/**
 * Servlet implementation class BuscaUsuarios
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
		try {
			doAction(request, response);
		} catch (GlobalcodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doAction(request, response);
		} catch (GlobalcodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, GlobalcodeException {
		String sufixoEmail = request.getParameter("sufixoEmail");
		
		if(sufixoEmail != null){
			
			GerenciadorUsuarios ger = new GerenciadorUsuarios();
			List<Usuario> usuarios = ger.getUsuariosByEmail(sufixoEmail);
			
			request.setAttribute("users", usuarios);
			
			request.getRequestDispatcher("/view/jsp/ListaUsuarios.jsp").forward(request, response); 
		} else {
			
			request.getRequestDispatcher("/view/html/formularioPesquisa.html").forward(request, response);
		}
		
	}
}
