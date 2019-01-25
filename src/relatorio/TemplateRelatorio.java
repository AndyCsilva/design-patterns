package relatorio;

import model.Banco;

public abstract class TemplateRelatorio implements Relatorio {
	
	String TRACOS_PARALELOS = "========================";
	String TRACOS = "-------------------------";
	
	@Override
	public final void imprimir(Banco banco) {
		System.out.println("\n"+TRACOS_PARALELOS.concat(TRACOS_PARALELOS).concat(TRACOS_PARALELOS.concat(TRACOS_PARALELOS)));
		cabecalho(banco);
		System.out.println(TRACOS.concat(TRACOS).concat(TRACOS));
		corpo(banco);
		System.out.println(TRACOS.concat(TRACOS).concat(TRACOS));
		rodape(banco);
		System.out.println(TRACOS_PARALELOS.concat(TRACOS_PARALELOS).concat(TRACOS_PARALELOS.concat(TRACOS_PARALELOS)) + "\n");
	}

	protected abstract void rodape(Banco banco);

	protected abstract void corpo(Banco banco);

	protected abstract void cabecalho(Banco banco);

}
