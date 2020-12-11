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
	
	//metodo que retorna a peça com base na sua linha e coluna 
	public Peças peça (int linha, int coluna) {
		return peças [linha] [coluna];
	}
	
	//metodo que retorna a peça com base na posição escolhida 
	public Peças peça (Posicao posição) {
		return peças [posição.getLinha()] [posição.getColuna()];
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
