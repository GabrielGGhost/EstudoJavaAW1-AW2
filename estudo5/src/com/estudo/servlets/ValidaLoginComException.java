package com.estudo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estudo.exceptions.LoginFailedException;

/**
 * Servlet implementation class ValidaLoginComException
 */
@WebServlet("/ValidaLoginComException")
public class ValidaLoginComException extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidaLoginComException() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("txtNome");
		String pass = request.getParameter("txtSenha");
		
		if((username == null) || (username.equals(""))){
			throw new LoginFailedException("Por favor, digite seu nome!");
		} else if ((pass == null) || (pass.equals(""))){
			throw new LoginFailedException("Por favor, digite sua senha!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
