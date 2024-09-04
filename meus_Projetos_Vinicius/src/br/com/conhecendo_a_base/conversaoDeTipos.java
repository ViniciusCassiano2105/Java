package br.com.conhecendo_a_base;
/*
 *Widening Casting vs narrowing Casting 
 */

public class conversaoDeTipos {

	public static void main(String[] args) {
		// Widening Casting - Conversão de tipos (Implícito)
		byte variavelPequena = 1;
		int variavelGrande = variavelPequena;
		
		short variavelShort = 10;
		int variavelInt = variavelShort;
		
		System.out.println(variavelGrande);
		System.out.println(variavelInt);
		
		// Narrowing Casting (Explícito)
		long variavelLong = 65467;
		int variavelInt2 = (int) variavelLong;
		System.out.println(variavelInt2);
		
		// Operações de divisão entre números inteiros
		int numero1 = 9;
		int numero2 = 2;
		float resultadoDivisao = numero1 / (float) numero2;
		System.out.println(resultadoDivisao);
	}

}
