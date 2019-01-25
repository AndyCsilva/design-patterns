package resposta;
import enuns.Formato;
import model.Conta;


public class RespostaCsv extends Resposta {

	public RespostaCsv(Resposta proxima) {
		super(proxima);
	}

	private Resposta proxima;
	private StringBuilder sb = new StringBuilder();
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(Formato.CSV.equals(req.getFormato())) {
			sb.append(conta.getTitular())
			.append(";")
			.append(conta.getSaldo())
			.append(";");
			
			System.out.println(sb.toString());
		} else {
			super.proxima.responde(req, conta);
		}
	}

}
