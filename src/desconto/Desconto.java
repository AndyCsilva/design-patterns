package desconto;
import model.Orcamento;


public interface Desconto {

	public double desconta(Orcamento orcamento);
	
	public void setProximo(Desconto desconto);
}
