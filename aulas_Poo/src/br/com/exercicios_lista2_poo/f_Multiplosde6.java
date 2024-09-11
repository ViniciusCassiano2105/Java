package br.com.exercicios_lista2_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class f_Multiplosde6 {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {

		int i;

		// Criando o scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Exibe a mensagem inicial
		logger.warning("Escreva 2 números acima de 100:");

		// Lê o primeiro número e verifica se é maior que 100
		logger.info("1º número:");
		int num1 = scanner.nextInt();
		while (num1 < 100) {
			logger.info("Digite um número maior que 100:");
			num1 = scanner.nextInt();
		}

		// Lê o segundo número e verifica se é maior que 100
		logger.info("2º número:");
		int num2 = scanner.nextInt();
		while (num2 < 100) {
			logger.info("Digite um número maior que 100:");
			num2 = scanner.nextInt();
		}

		// Loop para encontrar e exibir os múltiplos de 6 no intervalo

		String mensagemMultiplo = String.format("Múltiplos de 6 entre %d e %d:", num1, num2);
		logger.info(mensagemMultiplo);
		for (i = num1; i <= num2; i++) {
			if (i % 6 == 0) {
				String mensagemResultado = String.format("Resultado: %d", i);
				logger.info(mensagemResultado); // Exibe o número se for múltiplo de 6
			}
		}

		// Fecha o scanner
		scanner.close();
	}
}
