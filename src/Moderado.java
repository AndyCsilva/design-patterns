import java.util.Random;


public class Moderado implements Investimento {
	
	private Random random;

	public Moderado() {
		random = new Random();
	}
	
	@Override
	public double investir(Conta conta) {
		if(random.nextBoolean()) return conta.getSaldo() * 0.025;
		else return conta.getSaldo() * 0.007;
	}
}
