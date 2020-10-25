package com.estudo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExemploAsync
 */
@WebServlet(urlPatterns="/exemploAsync", asyncSupported=true)
public class ExemploAsync extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ExemploAsync() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final AsyncContext ctx = request.startAsync();
		ctx.setTimeout(6000);
		//Neste exemplo, utilizamos uma classe anônima para o processamento assincrono, mas não é obrigatório
		ctx.start(new Runnable(){
			public void run(){
				System.out.println("Iniciando processo longo!!!");
				try {
					Thread.sleep(10000);
					ctx.getResponse().setContentType("text/plain");
					PrintWriter out = ctx.getResponse().getWriter();
					out.print("Processamento completo!!");
				}catch(Exception ex){
					//tratamento de erros
				}
				ctx.complete();
			}
		});
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
