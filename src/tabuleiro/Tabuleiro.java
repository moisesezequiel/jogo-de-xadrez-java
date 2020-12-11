package tabuleiro;

public class Tabuleiro {
	
	private int linhas; // linhas do tabuleiro
	private int colunas; //colunas do tabuleiro
	private Peças [][] peças ;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 ||colunas < 1) {
			throw new TabuleiroException("ERRO AO CRIAR O TABULEIRO... É NECESSARIO PELO MENOS 1 LINHA E UMA COLUNA ");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peças[linhas][colunas]; // peças sempre iniciaram em uma linha e uma coluna 
	
	}
	
	public void posicaoInicialdaPeça(Peças peça , Posicao posicao) {//pega a peça em determinada linha e coluna e movimenta pra posição que vem como parametro
		if (essaPeçaExiste(posicao)) {
			throw new TabuleiroException("ESSA PEÇA JA EXISTE EM TAL POSIÇÃO" + posicao);
		}
		peças[posicao.getLinha()] [posicao.getColuna()] = peça;
		peça.posicao = posicao;
	}
	
	//metodo que retorna a peça com base na sua linha e coluna 
	public Peças peça (int linha, int coluna) {
		if (!essaPosicaoExiste(linha, coluna)) {
			throw new TabuleiroException("ESSA POSICAO NÃO EXISTE NO TABULEIRO");
		}
		return peças [linha] [coluna];
	}
	
	//metodo que retorna a peça com base na posição escolhida 
	public Peças peça (Posicao posição) {
		if (!essaPosicaoExiste(posição)) {
			throw new TabuleiroException("ESSA POSICAO NÃO EXISTE NO TABULEIRO");
		}
		return peças [posição.getLinha()] [posição.getColuna()];
	}
	
	//metodo de verificacao se a posiçao existe com base na linha e coluna 
	private boolean essaPosicaoExiste(int linha, int coluna) {
		return linha >=0 && linha <linhas && coluna >=0 && coluna < colunas;
		
	}
	//reaproveitando metodo acima
	private boolean essaPosicaoExiste(Posicao posicao) {
		return essaPosicaoExiste(posicao.getLinha(), posicao.getColuna());
		
	}
	//verificando se essa peça existe com base na posicao escolhida 
	private boolean essaPeçaExiste(Posicao posicao) {	
		if (!essaPosicaoExiste(posicao)) {
			throw new TabuleiroException("ESSA POSICAO NÃO EXISTE NO TABULEIRO");
		}
		return peça(posicao) !=null;
	}
	
	
//apenas Get pois não será possivel modificar a quantidade de linha nem colunas 
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	
	
}
