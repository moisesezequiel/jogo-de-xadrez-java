package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cores;
import xadrez.Pe�aXadrez;

public class Torre  extends Pe�aXadrez{

	public Torre(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro, cores);
	}

	@Override
	public String toString() {
		return "T";
	}

	
}
