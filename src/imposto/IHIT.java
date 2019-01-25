package imposto;
import java.util.ArrayList;
import java.util.List;

import model.Item;
import model.Orcamento;


public class IHIT extends TemplateImpostoCondicional {

	public IHIT() {
		super();
	}
	
	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	protected double taxacaoMinima(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
	}

	@Override
	protected double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean usaTaxacaoMaxima(Orcamento orcamento) {
		return existeDoisItemComNomeigual(orcamento) ? true : false;
	}

	private boolean existeDoisItemComNomeigual(Orcamento orcamento) {
		List<Item> itensRepetidos = new ArrayList<Item>(1);
		
		for(Item item : orcamento.getItens()){
			if (itensRepetidos.contains(item)) return true;
			else itensRepetidos.add(item);
		}
		return false;
	}

}
