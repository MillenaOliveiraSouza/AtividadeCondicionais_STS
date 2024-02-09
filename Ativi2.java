package Atividades_Switch_If;

import java.util.Scanner;

public class Ativi2 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um algoritmo em Java que leia o
		// Nome do Colaborador (String), o Código do Cargo do Colaborador
		// (número inteiro de 1 a 6) e o Salário (número float). A seguir, mostre
		// na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.

		Scanner leia = new Scanner(System.in);

		String nome;
		int codigo;
		float salario, percentualReajuste, novoSalario;

		System.out.println("----------------Para ver o novo salario digite as informações pessoais--------------");

		System.out.println("Escreva o seu nome completo: ");
		nome = leia.nextLine();

		System.out.println("Digite o n° do seu cargo: ");
		System.out.println("(1) Gerente (2) Vendedor (3) Supervisor (4) Motorista (5) Estoquista (6) Técnico TI");
		codigo = leia.nextInt();

		System.out.print("Digite o seu salario atual: R$ ");
		salario = leia.nextFloat();

		switch (codigo) {
		case 1:

			percentualReajuste = 0.10f;

			break;

		case 2:

			percentualReajuste = 0.7f;

			break;

		case 3:

			percentualReajuste = 0.9f;

			break;

		case 4:

			percentualReajuste = 0.6f;

			break;

		case 5:

			percentualReajuste = 0.5f;

			break;

		case 6:

			percentualReajuste = 0.8f;

			break;

		default:
			System.out.println("Escreva um código válido!");
			leia.close();
			return;

		}

		novoSalario = salario * (1 + percentualReajuste);

		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("Cargo: " + nomeCargo(codigo));
		System.out.printf("Novo salário reajustado: R$ %.2f",novoSalario);

		leia.close();

	}

	public static String nomeCargo(int codigo) {
		switch (codigo) {
		case 1:
			return "Gerente";
		case 2:
			return "Vendedor";
		case 3:
			return "Supervisor";
		case 4:
			return "Motorista";
		case 5:
			return "Estoquista";
		case 6:
			return "Técnico TI";
		default:
			return "Cargo desconhecido";

		}
	}

}
