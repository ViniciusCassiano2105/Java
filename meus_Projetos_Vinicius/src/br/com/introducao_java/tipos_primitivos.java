package br.com.introducao_java;

public class tipos_primitivos {

	public static void main(String[] args) {
		// tipos numéricos inteiros - byte, short, int, long
//			int numero1 = 1;
//			int numero2 = 2;
//			int soma = numero1 + numero2;
//			System.out.println(soma);
			
//			// Tipos decimais - float, double
//			double numero1 = 1.5;
//			double numero2 = 1.5;
//			double soma = numero1 + numero2;
//			System.out.println(soma);
			
			//Char e boolean
//			char operador = '+';
//			double resultado = soma( 2.5, 7.5);
//			System.out.println(operador + ": " + resultado);
		
		//boolean
		char operador = '+';
		
		double numero1 = 1.5;
		double numero2 = 2.5;
		
		double resultado = soma(numero1, numero2);
		System.out.println(operador + ": " + resultado);
		
		boolean ehIgual = numero1 < numero2;
		System.out.println(ehIgual);
		
			
	}
		static double soma(double numero1, double numero2) {
			return numero1 + numero2;
		}
}
