package relatorio;

import java.text.DateFormat;
import java.util.Calendar;

import model.Agencia;
import model.Banco;
import model.Conta;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	protected void rodape(Banco banco) {
		System.out.println("EMAIL\t" + banco.getEmail() + "\tDATA\t" + obterDataAtual());
	}

	private String obterDataAtual() {
		Calendar instance = Calendar.getInstance();
		return DateFormat.getDateInstance().format(instance.getTime());
	}

	@Override
	protected void corpo(Banco banco) {

		for (Agencia agencia : banco.getAgencias()) {
			for (Conta conta : agencia.getContas()) {
				System.out.println("TITULAR\t\t" + conta.getTitular() + "\t\tAGÊNCIA\t"+ agencia.getNumero() + "\t\tCONTA\t"+ conta.getNumero() + " SALDO\t" + conta.getSaldo());
			}
		}
	}

	@Override
	protected void cabecalho(Banco banco) {
		System.out.println("BANCO\t\t" + banco.getNome() + " TELEFONE\t" + banco.getTelefone());
		System.out.println("ENDEREÇO\t\t" + banco.getEndereco());
	}

}
