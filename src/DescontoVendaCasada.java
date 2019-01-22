import com.sun.org.apache.regexp.internal.recompile;


public class DescontoVendaCasada implements Desconto{

	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		if(existe("LÀPIS", orcamento) && existe("CANETA", orcamento))
			return orcamento.getValor() *.05;
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
