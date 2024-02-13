package Atividades_Switch_If;

import java.util.Scanner;

public class Ativi7 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma
		// Calculadora simples.
		// O programa deverá ler dois números float: numero1 e numero2, e na sequência
		// ler o Código da
		// operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o
		// resultado da operação entre
		// os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a
		// mensagem Operação Inválida!

		Scanner scanner = new Scanner(System.in);

		float numero1, numero2, resultadoOperacao;
		int codigoOperacao;
		String operacao, continuar = "SIM";

		System.out.println("---------------------CALCULADORA---------------------");

		do {

			System.out.println("\nDigite o valor do 1° numero: ");
			numero1 = scanner.nextFloat();
			
			System.out.println("Digite o valor do 2° numero: ");
			numero2 = scanner.nextFloat();

			System.out.println("Digite o codigo da operação que deseja fazer:");
			System.out.println("(1) Soma (2) Subtração (3) Multiplicação (4) Divisão");
			codigoOperacao = scanner.nextInt();
			
			
			switch (codigoOperacao) {
			case 1:

				operacao = " + ";
				resultadoOperacao = numero1 + numero2;

				break;

			case 2:

				operacao = " - ";
				resultadoOperacao = numero1 - numero2;
				break;

			case 3:

				operacao = " x ";
				resultadoOperacao = numero1 * numero2;
				break;

			case 4:

				operacao = " / ";
				resultadoOperacao = numero1 / numero2;
				break;

			default:

				System.out.println("Operação inválida!");
				continue;
			}
			
			System.out.println("Calculo: " +  String.format("%.2f", numero1)+ operacao + String.format("%.2f", numero2)+ " = " + String.format("%.2f", resultadoOperacao));

			System.out.println("\nVocê deseja fazer outra conta? (S/N)");
			continuar = scanner.next().toUpperCase();

		} while (continuar.equals("S") || continuar.equals("SIM"));
		
		System.out.println("\nOK, até a próxima!");
		
		scanner.close();
	}

}
