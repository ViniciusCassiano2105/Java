package br.com.exercicios_lista1_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class d_atena {

	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {
		// Declaração de variáveis
		int cels;

		// Mensagem solicitando a entrada de uma temperatura em Celsius
		logger.info("Digite uma temperatura em Celsius para converter em Fahrenheit:");

		// Criando um scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Lê a temperatura em Celsius fornecida pelo usuário
		cels = scanner.nextInt();

		// Converte a temperatura de Celsius para Fahrenheit usando a fórmula (Celsius *
		// 1.8 + 32)
		int fahr = (int) (cels * 1.8 + 32);

		// Formata a mensagem para exibir a temperatura convertida
		String mensagemTemperatura = String.format("A temperatura em Fahrenheit é %dº", fahr);

		// Exibe a mensagem
		logger.info(mensagemTemperatura);

		// Fecha o scanner
		scanner.close();
	}
}
