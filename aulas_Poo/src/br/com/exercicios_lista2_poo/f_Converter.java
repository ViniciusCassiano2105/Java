package br.com.exercicios_lista2_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class f_Converter {
	private static Logger logger = Logger.getLogger(Util.class.getName());
	
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
    
        logger.info("insira hora e minutos para conversão em segundos no seguinte formato - xx,xx\n");
        double hora = scanner.nextDouble();
        double segundo = hora * 3600;
        String mensagemHora = String.format("Você inseriu %.2f horas.\n", hora);
        logger.warning("Aguarde\n");
		Thread.sleep(3000);
        logger.info("Para converter horas em segundos, efetuamos o calculo:\n");
        logger.info("Segundos = Horas x 3600\n");
        Thread.sleep(3000);
        logger.warning("Convertendo\n");
        logger.info(".");
		Thread.sleep(1000);
		logger.info(".");
		Thread.sleep(1000);
		logger.info(".");
		Thread.sleep(1000);
        String mensagemCalculo = String.format("Segundos = %.2f x 3600", hora);
        logger.info(mensagemCalculo);
        String mensagemResultado = String.format("Segundos = %.2f", segundo);
        logger.info(mensagemResultado + "s");
       
        scanner.close();  
    }
}
