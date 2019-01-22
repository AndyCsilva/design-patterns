
public class ICPP extends TemplateImpostoCondicional {

	@Override
	public double taxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double taxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean usaTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}


}
