package testes;

import model.Agencia;
import model.Banco;
import model.Conta;

import org.junit.Test;

import relatorio.Relatorio;
import relatorio.RelatorioComplexo;
import relatorio.RelatorioSimples;

public class TesteRelatorio {

	@Test
	public void testRelatorioSimples() {
		Relatorio relatorio = new RelatorioSimples();
		relatorio.imprimir(buildBanco());
	}
	
	@Test
	public void testRelatorioComplexo() {
		Relatorio relatorio = new RelatorioComplexo();
		relatorio.imprimir(buildBanco());
	}
	
	private Banco buildBanco() {
		
		Banco banco = new Banco();
		Agencia agencia1 = new Agencia();
		Conta conta1 = new Conta(), conta2 = new Conta(), conta3 = new Conta();

		conta1.setTitular("André Costa da Silva");	
		conta1.setNumero(00001);
		conta1.deposita(1000000);
		
		conta2.setTitular("Mayara Lé Pereira Costa");	
		conta2.setNumero(00002);
		conta2.deposita(199999);
		
		conta3.setTitular("Maria José da Costa");	
		conta3.setNumero(00003);
		conta3.deposita(6519861);
		
		agencia1.setNumero(001);
		agencia1.adicionaConta(conta1);
		agencia1.adicionaConta(conta2);
		agencia1.adicionaConta(conta3);
		
		banco.setNome("Nubank S/A");
		banco.setEmail("nucomvc@nubank.com");
		banco.setEndereco("Av Rebouças, 2000");
		banco.setTelefone("+055 11 5659-4844");
		banco.adicionaAgencia(agencia1);
		
		return banco;
	}

}
