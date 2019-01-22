import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestesGerais {
	
	public static <E> void main(String[] args) {
		Orcamento orcamento = new Orcamento(800);
		
		Item teste = new Item("Andre", 100);
		
		orcamento.adicionaItem(teste);
		orcamento.adicionaItem(new Item("Andre", 100));
		orcamento.adicionaItem(new Item("Andre", 300));
		orcamento.adicionaItem(new Item("Andre", 400));
		orcamento.adicionaItem(teste);
	
		TestesGerais.deveUsarMaximaTaxacao(orcamento);
	}
	
	
	protected static boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(Collections.frequency(orcamento.getItens(), item) > 1){
                return true;
            }
        }
        return false;
    }

}
