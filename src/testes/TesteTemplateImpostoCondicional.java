package testes;

import static org.junit.Assert.assertEquals;
import imposto.ICPP;
import imposto.IHIT;
import imposto.IKVC;
import imposto.Imposto;
import model.Item;
import model.Orcamento;

import org.junit.Ignore;
import org.junit.Test;

public class TesteTemplateImpostoCondicional {
	
//	@Ignore
	@Test
	public void testeImpostoICPP() {
		
		Orcamento orcamentoMaior = new Orcamento(510);
		orcamentoMaior.adicionaItem(new Item("LAPIS", 50));
		orcamentoMaior.adicionaItem(new Item("BORRACHA", 90));
		orcamentoMaior.adicionaItem(new Item("CADERNO", 105));
		
		Orcamento orcamentoMenor = new Orcamento(100);
		orcamentoMenor.adicionaItem(new Item("LAPIS", 50));
		orcamentoMenor.adicionaItem(new Item("BORRACHA", 90));
		orcamentoMenor.adicionaItem(new Item("CADERNO", 105));

		
		Imposto icpp = new ICPP();
		
		double esperado = 35.70d;
		double resultado = icpp.calcular( orcamentoMaior );
		
		assertEquals(esperado, resultado, 0.001);
		
		esperado = 5.d;
		resultado = icpp.calcular( orcamentoMenor );
		
		assertEquals(esperado, resultado, 0.001);
	}
	
//	@Ignore
	@Test
	public void testeImpostoIKCV() {
		Orcamento orcamentoMaior = new Orcamento(501);
		orcamentoMaior.adicionaItem(new Item("LAPIS", 50));
		orcamentoMaior.adicionaItem(new Item("BORRACHA", 90));
		orcamentoMaior.adicionaItem(new Item("CADERNO", 105));
		
		Orcamento orcamentoMenor = new Orcamento(100);
		orcamentoMenor.adicionaItem(new Item("LAPIS", 50));
		orcamentoMenor.adicionaItem(new Item("BORRACHA", 90));
		orcamentoMenor.adicionaItem(new Item("CADERNO", 105));

		Imposto ikcv = new IKVC();
		
		double esperado = 50.1d;
		double resultado = ikcv.calcular( orcamentoMaior );
		
		assertEquals(esperado, resultado, 0.001);
		
		esperado = 6.d;
		resultado = ikcv.calcular( orcamentoMenor );
		
		assertEquals(esperado, resultado, 0.001);
	}
	
	@Test
	public void testeImpostoIHIT() {
		Orcamento orcamentoMaior = new Orcamento(100);
		orcamentoMaior.adicionaItem(new Item("LAPIS", 50));
		orcamentoMaior.adicionaItem(new Item("LAPIS", 50));
		orcamentoMaior.adicionaItem(new Item("CADERNO", 105));
		
		Orcamento orcamentoMenor = new Orcamento(100);
		orcamentoMenor.adicionaItem(new Item("LAPIS", 50));
		orcamentoMenor.adicionaItem(new Item("BORRACHA", 90));
		orcamentoMenor.adicionaItem(new Item("CADERNO", 105));

		Imposto ihit = new IHIT();
		
		double esperado = 113.d;
		double resultado = ihit.calcular( orcamentoMaior );
		
		assertEquals(esperado, resultado, 0.001);
		
		esperado = 3.d;
		resultado = ihit.calcular( orcamentoMenor );
		
		assertEquals(esperado, resultado, 0.001);
	}
}
