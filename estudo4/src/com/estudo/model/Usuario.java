package com.estudo.model;

public class Usuario {
	
	private String usuario;
	private String email;
	private String telefone;
	private String endereco;
	

	public Usuario(String usuario, String email, String telefone, String endereco) {
		super();
		this.setUsuario(usuario);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
		
}
