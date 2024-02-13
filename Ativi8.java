 package Atividades_Switch_If;
 
 import java.util.Scanner;

public class Ativi8 {

	public static void main(String[] args) {
		//Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo 
		//de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3) e o 
		//valor a ser depositado ou sacado (somente nas opções 2 e 3). Considere que um saque só 
		//pode ser realizado caso haja saldo suficiente. Ao final de cada operação, exiba o novo 
		//Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
		//Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!

		
		Scanner scanner = new Scanner(System.in);
		
		int operacao;
		float novoSaldo, saldo = 1000.00f, saque, deposito;
		
		System.out.println("-------------CONTA BANCÁRIA-----------");
		
		System.out.println("Digite o codigo da operação: ");
		System.out.println("(1) Saldo (2) Saque (3) Depósito");
		operacao = scanner.nextInt();
		
		switch (operacao) {
		
		case 1 : 
			
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$ "+ String.format("%.2f",saldo));
			break;
			
		case 2: 
			
			System.out.print("Digite o valor que quer sacar: R$ ");
			saque= scanner.nextFloat();
			
			if (saque < saldo) {
				System.out.println("Operação - Saque");
				novoSaldo = saldo - saque;
				System.out.println("Novo Saldo: R$ "+ String.format("%.2f", novoSaldo) );
			} else {
				System.out.println("Saldo Insuficiente!");
			}
			
			break;
			
		case 3: 
			
			System.out.println("Operação - Depósito");
			System.out.print("Digite o valor que você quer depositar: R$ ");
			deposito = scanner.nextFloat();
			
			novoSaldo = saldo + deposito;
			System.out.print("Novo Saldo: R$ "+ String.format("%.2f", novoSaldo));
			break;
			
		default :
			
			 System.out.println("Operação Inválida!");
			 break;

		}
		
		scanner.close();
		
	}

}
