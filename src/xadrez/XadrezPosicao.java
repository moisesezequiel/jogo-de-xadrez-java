package xadrez;

import tabuleiro.Posicao;

public class XadrezPosicao {
	
	private char coluna;
	private int linha;
	
	public XadrezPosicao(char coluna, int linha) {
		//Programaçao defensiva para nao iniciar uma linha e nem coluna invalida 
		if (coluna <'a' || coluna >'h' || linha <1 || linha >8) {
			throw new  XadrezException("ERRO AO INICIAR A TABULEIRO , POSICOES DEVEM SER ESCOLHIDAS ENTRE A1 E H8");
		}
		this.coluna = coluna;
		this.linha = linha;
	}
	public char getColuna() {
		return coluna;
	}
	public int getLinha() {
		return linha;
	}

	protected Posicao aPosicao() {
		return new Posicao(8 - linha, coluna -'a');
	}
	protected static XadrezPosicao paraPosicao(Posicao posicao) {
		return  new XadrezPosicao((char)('a' -posicao.getColuna()), 8 - posicao.getLinha());
		
	}
	@Override
	public String toString() {
		return ""+ coluna + linha;
	}
	
}
