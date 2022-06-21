package view;

import controller.CriadorConteudo;
import controller.EscritoCanal;



public class Principal {
	
	public static void main(String[] args) {
		
		EscritoCanal escritoCanal = new EscritoCanal();
		CriadorConteudo criadorConteudo = new CriadorConteudo(escritoCanal);
		
		criadorConteudo.postagem();
		criadorConteudo.postagem();
		criadorConteudo.curtida();
		
	}
}
