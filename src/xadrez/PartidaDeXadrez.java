package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {
	
		private Tabuleiro tabuleiro ;
		

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	
	
	//metodo que retorna a matriz de pe�as da  partida de xadrez
	public Pe�aXadrez [][] getPe�as(){
			Pe�aXadrez [][] mat = new  Pe�aXadrez[tabuleiro.getLinhas()] [tabuleiro.getColunas()];
			for (int i = 0; i < tabuleiro.getLinhas(); i++) {
				for (int j = 0; j < tabuleiro.getColunas(); j++) {
					mat[i][j]= (Pe�aXadrez)tabuleiro.pe�a(i, j);
				}
				
			}
			return mat;
	}

}
