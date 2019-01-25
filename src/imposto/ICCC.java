package imposto;
import model.Orcamento;


public class ICCC extends Imposto {
	
	public ICCC() {
		super();
	}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcular(Orcamento orcamento) {
		
		System.out.println(this.toString() + " instancia " + instance ++);
		
		if(orcamento.getValor() < 1000){
			return orcamento.getValor() * 0.05;
		}else if(orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000){
			return orcamento.getValor() * 0.07;
		}
		else{
			return orcamento.getValor() * 0.08 + 30;
		}
	}
}
