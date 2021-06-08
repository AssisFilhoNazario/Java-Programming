package ex06ObjetoThisConstrutoresJavaBeans;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	
	public ContaPagar() {
		
	}
	
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);

	}

	public void pagar() {
		
		if(situacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Tentativa de pagar uma conta: "+ getSituacaoConta());
		}else if(situacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não é possivel pagar uma conta que ja esta: " + getSituacaoConta());
		}else {
			this.situacaoConta = situacaoConta.PAGA;
			System.out.println("Pagamento de conta: "+ getSituacaoConta());	
		}
		
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void exibirDetalhes() {
		System.out.println("\nConta a Pagar");
		System.out.println("===================================");
		System.out.println("Fornecedor: " + this.getFornecedor().getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("===================================");
	}
	

}
