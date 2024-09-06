package br.com.tomando_decisoes_no_codigo;

import java.util.Scanner;

/*
 * Crie uma calculadora de IMC que mostra em que classificação a
 * pessoa está:
 * 
 * Menor que 18,5    -> MAGREZA
 * Entre 18,5 e 24,9 -> NORMAL
 * Entre 25 e 29,9   -> SOBREPESO
 * Entre 30 e 39,9   -> OBESIDADE
 * Maior que 40      -> OBESIDADE GRAVE
 * 
 * IMC = peso / altura * altura
 * 
 */
public class Exercicio5_CalculadoraIMC {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
    System.out.println("Digite seu peso e altura");
    System.out.println("Peso:");
    Double peso = scanner.nextDouble();
    System.out.println("Digite sua altura:");
    Double altura = scanner.nextDouble();
    
    Double imc = peso / (altura * altura);
    
    if(> 18.5)
    	
    
  }
}
