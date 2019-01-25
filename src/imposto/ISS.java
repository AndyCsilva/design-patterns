package imposto;
import model.Orcamento;


public class ISS extends Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
