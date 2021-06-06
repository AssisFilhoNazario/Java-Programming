package ex06ObjetoThisConstrutoresJavaBeans;



public class ContaPagar  {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	Fornecedor fornecedor;
	SituacaoConta situacaoConta;
	
	public ContaPagar() {
		this.situacaoConta = situacaoConta;
		
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento, SituacaoConta situacaoConta) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.situacaoConta = situacaoConta;
		
	}
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void pagar() {
		
		if(situacaoConta == situacaoConta.CANCELADA ) {
			System.out.println("Tentativa de pagar uma conta: "+ getSituacaoConta());
		}else if(situacaoConta == situacaoConta.PAGA) {
			System.out.println("Não é possivel pagar uma conta que ja esta: " + getSituacaoConta());
		}else {
			situacaoConta = situacaoConta.PAGA;
			System.out.println("Pagamento de conta: "+ getSituacaoConta());	
		}
		
	}
	
	public void cancelar() {
		situacaoConta = situacaoConta.CANCELADA;
		System.out.println("Conta: " + getSituacaoConta());
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	
	
	

}
