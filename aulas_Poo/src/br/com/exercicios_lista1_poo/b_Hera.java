package br.com.exercicios_lista1_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class b_Hera {

	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {

		// Declaração de variáveis
		int colega1, colega2, colega3, colega4, colega5, minidade, total;

		// Solicita a idade do colega 1
		logger.info("Qual a idade do colega 1?");
		Scanner scanner = new Scanner(System.in);
		colega1 = scanner.nextInt(); //

		// Solicita a idade do colega 2
		logger.info("Qual a idade do colega 2?");
		colega2 = scanner.nextInt();

		// Solicita a idade do colega 3
		logger.info("Qual a idade do colega 3?");
		colega3 = scanner.nextInt();

		// Solicita a idade do colega 4
		logger.info("Qual a idade do colega 4?");
		colega4 = scanner.nextInt();

		// Solicita a idade do colega 5
		colega5 = scanner.nextInt();

		// Solicita a idade do próprio usuário
		logger.info("Qual é a minha idade?");
		minidade = scanner.nextInt();

		// Soma as idades de todos os colegas e do usuário
		total = colega1 + colega2 + colega3 + colega4 + colega5 + minidade;

		// Formata a mensagem com o total de tempo de vida
		String mensagemTotal = String.format("O tempo de vida meu e dos meus colegas é %d", total);

		// Exibe a mensagem
		System.out.printf(mensagemTotal);

		// Fecha o scanner
		scanner.close();
	}
}
