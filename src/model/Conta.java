package model;

public class Conta {
	
	private long numero;
	private double saldo;
	private String titular;
	
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
}
