package br.com.exercicios_lista1_poo;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class c_zeus {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {

		// Criando um scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		try {
			// Operação de Soma
			logger.info("Escreva dois números para soma, entre 0 à 1000");
			logger.info("Primeiro nº: ");
			int n1 = scanner.nextInt();
			logger.info("Segundo nº: ");
			int n2 = scanner.nextInt();
			int soma = n1 + n2;

			String mensagemSoma = String.format("A soma dos dois números é: %d", soma);
			logger.info(mensagemSoma);

			// Operação de Subtração
			logger.info("Escreva dois números para subtração entre 0 à 1000");
			logger.info("Primeiro nº: ");
			int n3 = scanner.nextInt();
			logger.info("Segundo nº: ");
			int n4 = scanner.nextInt();
			int subtracao = n3 - n4;
			String mensagemSubtracao = String.format("A subtração dos dois números é: %d", subtracao);
			logger.info(mensagemSubtracao);

			// Operação de Multiplicação
			logger.info("Escreva dois números para multiplicação entre 0 à 1000");
			logger.info("Primeiro nº: ");
			int n5 = scanner.nextInt();
			logger.info("Segundo nº: ");
			int n6 = scanner.nextInt();
			int multiplicacao = n5 * n6;
			String mensagemMultiplicacao = String.format("A multiplicação dos dois números é: %d", multiplicacao);
			logger.info(mensagemMultiplicacao);

		} catch (InputMismatchException e) {
			// Captura o erro quando uma letra é digitada em vez de um número
			logger.info("Erro: Você inseriu um valor inválido. Por favor, insira apenas números inteiros.\n");
		} finally {
			// Fechar o scanner após o uso
			scanner.close();
		}
	}
}
