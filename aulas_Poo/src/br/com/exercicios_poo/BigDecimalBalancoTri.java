package br.com.exercicios_poo;

/*
 * Importando a classe BigDecimal do pacote java.math.
 * BigDecimal é usado para realizar operações aritméticas com precisão arbitrária,
 * sendo especialmente útil em cálculos financeiros para evitar problemas de arredondamento
 * que podem ocorrer com tipos primitivos como float e double.
 * 
 */
import java.math.BigDecimal;

public class BigDecimalBalancoTri {

	public static void main(String[] args) {
		System.out.println
		("Em nossa empresa, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do\r\n"
		+ "primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos R$15000,\r\n"
		+ "em Fevereiro, R$ 23000, e em Março, R$ 17000, faça um programa que calcule e imprima\r\n"
		+ "o gasto total no trimestre.");
		
		/*
		 * BigDecimal é uma classe usada para representar números de precisão arbitrária
		 * em Java, ideal para cálculos financeiros e científicos onde a precisão é
		 * crucial. Diferente de tipos primitivos como float e double, BigDecimal evita
		 * problemas de arredondamento, fornecendo controle exato sobre operações
		 * matemáticas e arredondamento.
		 * Você pode criar instâncias de BigDecimal a partir de String, int, long, ou double. 
		 * No entanto, é recomendável usar String ao criar BigDecimal a partir de valores 
		 * decimais para evitar problemas de precisão.
		 */
		BigDecimal gastosJaneiro = new BigDecimal("15000.0");
		BigDecimal gastosFevereiro = new BigDecimal("23000.0");
		BigDecimal gastosMarco = new BigDecimal("17000.0");

		BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);

		System.out.println("O gasto trimestral da empresa é: R$" + gastosTrimestre);

	}

}
