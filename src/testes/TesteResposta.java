package testes;

import model.Conta;

import org.junit.Test;

import enuns.Formato;
import resposta.Requisicao;
import resposta.Resposta;
import resposta.RespostaCsv;
import resposta.RespostaPorcentagem;
import resposta.RespostaXml;

public class TesteResposta {

	@Test
	public void testeRespostaXML() {
		System.out.println(" executando testeRespostaXML() ");		
		Requisicao req = new Requisicao(Formato.XML);
		
		Conta conta = new Conta();
		conta.setTitular("André Costa da Silva");
		conta.deposita(11655d);
		
		Resposta resposta = buildResposta();
		
		resposta.responde(req, conta);
	
	}
	
	@Test
	public void testeRespostaCSV() {
		System.out.println(" executando testeRespostaCSV() ");
		Requisicao req = new Requisicao(Formato.CSV);
		
		Conta conta = new Conta();
		conta.setTitular("André Costa da Silva");
		conta.deposita(11655d);
		
		Resposta resposta = buildResposta();
		
		resposta.responde(req, conta);
	
	}
	
	@Test
	public void testeRespostaPORCENTAGEM() {
		System.out.println(" executando testeRespostaPORCENTAGEM() ");		
		Requisicao req = new Requisicao(Formato.PORCENTO);
		
		Conta conta = new Conta();
		conta.setTitular("André Costa da Silva");
		conta.deposita(11655d);
		
		Resposta resposta = buildResposta();
		
		resposta.responde(req, conta);
	
	}
	
	public Resposta buildResposta(){
		
		return new RespostaXml(
				new RespostaCsv(
						new RespostaPorcentagem(null)
				)
		);
	}
	
	

}
