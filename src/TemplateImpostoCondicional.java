
public abstract class TemplateImpostoCondicional implements Imposto{

	@Override
	public double calcular(Orcamento orcamento) {
		if(usaTaxaMaxima(orcamento)){
			return taxaMaxima(orcamento);
		}
		return taxaMinima(orcamento);
	}

	protected abstract double taxaMinima(Orcamento orcamento);

	protected abstract double taxaMaxima(Orcamento orcamento);

	protected abstract boolean usaTaxaMaxima(Orcamento orcamento);

	
}
