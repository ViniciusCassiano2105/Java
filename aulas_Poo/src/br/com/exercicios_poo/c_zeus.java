package br.com.exercicios_poo;

import java.util.Scanner;

public class c_zeus {
	    
    public static void main(String[] args) {
       
        int n1, n2, soma, n3, n4, subtracao, n5, n6, multiplicacao;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMA ZEUS\n");
        System.out.println("Escreva dois números para soma, entre 0 à 1000");
        System.out.print("Primeiro nº: ");
        n1 = scanner.nextInt();
        System.out.print("Segundo nº: ");
        n2 = scanner.nextInt();
        soma = n1 + n2;
        System.out.println("A soma dos dois números é: " + soma + ".\n");

        System.out.println("Escreva dois números para subtração entre 0 à 1000");
        System.out.print("Primeiro nº: ");
        n3 = scanner.nextInt();
        System.out.print("Segundo nº: ");
        n4 = scanner.nextInt();
        subtracao = n3 - n4;
        System.out.println("A subtração dos dois números é: " + subtracao + ".\n");
        
        System.out.println("Escreva dois números para multiplicação entre 0 à 1000");
        System.out.print("Primeiro nº: ");
        n5 = scanner.nextInt();
        System.out.print("Segundo nº: ");
        n6 = scanner.nextInt();
        multiplicacao = n5 * n6;
        System.out.println("A multiplicação dos dois números é: " + multiplicacao + ".\n");
        scanner.close();
	    }
	}



