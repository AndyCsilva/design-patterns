package imposto;
import model.Orcamento;


public abstract class TemplateImpostoCondicional extends Imposto {

	public TemplateImpostoCondicional() {
		super();
	}
	
	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	protected abstract double taxacaoMinima(Orcamento orcamento);
	
	protected abstract double taxacaoMaxima(Orcamento orcamento);
	
	protected abstract boolean usaTaxacaoMaxima(Orcamento orcamento);

	@Override
	public final double calcular(Orcamento orcamento) {
		System.out.println(this.toString() + " instância " + instance ++);
		
		if(usaTaxacaoMaxima(orcamento)){
			return taxacaoMaxima(orcamento) + calculaOutroImposto(orcamento);
		}
		return taxacaoMinima(orcamento) + calculaOutroImposto(orcamento);
	}
	
}
