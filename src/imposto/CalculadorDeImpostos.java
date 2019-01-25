package imposto;
import model.Orcamento;

public class CalculadorDeImpostos {

	public static void main(String[] args) {
		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
		Orcamento orcamento1 = new Orcamento(999);
		Orcamento orcamento2 = new Orcamento(1500);
		Orcamento orcamento3 = new Orcamento(3350);
		ICCC iccc = new ICCC();

		System.out.println(calculadora.calcular(orcamento1, iccc));
		System.out.println(calculadora.calcular(orcamento2, iccc));
		System.out.println(calculadora.calcular(orcamento3, iccc));
	}

	public double calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
