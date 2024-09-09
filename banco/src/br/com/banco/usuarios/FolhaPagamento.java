package br.com.banco.usuarios;

public class FolhaPagamento {

    // metodo Polimorfismo
    public void calcularFolha(Funcionario funcionario) {
        double salario = funcionario.calcularSalario();
        System.out.println("O salário de " + funcionario.getNome() + " é: " + salario);
    }

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Lucas", "12345678900", 2000.0, 1234, "Lucas");
        Gerente gerente1 = new Gerente("Leticia", "98765432100", 10000.0, 5678, "Leticia");

        FolhaPagamento folha = new FolhaPagamento();
        folha.calcularFolha(func1);    
        folha.calcularFolha(gerente1); 
    }
}
