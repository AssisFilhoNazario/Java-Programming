package aula05Construtor;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Assis", 29);
		System.out.println("Nome: " +pessoa.nome + " " + "Idade: " +pessoa.idade );
		
		
		Pessoa pessoa2 = new Pessoa("Marla", 23);
		System.out.println("Nome: " +pessoa2.nome + " " + "Idade: " +pessoa2.idade );

	}

}
