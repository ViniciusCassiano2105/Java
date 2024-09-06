package br.com.tomando_decisoes_no_codigo;

import java.util.Scanner;

/*
 * Leia um número e imprima se ele é par ou ímpar.
 */
public class Exercicio2_ParImpar {
	public static void main(String[] args) {

		System.out.println("Digite um numero para saber se ele é par ou ímpar");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Numero desejado:");
		int numero = scanner.nextInt();
		scanner.close();
		if (numero % 2 == 0)
			System.out.println("O número que você digitou é par.");
		else
			System.out.println("o numero que você digitou é ímpar.");

	}
}
