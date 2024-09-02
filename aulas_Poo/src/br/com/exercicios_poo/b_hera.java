package br.com.exercicios_poo;

import java.util.Scanner;
public class b_hera {

	public static void main(String[] args) {
		
		int colega1, colega2, colega3, colega4, colega5, minidade, total;
		
		System.out.println("Qual a idade do colega 1?");
		Scanner scanner = new Scanner(System.in);
		colega1 = scanner.nextInt();
		System.out.println("Qual a idade do colega 2?");
		colega2 = scanner.nextInt();
		System.out.println("Qual a idade do colega 3?");
		colega3 = scanner.nextInt();
		System.out.println("Qual a idade do colega 4?");
		colega4 = scanner.nextInt();
		System.out.println("Qual a idade do colega 5?");
		colega5 = scanner.nextInt();
		System.out.println("Qual é a minha idade?");
		minidade = scanner.nextInt();
		total = colega1 + colega2 + colega3 + colega4 + colega5 + minidade;
		System.out.printf("o tempo de vida meu e dos meus colegas é %d", total);

	}

}
