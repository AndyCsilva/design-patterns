package conta;

import java.util.List;

import model.Conta;

public class ContaSaldoSuperiorQuinhentosMilReais extends Filtro {
	
	public ContaSaldoSuperiorQuinhentosMilReais() {
		super();
	}
	
	public ContaSaldoSuperiorQuinhentosMilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		for (Conta conta : contas) {
			
			if(conta.getSaldo() > 500000){
				contasFiltradas.add(conta);
			}
		}

		contasFiltradas.addAll(proximo(contas));
		
		return contasFiltradas;
	}

}
