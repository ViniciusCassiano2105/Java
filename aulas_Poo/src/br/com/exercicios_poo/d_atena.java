package br.com.exercicios_poo;

import java.util.Scanner;

public class d_atena {

	public static void main(String[] args) {
		int cels;
		int fahr;
		
		System.out.println("Digite uma temperatura em Celsius para converter em Fahrenheit:");
		Scanner scanner = new Scanner(System.in);
		cels = scanner.nextInt();
		fahr = (int) (cels * 1.8 + 32);
		System.out.printf("A temperatura em Fahrenheit é %dº", fahr);
				

	}

}
