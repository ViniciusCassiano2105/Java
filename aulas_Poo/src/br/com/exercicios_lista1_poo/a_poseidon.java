package br.com.exercicios_lista1_poo;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class a_poseidon {

    private static Logger logger = Logger.getLogger(Util.class.getName());

    public static void main(String[] args) {

    	// Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário e armazena na variável 'nome'
        logger.info("Qual seu nome?");
        String nome = scanner.nextLine();

        // Solicita o sobrenome do usuário e armazena na variável 'sobrenome'
        logger.info("Qual seu sobrenome?");
        String sobrenome = scanner.nextLine();

        // Formata a mensagem combinando nome e sobrenome
        String mensagemNomeSobrenome = String.format("Seu nome e sobrenome é %s %s", nome, sobrenome);

        // Exibe a mensagem 
        logger.info(mensagemNomeSobrenome);

        // Fecha o scanner
        scanner.close();
    }
}

	
