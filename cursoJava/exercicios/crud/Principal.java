package crud;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		System.out.println(f.getNome());
		f.deletarNome();
		System.out.println(f.getNome());
		


	}

}
