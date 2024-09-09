package br.com.repetindo_instrucoes;


public class Loops_Aninhados_NestedLoops {
  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++)
        System.out.print(i + "-" + j + " ");
      System.out.println();
    }
  }
}
