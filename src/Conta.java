
public class Conta {
	
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
}
