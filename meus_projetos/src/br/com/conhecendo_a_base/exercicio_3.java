package br.com.conhecendo_a_base;

import java.util.Scanner;

public class exercicio_3 {
	
	/*Imprimir a tabuada de um número.
	 * 
	 * 1. ler um número
	 * 2. Imprimir sua tabuada
	 */

	public static void main(String[] args) {
		
		int numeroUsuario;
		
		System.out.println("Escreva um número de 1 a 10 para saber o resultado da multiplicação.");
		Scanner scanner = new Scanner(System.in);
		numeroUsuario = scanner.nextInt();
		System.out.println(numeroUsuario + " x 1 = " + (1 * numeroUsuario));
		System.out.println(numeroUsuario + " x 2 = " + (2 * numeroUsuario));
		System.out.println(numeroUsuario + " x 3 = " + (3 * numeroUsuario));
		System.out.println(numeroUsuario + " x 4 = " + (4 * numeroUsuario));
		System.out.println(numeroUsuario + " x 5 = " + (5 * numeroUsuario));
		System.out.println(numeroUsuario + " x 6 = " + (6 * numeroUsuario));
		System.out.println(numeroUsuario + " x 7 = " + (7 * numeroUsuario));
		System.out.println(numeroUsuario + " x 8 = " + (8 * numeroUsuario));
		System.out.println(numeroUsuario + " x 9 = " + (9 * numeroUsuario));
		System.out.println(numeroUsuario + " x 10 = " + (10 * numeroUsuario));
		scanner.close();
		
		
		
	}

}
