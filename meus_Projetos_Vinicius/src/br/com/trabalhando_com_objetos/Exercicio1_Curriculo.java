package br.com.trabalhando_com_objetos;

public class Exercicio1_Curriculo {

	public static void main(String[] args) {
		String mensagem = sobreMim("Vinicius", 30, "Desenvolvedor", "Java");
		System.out.println(mensagem);
		
		
	}
	static String sobreMim(String nome, int idade, String competencias, String experiencias) {
		return " Olá, eu sou " + nome + " minha idade é " + idade + " trabalho como " + competencias + " e minhas experiências foram: " + experiencias;
	}
	
}
