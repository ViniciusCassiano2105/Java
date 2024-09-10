package br.com.array_de_dados;

public class Array_Multidimensional {

	public static void main(String[] args) {
		
		
		// Array multidimensional
		// Dado tabular - Linhas e colunas
		int [][] sudoku = {{3, 6, 7}, {4, 9 , 8}, {5, 2, 1}};
		System.out.println(sudoku [0] [0]);
		sudoku[0] [0] = 1;
		sudoku[2] [2] = 3;
		
		System.out.println(sudoku [0] [0]);
		System.out.println(sudoku [2] [2]);
	
		for(int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku [i].length; j++) {
				System.out.println(sudoku [i] [j] + " ");
			}
			System.out.println();
		}
		for (int[] linhaSudoku : sudoku) {
			for (int numero : linhaSudoku) {
				System.out.println(numero + " ");
			}
			System.out.println();
		}
	}

}
