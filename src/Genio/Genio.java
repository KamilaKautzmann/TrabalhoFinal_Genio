package Genio;

import java.util.Scanner;

public class Genio {

	static Arvore arvore = new Arvore();
	public static void main(String[] args) {
		
		System.out.println("Genio Animal " + "\n" );
		System.out.println("O objetivo do jogo é através de perguntas adivinhar o animal escolhido. \n \n" + 
		"........................................................................ \n");
		System.out.println("Pense em um animal da lista abaixo: \n");
		System.out.println("Gato" + "\n" + "Cachorro" + "\n" + "Passarinho" + "\n" + 
		"Tartaruga" + "\n" + "Peixe" + "\n" + "Leão" + "\n" + "Elefante" + "\n" + "Girafa" + "\n" + "Tigre" + "\n" + "Jacaré" + "\n" + "Baleia" + "\n");
		
		inserirMain();
		arvore.percorrer();
	
		
}// final do main
	
	public static void inserirMain(){
				
		arvore.inserirUm(50, "Seu animal é comum ter em residencias?");
		arvore.inserirUm(40, "Seu animal vive na agua?");
		arvore.inserirUm(60, "Seu animal é um felino?");
		arvore.inserirUm(38, "Seu animal consegue ficar um pouco fora d'agua?");
		arvore.inserirUm(43, "Seu animal voa?" );
		arvore.inserirUm(45, "Seu animal saltita?");
		arvore.inserirUm(47, "Seu animal mia");
		arvore.inserirUm(58, "Seu animal tem juba?");
		arvore.inserirUm(65, "Seu animal é muito pesado?");
		arvore.inserirUm(63, "Seu animal tem tromba?");
		arvore.inserirUm(71, "Seu animal tem pescoço muito grande?");
		arvore.inserirUm(37, "Tartaruga");
		arvore.inserirUm(39, "Peixe");
		arvore.inserirUm(41, "Passarinho");
		arvore.inserirUm(44, "Coelho");
		arvore.inserirUm(46, "Gato");
		arvore.inserirUm(48, "Cachorro");
		arvore.inserirUm(57, "Leao");
		arvore.inserirUm(59, "Tigre");
		arvore.inserirUm(62, "Elefante");
		arvore.inserirUm(64, "Baleia");
		arvore.inserirUm(70, "Girafa");
		arvore.inserirUm(72, "Jacaré");
					
	}
	
	
		
}
