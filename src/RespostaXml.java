
public class RespostaXml implements Resposta{

	private final Formato formatoXml = Formato.XML;
	private Resposta proximo;
	
	public RespostaXml(Resposta proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if (formatoXml.equals(req.getFormato())) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
		} else {	
			proximo.responde(req, conta);
		}
	}

}
