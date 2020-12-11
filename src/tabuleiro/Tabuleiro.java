package tabuleiro;

public class Tabuleiro {
	
	private int linhas; // linhas do tabuleiro
	private int colunas; //colunas do tabuleiro
	private Pe�as [][] pe�as ;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 ||colunas < 1) {
			throw new TabuleiroException("ERRO AO CRIAR O TABULEIRO... � NECESSARIO PELO MENOS 1 LINHA E UMA COLUNA ");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Pe�as[linhas][colunas]; // pe�as sempre iniciaram em uma linha e uma coluna 
	
	}
	
	public void posicaoInicialdaPe�a(Pe�as pe�a , Posicao posicao) {//pega a pe�a em determinada linha e coluna e movimenta pra posi��o que vem como parametro
		if (essaPe�aExiste(posicao)) {
			throw new TabuleiroException("ESSA PE�A JA EXISTE EM TAL POSI��O" + posicao);
		}
		pe�as[posicao.getLinha()] [posicao.getColuna()] = pe�a;
		pe�a.posicao = posicao;
	}
	
	//metodo que retorna a pe�a com base na sua linha e coluna 
	public Pe�as pe�a (int linha, int coluna) {
		if (!essaPosicaoExiste(linha, coluna)) {
			throw new TabuleiroException("ESSA POSICAO N�O EXISTE NO TABULEIRO");
		}
		return pe�as [linha] [coluna];
	}
	
	//metodo que retorna a pe�a com base na posi��o escolhida 
	public Pe�as pe�a (Posicao posi��o) {
		if (!essaPosicaoExiste(posi��o)) {
			throw new TabuleiroException("ESSA POSICAO N�O EXISTE NO TABULEIRO");
		}
		return pe�as [posi��o.getLinha()] [posi��o.getColuna()];
	}
	
	//metodo de verificacao se a posi�ao existe com base na linha e coluna 
	private boolean essaPosicaoExiste(int linha, int coluna) {
		return linha >=0 && linha <linhas && coluna >=0 && coluna < colunas;
		
	}
	//reaproveitando metodo acima
	private boolean essaPosicaoExiste(Posicao posicao) {
		return essaPosicaoExiste(posicao.getLinha(), posicao.getColuna());
		
	}
	//verificando se essa pe�a existe com base na posicao escolhida 
	private boolean essaPe�aExiste(Posicao posicao) {	
		if (!essaPosicaoExiste(posicao)) {
			throw new TabuleiroException("ESSA POSICAO N�O EXISTE NO TABULEIRO");
		}
		return pe�a(posicao) !=null;
	}
	
	
//apenas Get pois n�o ser� possivel modificar a quantidade de linha nem colunas 
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	
	
}
