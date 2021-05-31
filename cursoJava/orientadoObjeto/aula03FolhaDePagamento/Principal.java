package aula03FolhaDePagamento;

public class Principal {

	public static void main(String[] args) {
		FolhaPagamento zezinho = new FolhaPagamento();
		double salario = zezinho.calcularSalario(160, 12, 35.5, 40.2);
		
		System.out.println("Salário calculado: " + salario);
	}

}
