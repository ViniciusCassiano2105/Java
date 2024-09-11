package br.com.exercicios_lista2_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class c_2_Triangulo {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {
		logger.warning("Insira os valores dos três ângulos de um triângulo: ");

		logger.info("Primeiro ângulo:");
		
		// Criando um scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

			
		// Lendo o valor do primeiro ângulo
		int angulo1 = scanner.nextInt();
		
		// Lendo o valor do segundo ângulo
		logger.info("Segundo ângulo:");
		int angulo2 = scanner.nextInt();

		// Lendo o valor do terceiro ângulo
		logger.info("Terceiro ângulo:");
		int angulo3 = scanner.nextInt();
		
		//	Verifica se a soma dos ângulos é 180
		if (angulo1 + angulo2 + angulo3 != 180) {
			logger.info("Os ângulos fornecidos não formam um triângulo válido.");
			
		//	Verifica se o triângulo é retângulo
		} else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			logger.info("Retãngulo");
			
		//	Verificando se o triângulo é obtusângulo	
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			logger.info("Obtusângulo");
			
		// Se todos os ângulos forem menores que 90, o triângulo é acutângulo	
		} else {
			logger.info("Acutângulo");
		}
		// Fecha o scanner
		scanner.close();
	}

}
