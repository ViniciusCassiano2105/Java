package br.com.exercicios_lista1_poo;

import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class e_Apolo {

	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {

		// Declaração de variáveis
		int soma;
		int segundaSoma;

		// Operação a: Realiza a operação matemática com os números indicados
		logger.info("a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66 é igual a:");

		// Calcula a expressão aritmética
		soma = 2 + 3 - (5 * 8) - 4 + 354 - 521 + (7 * 66);

		// Formata e exibe o resultado da primeira operação
		String mensagemSomaConta = String.format("%d\n", soma);
		logger.info(mensagemSomaConta);

		// Operação b: Realiza uma segunda operação matemática com números
		logger.info("b. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9 é igual a:");

		// Calcula a segunda expressão aritmética
		segundaSoma = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;

		// Formata e exibe o resultado da segunda operação
		String mensagemSegundaSomaConta = String.format("%d", segundaSoma);
		logger.info(mensagemSegundaSomaConta);
	}
}
