package br.com.tomando_decisoes_no_codigo;

import java.util.Scanner;

public class Idade_if_ternario {

	public static void main(String[] args) {

		System.out.println("Digite a sua idade:");
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();

		// If ternário: condição ? expressão1 : expressão2
		String mensagem = (idade >= 18) ? "Pode comprar o ingresso" : "Esse filme é para maiores de 18 anos.";
		System.out.println(mensagem);
	}

}
