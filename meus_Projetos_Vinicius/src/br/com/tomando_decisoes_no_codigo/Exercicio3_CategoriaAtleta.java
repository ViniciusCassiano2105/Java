package br.com.tomando_decisoes_no_codigo;

import java.util.Scanner;

/*
 * Dada a idade do atleta, imprima sua categoria:
 * 
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 */
public class Exercicio3_CategoriaAtleta {
  public static void main(String[] args) {
    System.out.println("Escreva a idade do atleta:");
    Scanner scanner = new Scanner(System.in);
    
    int idade = scanner.nextInt();
    scanner.close();
    if (idade >= 10 && idade <= 12) {
    	System.out.println("Atleta Mirim");
    }else if(idade >= 13 && idade <= 15) {
    	System.out.println("Atleta Infantil");
	}else if(idade >= 16 && idade <= 18) {
		System.out.println("Atleta Juvenil");
	}else {
		System.out.println("Idade não compatível");
	}
  }
}
