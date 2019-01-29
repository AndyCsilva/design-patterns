package testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Conta;

import org.junit.Test;

import conta.ContaDataAberturaMesCorrente;
import conta.ContaSaldoInferiorCemReais;
import conta.ContaSaldoSuperiorQuinhentosMilReais;
import conta.Filtro;

public class TesteFiltroDecorator {
	
	@Test
	public void testeFiltros() {
		
		Filtro filtro = new ContaSaldoInferiorCemReais( 
				new ContaDataAberturaMesCorrente( 
						new ContaSaldoSuperiorQuinhentosMilReais() ) );
		
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta();
		c1.setDataAbertura(Calendar.getInstance());
		c1.getDataAbertura().add(Calendar.YEAR, -1);
		c1.setNumero(1l);
		c1.setTitular("André Costa");
		c1.deposita(100);
		
		Conta c2 = new Conta();
		c2.setDataAbertura(Calendar.getInstance());
		c2.getDataAbertura().add(Calendar.YEAR, -1);
		c2.setNumero(2l);
		c2.setTitular("José Silva");
		c2.deposita(2000);
		
		Conta c3 = new Conta();
		c3.setDataAbertura(Calendar.getInstance());
		c3.getDataAbertura().add(Calendar.YEAR, -1);
		c3.setNumero(3l);
		c3.setTitular("Marcio Rubens");
		c3.deposita(500002);
		
		Conta c4 = new Conta();
		c4.setDataAbertura(Calendar.getInstance());
		c4.getDataAbertura().add(Calendar.YEAR, -1);
		c4.setNumero(4l);
		c4.setTitular("Chico Bento");
		
		Conta c5 = new Conta();
		c5.setDataAbertura(Calendar.getInstance());
		c5.setNumero(5l);
		c5.setTitular("Cabo Daciolo");
		c5.deposita(4989);
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		
		List<Conta> encontradas = filtro.filtra(contas);
		
		assertEquals(encontradas.size(), 3);
 		
		assertEquals(encontradas.contains(c3), true);
		assertEquals(encontradas.contains(c4), true);
		assertEquals(encontradas.contains(c5), true);
		
	}

}
