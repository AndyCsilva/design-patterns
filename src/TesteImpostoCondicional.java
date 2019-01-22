
public class TesteImpostoCondicional {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(510);
		orcamento1.adicionaItem(new Item("LAPIS", 50));
		orcamento1.adicionaItem(new Item("BORRACHA", 90));
		orcamento1.adicionaItem(new Item("CADERNO", 105));
		
		Orcamento orcamento2 = new Orcamento(300);
		orcamento1.adicionaItem(new Item("LAPIS", 50));
		orcamento1.adicionaItem(new Item("BORRACHA", 90));
		
		Imposto icpp = new ICPP();
		Imposto ikvc = new IKVC();
		
		System.out.println(icpp.calcular(orcamento1));
		System.out.println(ikvc.calcular(orcamento1));
		
		System.out.println(icpp.calcular(orcamento2));
		System.out.println(ikvc.calcular(orcamento2));

	}

}
