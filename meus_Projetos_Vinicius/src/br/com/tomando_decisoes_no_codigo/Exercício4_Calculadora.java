package br.com.tomando_decisoes_no_codigo;

/*
 * Crie uma calculadora que dados 2 números e uma operação 
 * (adição, subtração, multiplicação ou divisão), retorne o 
 * resultado dessa operação entre os dois números.
 * 
 * Ex: 
 *   1 2 * => 1 * 2 = 2
 *   8 2 / => 8 / 2 = 4
 */

import java.util.Scanner;

public class Exercício4_Calculadora {
  public static void main(String[] args) {
    System.out.println("Escreva dois números:");
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Primeiro Número:");
    int numero1 = scanner.nextInt();
    System.out.println("Segundo Número:");
    int numero2 = scanner.nextInt();
    
     System.out.println("Escolha a operação que deseja para os números (* / + -)");
     String operacao = scanner.next();
     scanner.close();
     
     
    switch(operacao) {
    case "*" -> System.out.printf("Você selecionou multiplicação: %d %s %d = %d",numero1, operacao, numero2, numero1 * numero2); 
    case "/" -> System.out.printf("Você selecionou divisão: %d %s %d = %d",numero1, operacao, numero2, numero1 / numero2); 
    case "+" -> System.out.printf("Você selecionou adição: %d %s %d = %d",numero1, operacao, numero2, numero1 + numero2); 
    case "-" -> System.out.printf("Você selecionou subtração: %d %s %d = %d",numero1, operacao, numero2, numero1 - numero2); 
    default -> System.out.printf("Operador Inválido!"); 
    }
	
    
    
  }
}
