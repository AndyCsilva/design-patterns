import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class IHIT extends TemplateImpostoCondicional {

	@Override
	protected double taxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected double taxaMaxima(Orcamento orcamento) {
		return (orcamento.getItens().size() + 0.01) * orcamento.getValor();
	}

	@Override
	protected boolean usaTaxaMaxima(Orcamento orcamento) {
		return existeDoisItemComNomeigual(orcamento) ? true : false;
	}

	private boolean existeDoisItemComNomeigual(Orcamento orcamento) {
		List<Item> itensRepetidos = new ArrayList<Item>(1);
		
		for(Item item : orcamento.getItens()){
			if (itensRepetidos.contains(item.getNome())) return true;
			else itensRepetidos.add(item);
		}
		return false;
	}

}
