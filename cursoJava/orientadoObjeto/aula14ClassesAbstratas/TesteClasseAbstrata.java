package aula14ClassesAbstratas;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		Produto p = new ProdutoPerecivel();
		p.descricao = "caixa de leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "06/06/2021";
		
		p.imprimirDescricao();

	}

}
