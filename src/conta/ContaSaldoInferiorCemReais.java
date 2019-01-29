package conta;

import java.util.List;

import model.Conta;

public class ContaSaldoInferiorCemReais extends Filtro {
	
	public ContaSaldoInferiorCemReais() {
		super();
	}
	
	public ContaSaldoInferiorCemReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {

		for (Conta conta : contas) {
			
			if(conta.getSaldo() < 100d){
				contasFiltradas.add(conta);
			}
		}
		
		contasFiltradas.addAll(proximo(contas));

		return contasFiltradas;
	}

}
