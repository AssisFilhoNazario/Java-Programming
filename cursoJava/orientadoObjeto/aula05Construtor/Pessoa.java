package aula05Construtor;

public class Pessoa {
	String nome;
	int idade;
	
	
	//Construtor
	Pessoa(String nome){
		this.nome = nome;
	}
	
	Pessoa (String nome, int idade){
		this(nome);//� a primeira instrucao dentro do construtor
		this.idade = idade;
	}

}
