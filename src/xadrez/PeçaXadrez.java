package xadrez;

import tabuleiro.Pe�as;
import tabuleiro.Tabuleiro;

public class Pe�aXadrez extends Pe�as {

	
	private Cores cores;

	public Pe�aXadrez(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro);
		this.cores = cores;
	}

//cor de uma pe�a s� pode ser acessada e n�o modificada	
	public Cores getCores() {
		return cores;
	}
	

}
