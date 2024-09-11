package br.com.exercicios_lista2_poo;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.aula_poo.utils.Util;

public class f_Converter {
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) throws InterruptedException {
		
		// Criando um scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		logger.info("Insira hora e minutos para conversão em segundos no seguinte formato - xx,xx\n");
		
		// Lê a entrada do usuário
		double hora = scanner.nextDouble();
		
		// Calculo
		double segundo = hora * 3600;

		// Exibe a hora inserida
		String mensagemHora = String.format("Você inseriu %.2f horas.\n", hora);
		logger.info(mensagemHora);
		logger.warning("Aguarde\n");
		Thread.sleep(3000);

		// Mostra o cálculo da conversão
		logger.info("Para converter horas em segundos, efetuamos o cálculo:\n");
		logger.info("Segundos = Horas x 3600\n");
		Thread.sleep(3000);

		// Mensagem de conversão
		logger.warning("Convertendo\n");
		logger.info(".");
		Thread.sleep(1000);
		logger.info(".");
		Thread.sleep(1000);
		logger.info(".");
		Thread.sleep(1000);

		// Mostra o cálculo em detalhes
		String mensagemCalculo = String.format("Segundos = %.2f x 3600", hora);
		logger.info(mensagemCalculo);

		// Exibe o resultado
		String mensagemResultado = String.format("Segundos = %.2f", segundo);
		logger.info(mensagemResultado + "s");

		// Fecha o scanner
		scanner.close();
	}
}
