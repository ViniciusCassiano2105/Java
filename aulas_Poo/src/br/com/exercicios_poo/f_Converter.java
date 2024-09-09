package br.com.exercicios_poo;

import java.util.Scanner;

public class f_Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite um valor em horas (ex: 2.5 para 2 horas e 30 minutos): ");
        double horas = scanner.nextDouble();
 
        System.out.println("Valor informado: " + horas + " horas.");
 
        double minutos = horas * 60;
        System.out.println("Passo 1: Convertemos horas em minutos. " + horas + " horas * 60 = " + minutos + " minutos.");

        double segundos = minutos * 60;
        System.out.println("Passo 2: Convertemos minutos em segundos. " + minutos + " minutos * 60 = " + segundos + " segundos.");
 
        System.out.println("Resultado final: " + horas + " horas equivalem a " + (int)segundos + " segundos.");
        
        scanner.close();  
    }
}
