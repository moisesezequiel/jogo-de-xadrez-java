package tabuleiro;

public class Peças {

	private Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	public Peças(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
		posicao = null; //posicao ao criar uma peça sempre será nulla pois ainda não foi colocada no tabuleiro 
	}


	protected Tabuleiro getTabuleiro() {// sem o set para que ninguem consiga alterar o tabuleiro e protegido sendo limitado o tabuleiro apenas para as pessas internas  
		return tabuleiro;
	}
	
	
	
}
