package Atividades_Switch_If;

import java.util.Scanner;

public class Ativi4 {

	public static void main(String[] args) {
		//Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um  
		//tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.

		Scanner scanner = new Scanner(System.in);
		
		String laranja, amarelo, azul;
		
		System.out.println("O animal é vertebrado ou invertebrado?");
		laranja = scanner.nextLine();
		
		if (laranja.equalsIgnoreCase("vertebrado")) {
			System.out.println("O animal é uma ave ou mamífero?");
			amarelo = scanner.nextLine();
			
			if (amarelo.equalsIgnoreCase("ave")) {
				System.out.println("O animal é canívoro ou onívoro?");
				azul = scanner.nextLine();
				
				if (azul.equalsIgnoreCase("carnivoro")) {
					System.out.println("O animal é uma áquia!");
					
				} else {
					System.out.println("O animal é uma pomba!");
				}
				
			} else if (amarelo.equalsIgnoreCase("mamifero")) {
				System.out.println("O animal é onívoro ou herbívoro?");
				amarelo = scanner.nextLine();
				
				if (amarelo.equalsIgnoreCase("onivoro")) {
					System.out.println("O animal é um homem!");
					
				}else {
					System.out.println("O animal é uma vaca!");
				}
			}
			
		} else if (laranja.equalsIgnoreCase("invertebrado")) {
			System.out.println("O animal é inseto ou anelídeo?");
			amarelo = scanner.nextLine();
			
			if (amarelo.equalsIgnoreCase("inseto")) {
				System.out.println("O animal é hematófago ou herbívoro?");
				azul = scanner.nextLine();
				
				if (azul.equalsIgnoreCase("hematofago")) {
					System.out.println("O animal é uma pulga!");
					
				}else {
					System.out.println("O animal é uma lagarta!");
				}
				
			} else if (amarelo.equalsIgnoreCase("anelideo")) {
				System.out.println("O animal é hematófago ou onívoro?");
				azul = scanner.nextLine();
				
				if (azul.equalsIgnoreCase("hematófago")) {
					System.out.println("O animal é uma sanguessuga!");
					
				} else {
					System.out.println("O animal é uma minhoca!");
				}
			}
		}
		scanner.close();
	}
}
