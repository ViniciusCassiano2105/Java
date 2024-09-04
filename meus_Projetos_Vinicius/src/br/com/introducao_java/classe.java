package br.com.introducao_java;

public class classe {

	int horas;
	int minutos;
	int soneca;
		
	void ativarSoneca() {
		// Só mais 5 minutinhos
		System.out.println("Só mais" + soneca + "minutinhos :P");
		}
			
	static String agendarAlarme(int hora, int minutos) { // parâmetros
		// Seu alarme foi configurado às 12:30
		return "Seu alarme foi configurado às " + hora + ":" + minutos;	
	}

}
