package testes;

import static org.junit.Assert.assertEquals;
import imposto.ICCC;
import imposto.ICMS;
import imposto.ICPP;
import imposto.IHIT;
import imposto.IKVC;
import imposto.Imposto;
import imposto.ImpostoMuitoAlto;
import model.Item;
import model.Orcamento;

import org.junit.Test;

public class TesteTemplateImpostoCondicionalDecorator {
	
	@Test
	public void testeImpostoICPPComIKVC() {
		
		Orcamento orcamentoMaior = new Orcamento(501);
		orcamentoMaior.adicionaItem(new Item("LAPIS", 50));
		orcamentoMaior.adicionaItem(new Item("BORRACHA", 90));
		orcamentoMaior.adicionaItem(new Item("CADERNO", 105));
		
		Orcamento orcamentoMenor = new Orcamento(100);
		orcamentoMenor.adicionaItem(new Item("LAPIS", 50));
		orcamentoMenor.adicionaItem(new Item("BORRACHA", 90));
		orcamentoMenor.adicionaItem(new Item("CADERNO", 105));

		Imposto icpp = new ICPP( new IKVC() );
		
		double esperado = 35.7d + 50d;
		double resultado = icpp.calcular( orcamentoMaior );
		
		assertEquals(esperado, resultado, 0.9);
		
		esperado = 5.d + 6;
		resultado = icpp.calcular( orcamentoMenor );
		
		assertEquals(esperado, resultado, 0.9);
	}
	
	@Test
	public void testeImpostoMuitoAlto() {
		
		Orcamento orcamentoMaior = new Orcamento(501);
		orcamentoMaior.adicionaItem(new Item("LAPIS", 50));
		orcamentoMaior.adicionaItem(new Item("BORRACHA", 90));
		orcamentoMaior.adicionaItem(new Item("CADERNO", 105));
		
		Imposto iccc = new ICCC();
		Imposto icms = new ICMS(iccc);
		Imposto iikvc = new IKVC(icms);
		Imposto ihit = new IHIT(iikvc);
		Imposto icpp = new ICPP(ihit);
		
		Imposto extorsao = new ImpostoMuitoAlto(icpp);
		
		double esperado = 35.7d + 50d;
		double resultado = extorsao.calcular( orcamentoMaior );
		
		//assertEquals(esperado, resultado, 0.9);
		
		System.out.println(resultado);

	}	
	
}
