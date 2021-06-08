package ex06ObjetoThisConstrutoresJavaBeans;

public abstract class Conta {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	SituacaoConta situacaoConta;
	
	public Conta() {
		this.situacaoConta = situacaoConta.PEDENTE;
		
	}
	
	public void cancelar() {
		
		if(situacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está paga: " 
					+ this.getDescricao() + ".");
		}else if(situacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está cancelada: " 
					+ this.getDescricao() + ".");
		}else {
			this.situacaoConta = situacaoConta.CANCELADA;
			System.out.println("Conta: " + getSituacaoConta());	
			
		}
		
	}
	
	public abstract void exibirDetalhes();

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

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

}
