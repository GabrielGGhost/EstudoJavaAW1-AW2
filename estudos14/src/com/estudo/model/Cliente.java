package com.estudo.model;

public class Cliente {

	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id, String nome, String telefone, String email) {
		super();
		this.setId(id);
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEmail(email);
	}
	
	public Cliente(String nome, String telefone, String email) {
		super();
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEmail(email);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
