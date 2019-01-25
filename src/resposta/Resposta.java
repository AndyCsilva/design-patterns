package resposta;
import model.Conta;


public abstract class Resposta {
	
	final Resposta proxima;
	
	public Resposta(Resposta proxima){
		this.proxima = proxima;
	}
	
	abstract public void responde(Requisicao req, Conta conta);
	
}