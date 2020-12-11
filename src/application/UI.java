package application;

import xadrez.Pe�aXadrez;

public class UI {
	
	public static void imprimirTabuleiro(Pe�aXadrez[][]pe�as) {
		for (int i = 0; i < pe�as.length; i++) {
			System.out.print((8-i)+ " ");
			for (int j = 0; j < pe�as.length; j++) {
				imprimirPe�a(pe�as[i][j]);
			}
			System.out.println();
		}
		System.out.print("  A B C D E F G H");
	}
	
	
	
	//metodo para imprimir a pe�a do xadrez
	private static void imprimirPe�a(Pe�aXadrez pe�a) {
		if (pe�a == null) {
			System.out.print("-");
		}else {
			System.out.print(pe�a);
		}
		
		System.out.print(" ");
	}

}
