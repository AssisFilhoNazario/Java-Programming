package aula14ClassesAbstratas;

public class ProdutoPerecivel extends Produto {
	
	
	String dataValidade;//exemplo

	
	public void imprimirDescricao() {
		//Digitar a logica
		System.out.println("Descri��o "+ super.geDescricao() + ". Vecendo em "+ dataValidade);
		
		
	}
	

}
