package resposta;
import enuns.Formato;
import model.Conta;


public class RespostaXml extends Resposta {

	public RespostaXml(Resposta proxima) {
		super(proxima);
		// TODO Auto-generated constructor stub
	}

	private StringBuilder sb = new StringBuilder();
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(Formato.XML.equals(req.getFormato())) {
			sb.append("<conta>")
			.append("<titular>")
			.append(conta.getTitular())
			.append("</titular>")
			.append("<saldo>")
			.append(conta.getSaldo())
			.append("<saldo>")
			.append("</conta>");
			
			System.out.println(sb.toString());
		} else {
			super.proxima.responde(req, conta);
		}
	}


}
