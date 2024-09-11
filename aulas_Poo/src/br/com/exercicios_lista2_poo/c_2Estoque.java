package br.com.exercicios_lista2_poo;

import java.util.Scanner;

public class c_2Estoque {

	public static void main(String[] args) {
		String[] estoque = { "Mouse", "Teclado", "Monitor", "SSD", "Placa de vídeo" };
		String[] semEstoque = { "Caixa de som", "Placa de vídeo", "Mousepad", "Cadeira Gamer" };
		
		boolean programa = true;
		
		while (programa) {
			System.out.println("Escolha as opções que deseja visualizar:\n" + "(1) Produtos em estoque\n"
					+ "(2) Produtos sem estoque\n(3) Sair");
			Scanner scanner = new Scanner(System.in);
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				// Produtos em estoque
				System.out.println("Produtos em estoque:");
				for (String produto : estoque) {
					System.out.println(produto);
				}
				break;

			case 2:
				// Produtos sem estoque
				System.out.println("Produtos sem estoque:");
				for (String produto : semEstoque) {
					System.out.println(produto);
				}
				break;

			case 3:
				// Confirma se o usuário realmente deseja sair
				System.out.println("Deseja realmente sair (S/N)?");
				String escolha = scanner.next();

				// Verifica a escolha do usuário
				switch (escolha.toUpperCase()) {
				case "S":
					System.out.println("Obrigado por utilizar nosso programa :)");
					programa = false; 
					break;

				case "N":
					System.out.println("Voltando ao menu...");
					break;
				}
			}
			 scanner.close();
		}
	}
}