package tabuleiro;

public class Pe�as {

	private Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	public Pe�as(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
		posicao = null; //posicao ao criar uma pe�a sempre ser� nulla pois ainda n�o foi colocada no tabuleiro 
	}


	protected Tabuleiro getTabuleiro() {// sem o set para que ninguem consiga alterar o tabuleiro e protegido sendo limitado o tabuleiro apenas para as pessas internas  
		return tabuleiro;
	}
	
	
	
}
