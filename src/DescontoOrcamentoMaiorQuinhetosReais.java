
public class DescontoOrcamentoMaiorQuinhetosReais implements Desconto{

	private Desconto proximo;
	
	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
	
	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500) return orcamento.getValor() * .07;
		return proximo.desconta(orcamento);
	}
}
