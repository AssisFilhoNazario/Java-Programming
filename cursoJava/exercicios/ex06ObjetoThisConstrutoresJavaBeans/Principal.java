package ex06ObjetoThisConstrutoresJavaBeans;

import com.deitel.conta.Conta;

import ex06ObjetoThisConstrutoresJavaBeans.finaceiro.RelatorioContas;

public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Antonio");

		Cliente atacadista = new Cliente();
		atacadista.setNome("Triangulo Quadrado Atacadista");
		
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicaçães");
		
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel Matriz");
		contaPagar1.setValor(123d);
		contaPagar1.setDataVencimento("07/06/2021");
		contaPagar1.setFornecedor(imobiliaria);
		
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compra do mês", 390d, "07/06/21");
		
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		
		
		
		ContaReceber contaReceber2= new ContaReceber
				(telecom,"Manutenção em sistema de conta online",53200d,"13/05/2012");
		
	contaPagar1.pagar();
	//contaReceber1.receber();
	
	
	//imprimirPagamento(contaPagar1);	
	//System.out.println("==========================================");
	//imprimirRecebimento(contaReceber1);

	}
	
	public static void imprimirPagamento(ContaPagar conta) {
		System.out.println("Nome do Fornecedor:" + conta.getFornecedor().getNome()
		+"\nDescrição da Conta:"+ conta.getDescricao()+ "\nValor da Conta:"+ conta.getValor() 
				+ "Data de vencimento: " + conta.getDataVencimento());
	}
	
	public static void imprimirRecebimento(ContaReceber conta) {
		System.out.println("Nome do Cliente:" + conta.getCliente().getNome()
		+"\nDescrição da Conta:"+ conta.getDescricao()+ "\nValor da Conta:"+ conta.getValor() 
				+ "\nData de vencimento: " + conta.getDataVencimento());
	}
	
	
	

}
