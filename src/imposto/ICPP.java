package imposto;
import model.Orcamento;


public class ICPP extends TemplateImpostoCondicional {

	@Override
	protected double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean usaTaxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500d;
	}

}
