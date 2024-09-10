package br.com.exercicios_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class G_multiplosde6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inicio, fim;
        do {
            System.out.print("Digite o valor inicial do intervalo (deve ser maior que 100): ");
            inicio = scanner.nextInt();
            System.out.print("Digite o valor final do intervalo (deve ser maior que o valor inicial): ");
            fim = scanner.nextInt();
            
            if (inicio <= 100 || fim <= inicio) {
                System.out.println("Intervalo inválido! O valor inicial deve ser maior que 100 e o valor final deve ser maior que o valor inicial.");
            }
        } while (inicio <= 100 || fim <= inicio);
        
        
        ArrayList<Integer> multiplosDe6 = new ArrayList<>();
        
        for (int i = inicio; i <= fim; i++) {
            if (i % 6 == 0) {
                multiplosDe6.add(i);
            }
        }
        
        
        if (multiplosDe6.size() < 6) {
            System.out.println("Não há múltiplos de 6 suficientes no intervalo para realizar a operação.");
        } else {
           
            int soma = 0;
            
            
            System.out.println("Os três primeiros múltiplos de 6 no intervalo são:");
            for (int i = 0; i < 3; i++) {
                System.out.println(multiplosDe6.get(i));
                soma += multiplosDe6.get(i);
            }
            
            
            System.out.println("Os três últimos múltiplos de 6 no intervalo são:");
            for (int i = multiplosDe6.size() - 3; i < multiplosDe6.size(); i++) {
                System.out.println(multiplosDe6.get(i));
                soma += multiplosDe6.get(i);
            }
            
           
            System.out.println("A soma dos três primeiros e três últimos múltiplos de 6 é: " + soma);
        }
        
        scanner.close();  
    }
}
