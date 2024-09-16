package br.com.cinema_filme_menu_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class Menu {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {
		boolean escolha = true;
		LeitorArquivo.leitor("Banco");
		
		
		logger.info(Mensagem.BEM_VINDO);
		logger.info(Mensagem.LOGO);
		logger.info(Mensagem.PERGUNTA_NOME);
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.next();
		
		while(escolha) {
			
		logger.info(String.format(Mensagem.ESCOLHA, nome));
		logger.info(Mensagem.EXIBIR_RELATORIO);
		logger.info(Mensagem.GERAR_RELATORIO);
		logger.info(Mensagem.SAIR);
		
		int opcao = scanner.nextInt();
		
		switch(opcao) {
		
		case 1:
			logger.info(Mensagem.OPCAO_EXIBIR_RELATORIO);
			break;
			
		case 2:
			logger.info(Mensagem.OPCAO_GERAR_RELATORIO);
			break;
			
		case 3:
			logger.info(Mensagem.OPCAO_PERGUNTA_SAIR_SISTEMA);
			
			
			String selecao = scanner.next();
			
			switch(selecao.toUpperCase()) {
			case "S":
				logger.info(Mensagem.OPCAO_SIM_OBRIGADO_UTILIZAR_SISTEMA);
				escolha = false;
				break;
				
			case "N":
				logger.info(Mensagem.OPCAO_NAO_VOLTANDO_SISTEMA);
				break;
				
			default:
				logger.info(Mensagem.OPCAO_INVALIDA);
				break;
			
			}
			break;
			
		default:
			logger.info(Mensagem.OPCAO_INVALIDA);
			break;
		
		}
		
		}
		scanner.close();
	}
}