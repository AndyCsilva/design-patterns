package desconto;
import model.Item;
import model.Orcamento;


public class DescontoVendaCasada implements Desconto{

	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		if((existe("LÀPIS", orcamento) || existe("LAPIS", orcamento)) && existe("CANETA", orcamento))
			return orcamento.getValor() *.95;
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
	
    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equalsIgnoreCase(nomeDoItem)) return true;
        }
        return false;
    }
}
