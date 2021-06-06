package ex06ObjetoThisConstrutoresJavaBeans;

public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Antonio");
		
	//	System.out.println(mercado.getNome());
		
		
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da Matriz");
		conta1.setValor(0);
		conta1.setDataVencimento("06/06/2021");
		conta1.setFornecedor(imobiliaria);

		
		//ContaPagar conta2 = new ContaPagar(mercado, "Compra do mês", 390d, " 06/06/2021");
		
		//conta1.cancelar();
		conta1.pagar();
		conta1.pagar();
		
		

	}

}
