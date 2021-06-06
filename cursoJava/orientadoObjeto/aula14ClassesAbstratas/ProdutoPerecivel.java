package aula14ClassesAbstratas;

public class ProdutoPerecivel extends Produto {
	
	
	String dataValidade;//exemplo

	
	public void imprimirDescricao() {
		//Digitar a logica
		System.out.println("Descrição "+ super.geDescricao() + ". Vecendo em "+ dataValidade);
		
		
	}
	

}
