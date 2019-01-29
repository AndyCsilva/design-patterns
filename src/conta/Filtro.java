package conta;

import java.util.ArrayList;
import java.util.List;

import model.Conta;

public abstract class Filtro {
	
	protected List<Conta> contasFiltradas = new ArrayList<Conta>();
	
    protected Filtro outroFiltro;

    public Filtro() {}

    public Filtro(Filtro outroFiltro) {
      this.outroFiltro = outroFiltro;
    }

    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> proximo(List<Conta> contas) {
      if(outroFiltro != null) return outroFiltro.filtra(contas);
      else return new ArrayList<Conta>();
    }
  }