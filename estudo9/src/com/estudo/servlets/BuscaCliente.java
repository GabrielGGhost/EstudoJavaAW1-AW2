package com.estudo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estudo.model.Cliente;

/**
 * Servlet implementation class BuscaCliente
 */
@WebServlet("/buscaCliente")
public class BuscaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request,
				 HttpServletResponse response)
				throws ServletException, IOException{

		List<Cliente> clientes = new ArrayList<Cliente>();
		
		String nome = request.getParameter("nome");
		
		if(nome.contains("Jo�o")){
		
			Cliente u1 = new Cliente("Jo�o Mario","15 98874585","Rua Banana");
			Cliente u2 = new Cliente("Jo�o Alberto","15 96584778","Vila Rosana");
			Cliente u3 = new Cliente("Jo�o Henrique","15 9652365","rua alberto");
			
			clientes.add(u1);
			clientes.add(u2);
			clientes.add(u3);
		} else if(nome.contains("Maria")){
			Cliente u1 = new Cliente("Maria Paula","15 88785489","Rua secund�ria");
			
			clientes.add(u1);
		} 
		
		request.setAttribute("clientes", clientes);
		
		RequestDispatcher dp = request.getRequestDispatcher("/jsp/listaCliente.jsp");
		dp.forward(request, response);
}
	

}
