package tabuleiro;

public class Tabuleiro {
	
	private int linhas; // linhas do tabuleiro
	private int colunas; //colunas do tabuleiro
	private Peças [][] peças ;
	
	public Tabuleiro(int linhas, int colunas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peças[linhas][colunas]; // peças sempre iniciaram em uma linha e uma coluna 
	
	}
	
	
//get e set sem as peças pois metodos que irão movimentar elas 
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
