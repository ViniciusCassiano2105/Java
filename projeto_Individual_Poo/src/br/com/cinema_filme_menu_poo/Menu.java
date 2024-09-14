package br.com.cinema_filme_menu_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class Menu {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {

		boolean escolha = true;
		
		Scanner scanner = new Scanner(System.in);

		logger.info(Mensagem.BEM_VINDO);
		logger.info(Mensagem.LOGO);
		logger.info(Mensagem.PERGUNTA_NOME);
		String nome = scanner.next();
		while (escolha) {
			logger.info(Mensagem.ESCOLHA);
			logger.info(Mensagem.EXBIR_RELATORIO);
			logger.info(Mensagem.GERAR_RELATORIO);
			logger.info(Mensagem.SAIR);

		}
	}
}