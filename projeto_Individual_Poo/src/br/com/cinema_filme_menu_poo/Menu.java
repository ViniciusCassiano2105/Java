package br.com.cinema_filme_menu_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class Menu {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {

		boolean escolha = true;
		logger.info(Mensagem.BEM_VINDO);
		logger.info(Mensagem.LOGO);
		logger.info(Mensagem.PERGUNTA_NOME);
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.next();

		logger.info(String.format(Mensagem.ESCOLHA, nome));
		logger.info(Mensagem.EXBIR_RELATORIO);
		logger.info(Mensagem.GERAR_RELATORIO);
		logger.info(Mensagem.SAIR);

	}
}