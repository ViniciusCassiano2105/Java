package br.com.exercicios_poo;

public class DoubleBalancoTri {

	public static void main(String[] args) {
			System.out.println
			("Em nossa empresa, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do\r\n"
			+ "primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos R$15000,\r\n"
			+ "em Fevereiro, R$ 23000, e em Março, R$ 17000, faça um programa que calcule e imprima\r\n"
			+ "o gasto total no trimestre.");
			
			/*
			 * O tipo primitivo double é usado para representar números de ponto flutuante com precisão dupla.
			 * Ele é rápido para cálculos matemáticos, mas pode sofrer com problemas de precisão devido à
			 * sua representação binária. Para cálculos que exigem alta precisão, como finanças, considere usar
			 * BigDecimal em vez de double.
			 */
			
			Double gastosJaneiro = 15000.0;
			Double gastosFevereiro = 23000.0;
			Double gastosMarco = 17000.0;
			Double gastosTrimestre;
			
			gastosTrimestre= gastosJaneiro + gastosFevereiro + gastosMarco;
			
			System.out.printf("O gasto trimestral da empresa é: R$%.2f", gastosTrimestre);
	}
	
}
