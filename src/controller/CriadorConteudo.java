package controller;

public class CriadorConteudo implements IObservavel,IPostagem{

	private EscritoCanal escritoCanal;
	private String acao;
	
	public CriadorConteudo(EscritoCanal escritoCanal) {
		this.escritoCanal = escritoCanal;
	}

	@Override
	public void notificaMudanca(String acao) {
		escritoCanal.update(acao);
	}

	@Override
	public void postagem() {
		acao ="postagem";
		System.out.println("Video novo na Rede");
		notificaMudanca(acao);
	}
	
	@Override
	public void curtida() {
		acao ="curtida";
		System.out.println("Curtida nova na rede ");
		notificaMudanca(acao);
	}
	
}