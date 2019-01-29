package conta;

import java.util.Calendar;
import java.util.List;

import model.Conta;

public class ContaDataAberturaMesCorrente extends Filtro {

	public ContaDataAberturaMesCorrente() {
		super();
	}

	public ContaDataAberturaMesCorrente(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {

		for (Conta conta : contas) {
			if (conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
					&& conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				contasFiltradas.add(conta);
			}
		}
		contasFiltradas.addAll(proximo(contas));

		return contasFiltradas;
	}

}
