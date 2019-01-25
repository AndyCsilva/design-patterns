package imposto;

import model.Orcamento;

public class ImpostoMuitoAlto extends TemplateImpostoCondicional {

	public ImpostoMuitoAlto() {
		super();
	}
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	protected double taxacaoMinima(Orcamento orcamento) {
		return 0;
	}

	@Override
	protected double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.2;
	}

	@Override
	protected boolean usaTaxacaoMaxima(Orcamento orcamento) {
		return true;
	}

}
