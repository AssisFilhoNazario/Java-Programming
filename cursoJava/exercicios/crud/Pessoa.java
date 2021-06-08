package crud;

public abstract class Pessoa {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(this.nome.equals(null)) {
			this.nome = nome;
		}else {
			System.out.println("Ja existe um nome de uma pessoa: "+ this.getNome());
		}
	}
	
	public void atualizaNome(String novoNome) {
		if(this.nome != null) {
			this.nome = novoNome;
		}else {
			System.out.println("Não é possivel atualizar, pois nao existe nome" + this.getNome());
		}
	}
	
	public void deletarNome() {
		if(this.nome != null) {
			this.nome = null;
		}
	}
	
}
