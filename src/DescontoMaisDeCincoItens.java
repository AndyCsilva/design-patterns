
public class DescontoMaisDeCincoItens implements Desconto {
	
	private Desconto proximo;

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * .1;
		}
		return proximo.desconta(orcamento);
	}

}
