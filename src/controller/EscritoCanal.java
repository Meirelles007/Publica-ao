package controller;

public class EscritoCanal implements IObservador,IPostagem {

	@Override
	public void postagem() {
		System.out.println("Um novo Video esta postado pra curtidas novas");
	}

	@Override
	public void curtida() {
		System.out.println("Vc curtiu video novo ");
	}
	
	@Override
	public void update(String acao) {
		if (acao.equals("postagem"))
			postagem();
		if (acao.equals("curdida"))
			curtida();
	}

}
