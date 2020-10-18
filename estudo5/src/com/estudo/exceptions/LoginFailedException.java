package com.estudo.exceptions;

import javax.servlet.ServletException;

public class LoginFailedException extends ServletException {

	public LoginFailedException(String msg){
		
		super(msg);
		System.out.println("Uma exception foi criada");
	}
}
