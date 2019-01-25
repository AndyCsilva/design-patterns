package imposto;
import model.Orcamento;


public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public final double calcular(Orcamento orcamento) {
		if(usaTaxacaoMaxima(orcamento)){
			return taxacaoMaxima(orcamento);
		}
		return taxacaoMinima(orcamento);
	}

	protected abstract double taxacaoMinima(Orcamento orcamento);

	protected abstract double taxacaoMaxima(Orcamento orcamento);

	protected abstract boolean usaTaxacaoMaxima(Orcamento orcamento);

	
}
