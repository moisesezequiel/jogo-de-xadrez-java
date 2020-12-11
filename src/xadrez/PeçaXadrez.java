package xadrez;

import tabuleiro.Peças;
import tabuleiro.Tabuleiro;

public class PeçaXadrez extends Peças {

	
	private Cores cores;

	public PeçaXadrez(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro);
		this.cores = cores;
	}

//cor de uma peça só pode ser acessada e não modificada	
	public Cores getCores() {
		return cores;
	}
	

}
