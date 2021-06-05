package aula12sobreCarga;

public class CadastroPessoa {
	
	
	public void cadastrar(Pessoa pessoa) {
		armazenar(pessoa.getNome(), pessoa.getIdade());
	}
	
	public void cadastrar(String pessoa, int idade) {
		armazenar(pessoa, idade);
	}
	
	private void armazenar(String nome, int idade) {
		//salva no banco de  dados
		System.out.println("salvando: \"" + nome + " com " +idade +" anos.");
	}

}
