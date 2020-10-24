package com.estudos.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogAcces
 */
@WebFilter("/LogAccess")
public class LogAccess implements Filter {

    /**
     * Default constructor. 
     */
    public LogAccess() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("[FILTER] destruindo o filtro LogAcces");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("[FILTER] Executando o filtro de log de acesso");
		
		HttpServletRequest hRequest = (HttpServletRequest) request;
		System.out.println("[FILTER] URL requisitada : " + hRequest.getRequestURI());
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("[FILTER] iniciando o filtro LogAccess");
	}
}
