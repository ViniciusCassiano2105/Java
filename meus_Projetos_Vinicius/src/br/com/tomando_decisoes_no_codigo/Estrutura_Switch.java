package br.com.tomando_decisoes_no_codigo;

import java.io.Console;
import java.util.Scanner;

public class Estrutura_Switch {

	public static void main(String[] args) {
		
		// A, B, C, D ou F
		Console console = System.console();
		System.out.println("Informe a nota do aluno (A, B, C, D, F):");
		Scanner scanner = new Scanner(System.in);
		String nota = scanner.nextLine();
				switch(nota){
					case "A" -> System.out.println("Excelente");
					case "B" -> System.out.println("Bom");
					case "C" -> System.out.println("Regular");
					case "D" -> System.out.println("Ruim");
					case "F" -> System.out.println("Péssimo");
					default -> System.out.println("Opção invalida");
					
					
				}
	}

}
