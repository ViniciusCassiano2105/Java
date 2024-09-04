package br.com.conhecendo_a_base;
/*
* Exercício 1:
* 
* Dadas 3 notas, imprimir a média aritimética do aluno.
* 
* 1. Ler 3 notas
* 2. Calcular média
* 3. Imprimir o resultado
* 
* Fórmula: MA = (n1 + n2 + n3) / 3
* 
*/

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		//Notas do aluno, média das notas
		Double nota1;
		Double nota2;
		Double nota3;
		Double media;
		
		
		System.out.println("Escreva a primeira nota:");
		Scanner scanner = new Scanner(System.in);
		nota1 = scanner.nextDouble();
		System.out.println("Escreva a segunda nota:");
		nota2 = scanner.nextDouble();
		System.out.println("Escreva a terceira nota:");
		nota3 = scanner.nextDouble();
		scanner.close();
		media = (nota1 + nota2 + nota3) / 3;
		System.out.printf ("A média do alino é %.2f",media);

	}

}
