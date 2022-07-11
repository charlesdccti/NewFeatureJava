package br.charles.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Curso {
	private String nome;
	private List<Aluno> listaAlunos;

	public Curso(String nome) {
		this.nome = nome;
		this.listaAlunos = new ArrayList<>();
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
}


class Aluno {
	private Optional<Matricula> matricula;
	private String nome;
		
	public Aluno(String nome) {
		this.nome = nome;
		//Inicializa Optional como um container vazio
		this.matricula = Optional.empty();
	}

	
	public Optional<Matricula> getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Matricula matricula) {
		this.matricula = Optional.of(matricula);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}		
}


class Matricula {
	private String numero;
	
	public Matricula(String numero){
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}


public class OptionalExemplo {
	
	public static void main(String[] args) {
		
		var cursoAdm = new Curso("Administração");
		var jose = new Aluno("José");
		jose.setMatricula(new Matricula("11100"));
		
		cursoAdm.getListaAlunos().add(jose);
		var maria = new Aluno("Maria");
		maria.setMatricula(new Matricula("12010"));
		
		//Sem Matricula !!!
		cursoAdm.getListaAlunos().add(maria);
		var ana = new Aluno("Ana");
		
		cursoAdm.getListaAlunos().add(ana);
		
		var paulo = new Aluno("Paulo");
		paulo.setMatricula(new Matricula("14010"));
		
		cursoAdm.getListaAlunos().add(paulo);
		
		//Exibe p nome do aluno e  numero de sua matricula no curso
		cursoAdm.getListaAlunos().stream()
		
		.filter( a -> a.getMatricula().isPresent() )
		
		.forEach( a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero()) );
	}
}






























