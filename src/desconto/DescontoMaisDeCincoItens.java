package desconto;

import model.Orcamento;

public class DescontoMaisDeCincoItens implements Desconto {

	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		if ( orcamento != null && orcamento.getItens() != null && orcamento.getItens().size() > 5 ){
		 return ( 0.9d * orcamento.getValor());
		}
		return this.proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
		
	}
	

}
