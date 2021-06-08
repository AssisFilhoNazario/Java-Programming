package ex06ObjetoThisConstrutoresJavaBeans;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	public ContaReceber() {
		
	}
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String datavencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(datavencimento);
		
	}
	
	
	public void receber() {
		
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("N�o pode pagar uma conta que j� est� paga: " 
					+ this.getDescricao() + ".");
		}else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("N�o pode pagar uma conta que j� est� cancelada: " 
					+ this.getDescricao() + ".");
		}else {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
					+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
					+ " do cliente " + this.getCliente().getNome() + ".");
		}
	}
	
	public void cancelar() {
		
		if(this.getValor() > 50.000) {
			System.out.println("N�o � possivel cancelar pois o valor: "+ this.getValor() + " � maior do que 50 mil" );
		}else {
			super.cancelar();
		}
			
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void exibirDetalhes() {
		System.out.println("\nConta a Receber");
		System.out.println("===================================");
		System.out.println("Cliente: " + this.getCliente().getNome());
		System.out.println("Descri��o: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situa��o: " + this.getSituacaoConta());
		System.out.println("===================================");
	}
	
	

}
