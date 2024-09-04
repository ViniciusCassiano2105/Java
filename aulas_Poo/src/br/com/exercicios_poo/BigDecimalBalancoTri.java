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
		 */
		BigDecimal gastosJaneiro = new BigDecimal("1500");
		BigDecimal gastosFevereiro = new BigDecimal("23000");
		BigDecimal gastosMarco = new BigDecimal("17000");

		BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);

		System.out.println("O gasto trimestral da empresa é: R$" + gastosTrimestre);

	}

}
