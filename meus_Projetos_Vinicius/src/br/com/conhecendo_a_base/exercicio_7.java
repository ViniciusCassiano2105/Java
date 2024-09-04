package br.com.conhecendo_a_base;

import java.util.Scanner;

/*
 * Faça um programa que converta um valor em dólar em reais.
 * 
 * Ex: Dólares = 100, Cotação = 4,92 => O valor em reais é R$ 492,00.
 */
public class exercicio_7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o valor em dólar: ");
    double valorEmDolar = scanner.nextDouble();
    
    System.out.println("Digite a cotação do dolar");
    double cotacaoDolar = scanner.nextDouble();
    
    double valorEmReal = valorEmDolar * cotacaoDolar;
    System.out.printf("O valor em reais é R$ %.2f", valorEmReal);
    scanner.close();
    
    
  }
}
