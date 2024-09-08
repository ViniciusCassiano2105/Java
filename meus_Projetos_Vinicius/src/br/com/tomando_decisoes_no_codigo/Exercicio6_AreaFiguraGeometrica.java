package br.com.tomando_decisoes_no_codigo;

import java.util.Scanner;

/*
 * Dada uma figura geométrica (retangulo, triangulo, circulo), informar a sua área.
 * 
 * retangulo = base x altura
 * triangulo = (base x altura) / 2
 * circulo = pi x (raio * raio)
 */
public class Exercicio6_AreaFiguraGeometrica {

	public static void main(String[] args) {

		System.out.println(
				"Selecione a figura geométrica para saber a area :\n(1) Retangulo\n(2) Triângulo\n(3) Círculo ");
		Scanner scanner = new Scanner(System.in);

		int numero = scanner.nextInt();

		if (numero == 1) {
			System.out.println("Você selecionou Retãngulo\nDigite o valor da base e da altura:");
			System.out.println("Base");
			double valor1 = scanner.nextInt();
			System.out.println("Altura");
			double valor2 = scanner.nextInt();
			double resultado = valor1 * valor2;
			System.out.printf("A área do Retângulo é %.2f", resultado);
		} else if (numero == 2) {
			System.out.println("Você selecionou Triângulo\nDigite o valor da base e da altura:");
			System.out.println("Base");
			double valor1 = scanner.nextInt();
			System.out.println("Altura");
			double valor2 = scanner.nextInt();
			double resultado = (valor1 * valor2) / 2;
			System.out.printf("A área do Triângulo é %.2f", resultado);
		}else if (numero == 3) {
			System.out.println("Você selecionou Círculo\nDigite dois valores para o raio:");
			System.out.println("Valor 1");
			double valor1 = scanner.nextInt();
			System.out.println("Valor 2");
			double valor2 = scanner.nextInt();
			double resultado = valor1 * valor2;
			System.out.printf("A área do Círculo é %.2f", resultado);
		}
	}
}
