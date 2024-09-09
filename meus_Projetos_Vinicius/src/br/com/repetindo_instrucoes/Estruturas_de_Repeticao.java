package br.com.repetindo_instrucoes;

import java.util.Scanner;

public class Estruturas_de_Repeticao {

	public static void main(String[] args) {
		int numero = 7;
		int tentativas = 5;
		Scanner scanner = new Scanner(System.in);
		
		while (tentativas > 0) {
			System.out.println("Digite um numero entre 1 e 10");
			int numeroFornecido = scanner.nextInt();
			
			if (numeroFornecido == numero) {
				System.out.println("Você acertou!");
				return;
			}else {
				tentativas--;
				System.out.println("Tente novamente");
			}
			
		}	
		System.out.println("Você esgotou todas as tentativas.");
		scanner.close();
	}
}
