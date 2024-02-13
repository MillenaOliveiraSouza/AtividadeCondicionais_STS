package Atividades_Switch_If;

import java.util.Scanner;

public class Ativi3 {

	public static void main(String[] args) {
		//Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 
		//69 anos, só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha 
		//via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). 
		//De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.

		Scanner scanner = new Scanner(System.in);
		
		int idade;
		String nome, doacao;
		boolean primeiraDoacao;
		
		System.out.print("Digite o nome do doador: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		idade = scanner.nextInt();
		
		System.out.print("Primeira doação de sangue? (Sim/Não): ");
		doacao= scanner.next().toUpperCase();
		
		if (doacao.equals("Sim") || doacao.equals("S")) {
			
			primeiraDoacao = true;
			
		}else {
			
			primeiraDoacao = false;
		}
		
		
		if (idade >=18 && idade <=59) {
			
			System.out.println(nome+" está apto(a) para doar sangue!");
			
		}else if (idade >= 60 && idade <=69 && !primeiraDoacao) {
			
			System.out.println(nome+" está apto(a) para doar sangue!");
			
		}else {
			
			System.out.println(nome+" não está apto para doar sangue!");
			
		}
		
		scanner.close();
	}

}
