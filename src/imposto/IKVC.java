package imposto;
import java.util.List;

import model.Item;
import model.Orcamento;


public class IKVC extends TemplateImpostoCondicional {

	public IKVC() {
		super();
	}
	
	public IKVC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	protected double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean usaTaxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500d && temItemValorMaiorQue100(orcamento.getItens());
	}

	private boolean temItemValorMaiorQue100(List<Item> itens) {
		
		for (Item item : itens) {
			if (item.getValor() > 100d) return true;
		}
		return false;
	}

}
