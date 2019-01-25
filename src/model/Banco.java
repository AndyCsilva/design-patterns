package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {

	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private List<Agencia> agencias;
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the agencias
	 */
	public List<Agencia> getAgencias() {
		if(this.agencias == null) this.agencias = new ArrayList<Agencia>();
		return this.agencias;
	}
	/**
	 * @param agencia the agencias to add
	 */
	public void adicionaAgencia(Agencia agencia) {
		this.getAgencias().add(agencia);
	}
	
}
