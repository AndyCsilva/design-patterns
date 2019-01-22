
public class IKVC extends TemplateImpostoCondicional {

	@Override
	public double taxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double taxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean usaTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500 && exiteItemMaiorQueCem(orcamento);
	}

	private boolean exiteItemMaiorQueCem(Orcamento orcamento) {
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100) return true;
		}
		return false;
	}

}
