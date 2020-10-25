package com.estudo.aw.dao;

import java.util.List;

import com.estudo.exception.GlobalcodeException;
import com.estudo.model.Cliente;


public interface ClienteDAO {

    public void save(Cliente p) throws GlobalcodeException;

    public List<Cliente> getAllClients() throws GlobalcodeException;

}