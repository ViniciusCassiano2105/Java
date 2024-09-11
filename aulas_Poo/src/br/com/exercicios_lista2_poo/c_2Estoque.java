package br.com.exercicios_poo;

import java.util.Scanner;

//(Desafio) O programa "Estoque" irá solicitar que o cliente acesse um menu
//e escolha entre as opções (Listar Produtos com estoque; Listar Produtos
//sem estoque; Sair). Para gerar as listas será preciso simular um banco
//(vetores ou matrizes). Para cada opção, exibe a lista correspondente. Para a
//opção Sair, perguntar se deseja, realmente, sair e encerra o programa se a
//resposta for sim.
public class c_2Estoque {

	public static void main(String[] args) {
		String[] estoque = { "Mouse", "Teclado", "Monitor", "SSD", "Placa de vídeo" };
		String[] semEstoque = { "Caixa de som", "Placa de vídeo", "Mousepad", "Cadeira Gamer" };

		System.out.println("Escolha as opções que deseja visualizar:\n" + "(1) Produtos em estoque\n"
				+ "(2) Produtos sem estoque\n");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		if (opcao == 1) {
			for (String estoques : estoque) {
				System.out.println(estoques + " ");
			}
		} else if (opcao == 2) {
			for (String estoques2 : semEstoque) {
				System.out.println(estoques2 + " ");
			}
		} else {
			System.out.println("Opção inválida");

		}

	}
}