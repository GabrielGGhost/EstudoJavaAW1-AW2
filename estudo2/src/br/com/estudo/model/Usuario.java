package br.com.estudo.model;

public class Usuario {
	
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Usuario(String nome, String email, String telefone, String endereco) {
		super();
		this.setNome(nome);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
	}
	

	
}
