package br.com.exercicios_lista2_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class c_2_Estoque {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {
		String[] estoque = { "Mouse - 10un", "Teclado - 15un", "Monitor - 5un", "SSD - 3un", "Placa de vídeo - 2un" };
		String[] semEstoque = { "Caixa de som", "Placa de vídeo", "Mousepad", "Cadeira Gamer" };
		
		boolean programa = true;
		
		while (programa) {
			logger.warning("Escolha as opções que deseja visualizar:\n" + "(1) Produtos em estoque\n"
					+ "(2) Produtos sem estoque\n(3) Sair");
			Scanner scanner = new Scanner(System.in);
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				// Produtos em estoque
				logger.info("Produtos em estoque:");
				for (String produto : estoque) {
					logger.info(produto);
				}
				break;

			case 2:
				// Produtos sem estoque
				logger.info("Produtos sem estoque:");
				for (String produto : semEstoque) {
					logger.info(produto);
				}
				break;

			case 3:
				// Confirma se o usuário realmente deseja sair
				logger.info("Deseja realmente sair (S/N)?");
				String escolha = scanner.next();

				// Verifica a escolha do usuário
				switch (escolha.toUpperCase()) {
				case "S":
					logger.info("Obrigado por utilizar nosso programa :)");
					programa = false; 
					break;

				case "N":
					logger.info("Voltando ao menu...");
					break;
					
				}
				 scanner.close();
			}
		}
		
	}
}