package br.com.exercicios_poo;

public class IntegerBalancoTri {

	public static void main(String[] args) {
		
		/*
		 * A classe Integer é a classe wrapper para o tipo primitivo int em Java.
		 * Ela permite tratar números inteiros como objetos e é útil em coleções e APIs
		 * que requerem tipos de referência. O tipo primitivo int é eficiente para operações
		 * matemáticas e possui um intervalo de valores de -2.147.483.648 a 2.147.483.647.
		 * Para representar números inteiros e realizar cálculos com eles, use int. Para
		 * funcionalidades adicionais e quando precisar de objetos, use Integer.
		 */
		
		Integer gastosJaneiro = 15000;
		Integer gastosFevereiro = 23000;
		Integer gastosMarco = 17000;
		Integer gastosTrimestre;
		
		gastosTrimestre= gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("O gasto trimestral da empresa é: R$" + gastosTrimestre);
		
	}
	
}
