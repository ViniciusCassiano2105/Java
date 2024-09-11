package br.com.exercicios_lista2_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class a_Universo {

	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {

		// Criando um scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		int tentativas = 3;
		int universo = 42;

		// Laço para dar 3 tentativas ao usuário

		while (tentativas > 0) {
			logger.warning("Qual o significado da vida, do universo e tudo mais?");

			// Lê a entrada do usuário
			int resposta = scanner.nextInt();

			// Verifica se a resposta está correta
			if (resposta == universo) {
				String mensagemSignificado = String
						.format("Você acertou! O significado da vida, do universo e tudo mais é: %s", universo);
				logger.info(mensagemSignificado);
				break;
			} else {
				tentativas--;
				if (tentativas > 0) {
					String mensagemTentativa = String.format("Você está errado. Tentativas restantes: %d", tentativas);
					logger.info(mensagemTentativa);
				} else {

					logger.info("Você está errado.");
					String mensagemUniverso = String.format("O significado da vida, do universo e tudo mais é: %s", universo);
					logger.info(mensagemUniverso);

				}
			}
		}

		// Fecha o scanner
		scanner.close();
	}
}
