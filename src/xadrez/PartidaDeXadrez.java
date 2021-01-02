package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
	
		private Tabuleiro tabuleiro ;
		

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	
	
//metodo convertendo uma pe�a para a posicao de matriz e vice versa	
	public void novaPe�a(char coluna , int linha , Pe�aXadrez peca) {
		tabuleiro.posicaoInicialdaPe�a(peca, new XadrezPosicao(coluna, linha).aPosicao());
		
	}
	
	public void iniciarPartida() {
		novaPe�a('a', 1 ,new Torre(tabuleiro, Cores.WHITE));
	    novaPe�a('c', 7,new Rei(tabuleiro, Cores.WHITE));
	    novaPe�a('c', 1,new Rei(tabuleiro, Cores.BLACK));
	}
	
	
	//modelo antigo passando a matriz e n�o as posi�oes de xadrez
//	public void iniciarPartida() {
//		tabuleiro.posicaoInicialdaPe�a(new Torre(tabuleiro, Cores.WHITE), new Posicao(0, 0));
//		tabuleiro.posicaoInicialdaPe�a(new Rei(tabuleiro, Cores.WHITE), new Posicao(0, 4));
//		tabuleiro.posicaoInicialdaPe�a(new Rei(tabuleiro, Cores.BLACK), new Posicao(7, 4));
//	}
	
	
	
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
