package br.com.conhecendo_a_base;

import java.util.Scanner;

/*
 * Imprimir preço de um produto com base no desconto à vista e o valor economizado.
 * 
 * 1. Ler preço
 * 2. Ler % de desconto
 * 3. Imprimir novo preço e valor economizado em reais
 * 
 * Ex: R$100,00 com 10% de desconto = O preço com desconto é R$ 90,00 
 * e o valor economizado foi R$ 10,00
 */

public class exercicio_5 {
  public static void main(String[] args) {
	  
	  Double preco;
	  Double desconto;
	  Double porcentagemDesconto = 10.00;
	  Double precoComDesconto;
	  
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o preço do produto");
    preco = scanner.nextDouble();
    desconto = (porcentagemDesconto / 100) * preco;
    precoComDesconto = preco - desconto;
    System.out.printf("O preço do produto com desconto de %.2f%% é: R$%.2f%n", porcentagemDesconto, precoComDesconto);

	}
}



