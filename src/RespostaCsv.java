
public class RespostaCsv implements Resposta{

	private final Formato formatoCsv = Formato.CSV;
	private Resposta proximo;
	
	public RespostaCsv(Resposta proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(formatoCsv.equals(req.getFormato())){
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		}else{
			proximo.responde(req, conta);
		}
	}

}
