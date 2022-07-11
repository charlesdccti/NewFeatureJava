package br.charles.demo;

interface Figura2D {
	Retangulo desenha(Double largura, Double altura);
}

class Retangulo {
	
	public Retangulo(Double largura, Double altura) {
		System.out.println("Desenha retangulo de largura: " + largura + "e Altura: "+ altura);
	}
}


public class MethodReferencesExemplo04 {
	
	public static void main(String[] args) {
		/*Méthod reference
		 * Referencia a um construtor
		 * 
		 */
		Figura2D fig1 = Retangulo::new;
		
		fig1.desenha(10.5,  7.0);
	}
}
