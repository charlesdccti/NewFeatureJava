package br.charles.demo2;

interface Figura2D {
	void desenha(Double largura, Double altura);
}

class Retangulo {
	
	public void desenhaRetangulo(Double largura, Double altura) {
		System.out.println("Desenha retangulo de Largura: " + largura + " e Altura: " + altura);
	}
}


public class FunctionalInterfacesExemplo01 {

	public static void main(String[] args) {
		
		//Lambda expression
		Figura2D fig1 = (l, a) -> System.out.println("Desenha retangulo de largura: "+ l +" e Altura: "+ a);
		fig1.desenha(8.0, 1.5);
		
		/********************************************************/
		
		//Objeto especifico
		Retangulo ret = new Retangulo();
		
		//Method reference
		Figura2D fig2 = ret::desenhaRetangulo;
		
		fig2.desenha(10.5, 7.0);
		
	}

}
