package br.com.exercicios_lista2_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class g_Estudos_Da_Madrugada {

	// Instância do Logger para registrar informações no log
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) throws InterruptedException {

		// início do programa
		logger.info("Programa estudos da madrugada\n");

		// Pergunta ao usuário quantos estudantes têm na turma
		logger.info("Quantos estudantes têm na turma?\n");

		//	entrada do usuário, que informa a quantidade de estudantes
		Scanner scanner = new Scanner(System.in);
		double qtdTurma = scanner.nextDouble();
		
		//  mensagem de "Aguarde" e simula uma espera com pontos
		logger.warning("Aguarde\n");
		Thread.sleep(1000);
		logger.info(".");
		Thread.sleep(1000);
		logger.info(".");
		Thread.sleep(1000);
		logger.info(".");
		Thread.sleep(1000);
		//	 Calcula quantos estudantes estudam de madrugada nas duas primeiras disciplinas
		double qtdPrimeira = qtdTurma * 0.35;
		double qtdSegunda = qtdTurma * 0.64;
		// Calcula a média de estudantes que estudam de madrugada nas duas disciplinas
		double media = (qtdPrimeira + qtdSegunda) / 2.0;
		
		// Arredonda a média para o número inteiro mais próximo
		long arrend = Math.round(media);
		
		// Formata a mensagem para exibir a quantidade de estudantes e a média arredondada
		String mensagem = String.format("Em uma turma com %.0f estudantes informados, em média %d estudantes estudam de madrugada nas primeiras disciplinas\n", qtdTurma, arrend);
		
		// Exibe a mensagem formatada no log
		logger.info(mensagem);
	}

}
