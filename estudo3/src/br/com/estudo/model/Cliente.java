package br.com.estudo.model;

public class Cliente {

	private Integer id;
	private String nome;
	private String endereco;
	private String telefone;
	private String usuario;
	private String senha;
	private boolean ativo;
	
	public Cliente() {

	}
	
	public Cliente(String nome, String endereco, String telefone, String usuario, String senha,
			boolean ativo) {
		super();
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setUsuario(usuario);
		this.setSenha(senha);
		this.setAtivo(ativo);
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getUsuario() {
		return this.usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean getAtivo() {
		return this.ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
