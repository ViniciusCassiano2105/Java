package br.com.introducao_java;

public class metodos {

	public static void main(String[] args) {
		//ativarSoneca();
		String mensagemDoAlarme = agendarAlarme(12,30); // argumentos
		System.out.println(mensagemDoAlarme);
		
	}
	
		/* Sintaxe de declaração de métodos no Java:
		 * <tipo do retrono do metodo> identificador (<tipo> parâmetro){
		 * <bloco de comandos>
		 * }
		 * 
		 * 
		 */
		
		static void ativarSoneca() {
			System.out.println("Só mais 5 minutinhos :P");
		}
			
			static String agendarAlarme(int hora, int minutos) { // parâmetros
				// Seu alarme foi configurado às 12:30
				return "Seu alarme foi configurado às " + hora + ":" + minutos;
			
			
	}

}
