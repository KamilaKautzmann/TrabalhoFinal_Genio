package Genio;

import java.util.Scanner;

public class Nodo {

	public int valor = 0;
	public Nodo direita;
	public Nodo esquerda;
	public String pergunta;
	
	
	public Nodo(int valor, String pergunta) { //Construtor
		this.valor = valor;
		this.direita = null;
		this.esquerda = null;
		this.pergunta = pergunta;
	}

	public int getValor() {
		return valor;
	}
	
	public Nodo getDireita() {
		return direita;
	}
	
	public Nodo getEsquerda() {
	return esquerda;
	}
		
	public String getPergunta() {
		return pergunta;
	}
	
	public void percorrerNodo(){
			
		if(this.direita == null && this.esquerda == null){
			System.out.println("Sua resposta é: " + this.pergunta);
			
		}else{
			System.out.println(/*valor +*/ this.pergunta);
			Scanner sc1 = new Scanner(System.in); 
			String resposta = sc1.next();
			
			if(resposta.equals("Nao")){
				this.esquerda.percorrerNodo(); 
			}else if(resposta.equals("Sim")){
				this.direita.percorrerNodo();
				
			}
			
			
		}
	}
}
