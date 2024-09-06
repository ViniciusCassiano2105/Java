package br.com.tomando_decisoes_no_codigo;
/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */

import java.util.Scanner;

public class Exercicio1_AprovadoReprovado {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
    System.out.println("Digite as 3 notas do aluno para saber a média:");
    System.out.println("Primeira nota:");
    Double nota1 = scanner.nextDouble();
    System.out.println("Segunda nota:");
    Double nota2 = scanner.nextDouble();
    System.out.println("Terceira nota:");
    Double nota3 = scanner.nextDouble();
    scanner.close();
    Double media = (nota1 + nota2 + nota3) / 3;
    
    if(media >= 7.0) {
    	System.out.println("Reprovado");
    }else {
    	System.out.println("Aprovado");
    }
  }
}
