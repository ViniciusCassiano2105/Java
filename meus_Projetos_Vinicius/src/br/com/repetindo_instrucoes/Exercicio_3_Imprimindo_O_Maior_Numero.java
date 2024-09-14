package br.com.repetindo_instrucoes;

import java.util.Scanner;

public class Exercicio_3_Imprimindo_O_Maior_Numero {

	 public static void main(String[] args) {
		 System.out.println("Digite alguns números e quando quiser parar digite um numero negativo");
	        Scanner scanner = new Scanner(System.in);
	        int maiorNumero = 0;
	 
	        while (true) {
	            int numero = scanner.nextInt();
	 
	            if (numero < 0) {
	                break;
	            }
	 
	            if (numero > maiorNumero) {
	                maiorNumero = numero;
	            }
	        }
	 
	        System.out.println(maiorNumero);
	        scanner.close();
	    }
	}