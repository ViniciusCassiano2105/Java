package br.com.exercicios_poo;

import java.util.Scanner;

public class c_2_Triangulo {

	public static void main(String[] args) {
		System.out.println("Insira os valores dos três ângulos de um triângulo: ");
		System.out.println("Primeiro ângulo:");
		Scanner scanner = new Scanner(System.in);
		int angulo1 = scanner.nextInt();
		System.out.println("Segundo ângulo:");
		int angulo2 = scanner.nextInt();
		System.out.println("Terceiro ângulo:");
		int angulo3 = scanner.nextInt();
		
		if(angulo1 + angulo2 + angulo3 != 180) {
			System.out.println("Os ângulos fornecidos não formam um triângulo válido.");
		}else if(angulo1 == 90 || angulo2 == 90 || angulo3 ==90 ){
			System.out.println("Retãngulo");
		}else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90 ){
			System.out.println("Obtusângulo");
		}else{
			System.out.println("Acutângulo");
		}
		
	}

}
