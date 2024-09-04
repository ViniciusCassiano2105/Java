package br.com.conhecendo_a_base;

import java.util.Scanner;

/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 * 
 * Ex: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque médio é de 5 unidades.
 *
 *Passo 1: Ler a quantidade mínima e máxima do produto
 *Passo 2: Calcular o estoque médop
 *Passo 3: Imprimir uma mensagem para o usuário com o resultado
 *
 */
public class exercicio_6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
   System.out.println("Digite a quantidade mínima e máxima do produto: ");
   int quantidadeMinima = scanner.nextInt();
   int quantidadeMaxima = scanner.nextInt();
   
   int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
   
   System.out.printf("O estoque médio é de %d unidades.", estoqueMedio);
   
    
  }
}
