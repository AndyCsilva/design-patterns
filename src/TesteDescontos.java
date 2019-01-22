public class TesteDescontos {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(1000);
		orcamento.adicionaItem(new Item("Livro", 100));
		orcamento.adicionaItem(new Item("Tablet", 800));
		
		Desconto descontoCincoItens = new DescontoMaisDeCincoItens();
		Desconto descontoOrcamentoMaiorQuinhetosReais = new DescontoOrcamentoMaiorQuinhetosReais();
		Desconto descontoVendaCasada = new DescontoVendaCasada();
		Desconto semDesconto = new SemDesconto();
		
		descontoCincoItens.setProximo(descontoOrcamentoMaiorQuinhetosReais);
		descontoOrcamentoMaiorQuinhetosReais.setProximo(descontoVendaCasada);
		descontoVendaCasada.setProximo(semDesconto);
		
		System.out.println(descontoCincoItens.desconta(orcamento));
	}
}
