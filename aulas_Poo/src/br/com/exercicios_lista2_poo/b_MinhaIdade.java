package br.com.exercicios_lista2_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

import java.time.Year;

public class b_MinhaIdade {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {

		// Criando um scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		logger.warning("Qual o ano que você nasceu?");

		// Lê o ano de nascimento fornecido pelo usuário
		int anoNascimento = scanner.nextInt();

		// Obtém o ano atual usando a classe Year
		int anoAtual = Year.now().getValue();

		// Calcula a idade
		int idade = anoAtual - anoNascimento;

		// Exibe a idade do usuário

		String mensagemAnos = String.format("A sua idade é %d:", idade);
		logger.info(mensagemAnos);

		// Fechar o scanner após o uso
		scanner.close();
	}
}
