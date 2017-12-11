package Genio;

import java.util.Scanner;

public class Arvore {

	public Nodo raiz;

	// metodo que recebe o valor do usuario e chama o inserir.
	public void inserirUm(int valor, String pergunta) {
		inserir(raiz, valor, pergunta);
	}

	public void inserir(Nodo no, int valor, String pergunta) {
		// verifica se a arvore esta vazia se sim valor informado vai ser a raiz
		if (no == null) {
			raiz = new Nodo(valor, pergunta);// recebe o construtor do nó
			//System.out.println("O valor da raiz é " + valor + pergunta);
		} // final do primeiro if
		else {
			// Se valor for menor
			if (valor < no.getValor()) { // se for menor insere a esquerda
				if (no.getEsquerda() != null) { // se o no estiver preenchido
					inserir(no.esquerda, valor, pergunta); // volta a percorrer o metodo recursivamente
				} else { // se o valor a esquerda for vazio
					//System.out.println("Inserido " + valor + " a esquerda de " + no.valor+ " "  + pergunta); // insere o valor a esquerda do valor anterior
					no.esquerda = new Nodo(valor, pergunta);
				}//final do primeiro else
			}//final do valor menor que o nó 
		else { // se o valor for maior
			if (no.getDireita() != null) { // se o nó a direita estiver preenchido
				inserir(no.direita, valor, pergunta); // exeuta o metodo recursido ate encontrar onde estiver nulo
			} else {
				//System.out.println("Inserido "+ valor + " a direita de " + no.valor + " "+ pergunta); // insere o valor a direita do valor anterior
				no.direita = new Nodo(valor, pergunta);
			}//final do else dentro do else
		}//final do segundo else
		}

	}// final do inserir

	public void percorrer(){
		this.raiz.percorrerNodo();
	}
	
}// final da classe arvore
