package Atividades_Switch_If;

import java.util.Scanner;

public class Ativi1 {
	public static void main(String[] args) {
		//1)	Faça um algoritmo em Java que leia 3 valores inteiros 
		//A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, soma;
		
		System.out.print("Digite o valor do A: ");
		A= leia.nextInt();
		
		System.out.print("Digite o valor do B: ");
		B= leia.nextInt();
		
		System.out.print("Digite o valor do C: ");
		C= leia.nextInt();
		
		soma = A+B;
		
		if (soma < C) {
			
			System.out.print("A soma entre A e B é menor que C!");
			
		}else if (soma > C){
			
			System.out.print("A soma entre A e B é maior que C!");
			
		}else {
			
			System.out.print("A soma entre A e B é igual a C!");
		}
		
		leia.close();
		
	}
	
}
