package application;

import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class Program {

	public static void main(String[] args) {
	
		PartidaDeXadrez match = new PartidaDeXadrez();
		UI.imprimirTabuleiro(match.getPeças());
	}

}
