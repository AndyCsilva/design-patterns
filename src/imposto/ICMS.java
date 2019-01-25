package imposto;
import model.Orcamento;


public class ICMS extends Imposto {

	public ICMS() {
		super();
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcular(Orcamento orcamento) {
		System.out.println(this.toString() + " instancia " + instance ++);
		
		return (orcamento.getValor() * 0.05) + 50 + calculaOutroImposto(orcamento);
	}

}
