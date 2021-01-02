package application;

import xadrez.Cores;
import xadrez.Pe�aXadrez;

public class UI {

	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void imprimirTabuleiro(Pe�aXadrez[][] pe�as) {
		for (int i = 0; i < pe�as.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pe�as.length; j++) {
				imprimirPe�a(pe�as[i][j],false);
			}
			System.out.println();
		}
		System.out.print("  A B C D E F G H");
	}

	// metodo para imprimir a pe�a do xadrez
	private static void imprimirPe�a(Pe�aXadrez pe�a, boolean background) {
		if (background) {
			System.out.print(ANSI_BLUE_BACKGROUND);
		}
    	if (pe�a == null) {
            System.out.print("-" + ANSI_RESET);
        }
        else {
            if (pe�a.getCores() == Cores.WHITE) {
                System.out.print(ANSI_WHITE + pe�a + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + pe�a + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}

}
