package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {
	
		private Tabuleiro tabuleiro ;
		

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	
	
	//metodo que retorna a matriz de peças da  partida de xadrez
	public PeçaXadrez [][] getPeças(){
			PeçaXadrez [][] mat = new  PeçaXadrez[tabuleiro.getLinhas()] [tabuleiro.getColunas()];
			for (int i = 0; i < tabuleiro.getLinhas(); i++) {
				for (int j = 0; j < tabuleiro.getColunas(); j++) {
					mat[i][j]= (PeçaXadrez)tabuleiro.peça(i, j);
				}
				
			}
			return mat;
	}

}
