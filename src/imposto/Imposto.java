package imposto;
import model.Orcamento;


public abstract class Imposto {

	protected static int instance;
	
	protected Imposto outroImposto;
	
	public Imposto() {
		super();
	}
	
	public Imposto(Imposto outroImposto) {
		super();
		this.outroImposto = outroImposto;
	}
	
	public abstract double calcular(Orcamento orcamento);
	
	protected final double calculaOutroImposto(Orcamento orcamento) {
		return outroImposto != null ? outroImposto.calcular(orcamento) : 0d;
	}
}

