package Atividades_Switch_If;

import java.util.Scanner;

public class Ativi2 {

	public static void main(String[] args) {
		//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela 
		//uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo. 
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scanner.nextInt();
		
		if ((numero % 2 == 0 )&& (numero<0)){
			
			System.out.println("O número "+numero+" é par e negativo!");
			
		}else if ((numero % 2 == 0) && (numero>0)) { 
			
			System.out.println("O número "+numero+" é par e positivo!");
			
		}else if ((numero % 2 != 0)&&(numero<0)) {
			
			System.out.println("O número "+numero+" é ímpar e negativo!");
			
		}else {
			
			System.out.println("O número "+numero+" é ímpar e positivo!");
		}
		
		scanner.close();
	}

}
