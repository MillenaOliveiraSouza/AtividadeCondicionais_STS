package Atividades_Switch_If;

//biblioteca do scanner, essa biblioteca permite que o usuario digite algo e o computador consegue ler o que ele digitou.
import java.util.Scanner;

public class Ativi5 {

	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade 
		//comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
		
		//biblioteca Scanner vai ler as coisas com o scanner, então quando eu chamar scanner a biblioteca vai saber que é ela.
		Scanner scanner = new Scanner(System.in);
		
		//Informações sobre o produto.
		//declarei a variavel produtos como uma lista de string, pois como tem varios produtos com o mesmo tipo string, fica mais facil, de pegar eles
		//ai é só chamar eles de acordo o espaço que ele está, por exemplo o cachorro quente está no espaço 0, lembrando que a lista começa 
		//em 0, então se eu quero 6 produtos, a lista vai ter 5, 0 até 5.
		String [] produtos = {"Cachorro Quente", "X-Salada", "X-Bacon", "Bauru", "Refrigerante", "Suco de Laranja"};
		
		//aqui eu também declarei a variavel preço em uma lista double.
		double [] precos = {10.00, 15.00, 18.00, 12.00, 8.00, 13.00};
		
		//Mostra os produtos disponíveis com seus códigos e preços.
		System.out.println("Produtos Disponiveis: ");
		
		//fiz o laço de repetição FOR, porque ele vai me ajudar com as listas que eu criei
		//eu declarei a variavel i ali dentro do for, e o i vai começar com 0, o valor de i precisa ser menor que a quantidade de espaços que tem na lista,
		//então por exemplo a lista tem 6 espaços contanto o 0, se o i estiver no espaço 3 ele ainda vai ser menor que 6, então ele vai fazer o loop,
		// e o i++ quer dizer que ele vai acrescentar, vai pular para o proximo, até que i seja menor que o comprimento de produtos(menor que os espaços da lista)
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(( i + 1 )+ ". "+ produtos[i] + "- R$ "+ String.format("%.2f", precos[i])); //coloquei o String.format para que o valores da lista de preço fiquem com duas casaas depois da virgula.
		}
		
		
		//Poderia declarar as variaveis antes do for, mas como eu vou usar ela agora, decidi declarar aqui.
		int codigo, quantidade;
		double total = 0;
		String continuar ="S";
		
		
		//loop para continuar a compra se o usuario desejar, do while(faça enquanto), então aqui ele sempre vai perguntar qual produto que o usuario quer
		do {
			
			System.out.println("\nDigite o código do produto: ");
			codigo = scanner.nextInt(); // o que o numero que o usuario colocar vai ser amazenado na variavel codigo.
			
			double valorProduto;
			
			//agora com o SWITCH vou verificar que numero(codigo) que o usuario digitou,ai vai entrar no case dependendo do numeto digitado
			switch (codigo) {
			case 1: // como é um numero eu não preciso colocar entre ""
				
				valorProduto = precos[0]; //aqui o valorProduto vai receber o preço declarado no espaço 0 da lista precos, nos declaramos o valor dessas variais lá em cima no caso é 10.00
				break; //o break é necessário para quebrar (parar) de entrar nos cases, se o inteiro digitdo por 1)
				
			case 2:
				
				valorProduto = precos[1]; // aqui aconteceu a mesma coisa, o valorProduto recebe o valor do espaço que 1 que foi declarado na lista da variavel precos, no caso é 15.00
				break;
			
			case 3:
				
				valorProduto = precos[2];
				break;
				
			case 4:
				
				valorProduto = precos[3];
				break;
				
			case 5:
				
				valorProduto = precos [4];
				break;
				
			case 6:
				
				valorProduto = precos [5];
				break;
				
			default: // serve caso o usuario não digite nenhum desses codigos, ai vai aparecer codigo invalido.
				
				System.out.println("Código de produto inválido!");
				// o continuar é uma função, então ele vai ajudar o nosso codigo ai a entrar de novo nos cases, 
				//se eu não colocasse ele o programa iria parar e não ia continuar para o usuario digitar um codigo correto.
				continue; 
			}
			
			// aqui estamos fora do Switch, para perguntar quantidade desejada, eu poderia colocar isso dentro de cada case
			//mas como eu sempre vou ter que perguntar para cada um, fica mais facil deixar fora do case, porque já serve para todos os produtos
			System.out.println("Digite a quantidade desejada: ");
			quantidade = scanner.nextInt(); 
			
			//declarei a variavel subtotal como double, e fiz a conta para saber o valor total entre a quantidade desejada e o tipo de produto
			// eu coloquei o nome dessa variavel como subtotal, porque caso o usuario queria mais algum produto, eu vou ter que fazer uma conta
			// vou precisar somar o total do primeiro produto com o total do segundo produto por exemplo.
			double subtotal = valorProduto * quantidade;
			
			//aqui eu vou mostrar na tela a quantidade o produto e o subtotal
			// coloquei o produtos[codigo -1], pois produtos é uma lista [], então eu coloquei codigo -1, pois o codigo é de 1 a 6
			//pois é isso que o usuario vai ser ali na tela exemplo o cachorro quente é 1, mas a nossa lista de produtos começa no 0
			//então se eu não colocasse o -1 ele iria mostrar o produto que está no espaço da lista 1 que é o x-salada, então eu coloco
			// -1 assim vai ser o codigo menos uma casa, no caso seria 0, pois 1-1 = 0, então ele vai mostrar o produto que está no espaço da lista(casa) 0.
			//Para colocar 2 casas depois da virgula. Precisei colocar o .format, pois não aceitava formatar só com %.2f, nem se eu trocasse para printf.
			System.out.println("Você comprou "+quantidade + "x " + produtos[codigo - 1] + " - Total: R$ "+ String.format("%.2f", subtotal)); 
			
			//isso é muito importante em um loop, pois caso o usuario queria comprar mais coisas é aqui eu que vou somar, o que ele já tinha comprado com o que ele quer agora
			//daria para der colocado total = total + subtotal isso quer dizer que o total vai receber a soma entre subtotal e o total, sendo o total a comprar nova
			//colocamos desse jeito para facilidar a leitura, 
			total += subtotal;
			
			//aqui pergunta se o usuario deseja continuar comprando, o continuar vai receber o que o usuario vai escrever, então para diminuir erro de digitação
			//coloquei tudo que o usuario escrever para letra maiuscula
			System.out.println("Deseja comprar mais produtos?  (S/N)");
			continuar = scanner.next().toUpperCase();
		} while (continuar.equals ("S") || continuar.equals("SIM")); //vai fazer o do quanto o a variavel continuar receber Sim, pode ser em minuscula ou maiuscula, pois colocamos anteriormente o upper
		                                                             //com o .equals a gente consegue comparar o que o usuario escreveu. se for S ou SIM, ele vai continuar o codigo, se for qualquer outra coisa ele vai parar 
		
		//se caso o usuario digitar qualquer outra letra ao inves de S ou SIM, o codigo vai motrar o valor total da compra 
		System.out.println("Valor total da compra: R$ "+ String.format("%.2f",total));
		
		//o .close sempre é necessário caso você use a biblioteca Scanner
		scanner.close();
		
	}

}
