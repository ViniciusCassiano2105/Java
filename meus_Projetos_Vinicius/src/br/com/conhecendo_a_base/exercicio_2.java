package br.com.conhecendo_a_base;

import java.util.Scanner;

public class exercicio_2 {
	/*Escreva um programa que leia uma idade em anos e imprima
	 * essa idade em dias.
	 * 
	 * Ex: 1 ano => 365 dias de idade.
	 */
	public static void main(String[] args) {
		
		int idadeEmAnos;
		int idadeEmDias;
		
		System.out.println("Escreva quantos anos você tem:");
		Scanner scanner = new Scanner (System.in);
		idadeEmAnos = scanner.nextInt();
		scanner.close();
		idadeEmDias = idadeEmAnos * 365;
		System.out.printf("Sua idade em dias é: %d dias",idadeEmDias);
	}

}
