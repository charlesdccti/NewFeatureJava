package br.charles.demo;

import java.util.ArrayList;
import java.util.List;

class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void imprime() {
		System.out.println(nome + " = " + preco);
	}
}


public class MethodReferencesExemplo03 {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L'", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		/*Method reference
		 * Referencia a um método de instancia (imprime) 
		 * de um objeto arbritrário (?) a partir de um tipo especifico (Produto)
		 */
		lista.forEach(Produto::imprime);
	}
	
}
