package com.estudo.dao;

import java.util.List;

import com.estudo.exception.GlobalcodeException;
import com.estudo.model.Usuario;


public interface UsuarioDAO {

    public void save(Usuario p) throws GlobalcodeException;

    public List<Usuario> getAllUsuarios(String sufixo) throws GlobalcodeException;

}