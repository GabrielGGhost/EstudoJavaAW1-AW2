package com.estudo.model;

import java.util.List;

import com.estudo.dao.*;
import com.estudo.exception.GlobalcodeException;

public class GerenciadorUsuarios {
	
	public List<Usuario> getUsuariosByEmail(String sufixo) throws GlobalcodeException{
		UsuarioDAO dao = new UsuarioDB();
		return dao.getAllUsuarios(sufixo);
	}
	
	public void cadastroUsuario(Usuario u){
		//cadastramento
	}
	
	public void removeUsuario(Usuario u){
		//remover
	}
}
