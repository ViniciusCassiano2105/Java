package br.com.repetindo_instrucoes;

import java.util.Scanner;

public class Exercicio_2_Piramide_de_numero {

	public static void main(String[] args) {
		System.out.println("Digite um numero:");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		for (int i = 0; i <= numero; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
