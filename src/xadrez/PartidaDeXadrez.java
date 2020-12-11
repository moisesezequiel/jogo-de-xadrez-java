package xadrez;

import java.awt.Color;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
	
		private Tabuleiro tabuleiro ;
		

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	
	public void iniciarPartida() {
		tabuleiro.posicaoInicialdaPeça(new Torre(tabuleiro, Cores.WHITE), new Posicao(0, 0));
		tabuleiro.posicaoInicialdaPeça(new Rei(tabuleiro, Cores.WHITE), new Posicao(0, 4));
		tabuleiro.posicaoInicialdaPeça(new Rei(tabuleiro, Cores.BLACK), new Posicao(7, 4));
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
