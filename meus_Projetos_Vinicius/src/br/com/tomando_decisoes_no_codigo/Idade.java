package br.com.tomando_decisoes_no_codigo;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		System.out.println("Digite a sua idade:");
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		if (idade >= 18) 
			System.out.println("Pode assistir o filme.");
		else
			System.out.println("Você não e maior de 18 anos.");
				
		}

	}


