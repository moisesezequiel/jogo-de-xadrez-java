package tabuleiro;

public class Tabuleiro {
	
	private int linhas; // linhas do tabuleiro
	private int colunas; //colunas do tabuleiro
	private Pe�as [][] pe�as ;
	
	public Tabuleiro(int linhas, int colunas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Pe�as[linhas][colunas]; // pe�as sempre iniciaram em uma linha e uma coluna 
	
	}
	
	
//get e set sem as pe�as pois metodos que ir�o movimentar elas 
	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	
	
	
}
