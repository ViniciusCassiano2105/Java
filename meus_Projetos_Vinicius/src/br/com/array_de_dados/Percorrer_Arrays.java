package br.com.array_de_dados;

import java.lang.reflect.Array;

public class Percorrer_Arrays {

	public static void main(String[] args) {
		//Declarar e Inicializar
		String [] tarefas = {"Estudar Java", "Fazer exercícios", "Tomar café"};
		
		//Acessar posições do Array
		System.out.println(tarefas[0]);
		System.out.println(tarefas[1]);
		System.out.println(tarefas[2]);
		
		
		//Atualizar posições do Array
		tarefas[2] = "Limpar a casa";
		System.out.println(tarefas[2]);

		//Tamanho do Array
		System.out.println("Você possui " + tarefas.length + " tarefas.");
	
		
		//For
		for (int i = 0; i < tarefas.length; i++) {
		System.out.println(tarefas[i]);
		}
		
		//For each
		for (String tarefa : tarefas) {
			System.out.println(tarefa + " ");
		}
	}

}
