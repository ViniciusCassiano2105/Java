package br.com.tomando_decisoes_no_codigo;

import java.util.Scanner;

public class Estruturas_De_Selecao {

	public static void main(String[] args) {
		System.out.println("Digite uma opção de 1 à 4");
		Scanner scanner = new Scanner(System.in);
		int escolha = scanner.nextInt();
		scanner.close();
		String mensagem = switch(escolha) {
		case 1 -> "Obrigado por se inscrever!";
		case 2 -> "Obrigado pelo like!";
		case 3 -> "Obrigado por compartilhar!";
		case 4 -> "Obrigado por ativas as notificações!";
		default -> "Opção não suportada!";
		
		};
		System.out.println(mensagem);
	}

}
