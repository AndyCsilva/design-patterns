package relatorio;

import model.Agencia;
import model.Banco;
import model.Conta;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected void rodape(Banco banco) {
		System.out.println("BANCO\t\t" + banco.getNome() + "TELEFONE\t" + banco.getTelefone());
	}

	@Override
	protected void corpo(Banco banco) {

		for (Agencia agencia : banco.getAgencias()) {
			for (Conta conta : agencia.getContas()) {
				System.out.println("TITULAR\t\t" + conta.getTitular() + "\t\tSALDO\t" + conta.getSaldo());
			}
		}
	}

	@Override
	protected void cabecalho(Banco banco) {
		System.out.println("BANCO\t\t" + banco.getNome() + " TELEFONE\t" + banco.getTelefone());
	}
}
