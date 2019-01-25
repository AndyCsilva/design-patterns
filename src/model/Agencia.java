package model;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private long numero;
	private List<Conta> contas;
	/**
	 * @return the numero
	 */
	public long getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(long numero) {
		this.numero = numero;
	}
	/**
	 * @return the contas
	 */
	public List<Conta> getContas() {
		if(this.contas == null) this.contas = new ArrayList<Conta>();
		return this.contas;
	}
	/**
	 * @param contas the contas to set
	 */
	public void adicionaConta(Conta conta) {
		this.getContas().add(conta);
	}
	
}
