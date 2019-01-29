package model;

import java.util.Calendar;

public class Conta {
	
	private long numero;
	private double saldo;
	private String titular;
	private Calendar dataAbertura;
	
	public double getSaldo() {
		return saldo;
	}

	public void deposita(double saldo) {
		this.saldo += saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
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
	 * @return the dataAbertura
	 */
	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
