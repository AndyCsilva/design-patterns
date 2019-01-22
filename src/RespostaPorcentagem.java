
public class RespostaPorcentagem implements Resposta {
	private final Formato formatoPorcentagem = Formato.PORCENTO;
	private Resposta proxima;

	public RespostaPorcentagem(Resposta proximo) {
		this.proxima = proximo;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(formatoPorcentagem.equals(req.getFormato())){
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		}else{
			proxima.responde(req, conta);
		}
	}

}
