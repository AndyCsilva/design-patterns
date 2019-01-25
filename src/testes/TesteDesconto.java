package testes;

import static org.junit.Assert.assertEquals;
import model.Item;
import model.Orcamento;

import org.junit.Test;

import desconto.Desconto;
import desconto.DescontoMaisDeCincoItens;
import desconto.DescontoOrcamentoMaiorQuinhetosReais;
import desconto.DescontoVendaCasada;
import desconto.SemDesconto;


public class TesteDesconto {
	
	@Test
	public void testeDescontoMaisQueCincoItens() {
		Orcamento orcamento = new Orcamento(480d);
		
		orcamento.adicionaItem( new Item("KIT TECLADO E MOUSE S/ FIO", 200d) );
		orcamento.adicionaItem( new Item("KINDLE PRETO", 150d) );
		orcamento.adicionaItem( new Item("CANETA AZUL", 1d) );
		orcamento.adicionaItem( new Item("CANETA VERMELHA", 1d) );
		orcamento.adicionaItem( new Item("CANETA VERDE", 1d) );
		orcamento.adicionaItem( new Item("BRANQUINHO", 5d) );
		
		Desconto desconto = buildResponsability();
		double desconta = desconto.desconta(orcamento);
		
		assertEquals((480 * 0.9), desconta, 0.001);
	}

	@Test
	public void testeDescontoMaisQueQuinhentosReais() {
		Orcamento orcamento = new Orcamento(510d);
		
		orcamento.adicionaItem( new Item("KIT TECLADO E MOUSE S/ FIO", 200d) );
		orcamento.adicionaItem( new Item("KINDLE PRETO ULTIMATE 100GB", 310) );

		Desconto desconto = buildResponsability();
		double desconta = desconto.desconta(orcamento);
		
		assertEquals((510 * 0.93), desconta, 0.001);
	}
	
	@Test
	public void testeDescontoVendaCasada() {
		Orcamento orcamento = new Orcamento(300d);
		
		orcamento.adicionaItem( new Item("LAPIS", 110) );
		orcamento.adicionaItem( new Item("CANETA", 100) );

		Desconto desconto = buildResponsability();
		double desconta = desconto.desconta(orcamento);
		
		assertEquals((300 * 0.95), desconta, 0.001);
	}
	
	private Desconto buildResponsability() {
		Desconto descontoMaisQueCinco = new DescontoMaisDeCincoItens();
		Desconto descontoOrcamentoMaiorQuinhentos = new DescontoOrcamentoMaiorQuinhetosReais();
		Desconto descontoVendaCasada = new DescontoVendaCasada();
		Desconto semDesconto = new SemDesconto();
		
		descontoVendaCasada.setProximo(semDesconto);
		descontoOrcamentoMaiorQuinhentos.setProximo(descontoVendaCasada);
		descontoMaisQueCinco.setProximo(descontoOrcamentoMaiorQuinhentos);
		
		return descontoMaisQueCinco;
	}
}
