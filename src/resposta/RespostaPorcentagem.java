package resposta;
import enuns.Formato;
import model.Conta;


public class RespostaPorcentagem extends Resposta {
	
	public RespostaPorcentagem(Resposta proxima) {
		super(proxima);
		// TODO Auto-generated constructor stub
	}

	private StringBuilder sb = new StringBuilder();
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(Formato.PORCENTO.equals(req.getFormato())) {
			sb.append("%")
			.append(conta.getTitular())
			.append("%")
			.append(conta.getSaldo())
			.append("%");
			
			System.out.println(sb.toString());
		} else {
			super.proxima.responde(req, conta);
		}
	}

}
