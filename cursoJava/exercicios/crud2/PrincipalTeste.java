package crud2;

public class PrincipalTeste {

	public static void main(String[] args) {
		
		ContaPoupanca  cp = new ContaPoupanca(100);
		//System.out.println(cp.getValor());
		
		
		Endereco endereco = new Endereco();
		endereco.setRua("Da libertade");
		endereco.setBairro("Jose walter");
		endereco.setNumero(000);
		
		Funcionario f  = new Funcionario();
		f.setNome("Assis");
		f.setIdade(28);
		f.setCpf("000.000.000 - 00");
		f.setEndereco(endereco);
		f.setPoupanca(cp);
		
		
		

		
		
		exibiDados(f);
		

	}

	private static void exibiDados(Funcionario pessoa) {
		System.out.println("NOME: " + pessoa.getNome() + "\nIDADE: " + pessoa.getIdade() +"\nCPF: "
				+ pessoa.getCpf() + "\nENDERÇO: " + pessoa.getEndereco().getRua() + ""
						+ " " + pessoa.getEndereco().getBairro() + " " + pessoa.getEndereco().getRua() + ""
								+ "\nCONTA: " + pessoa.getPoupanca().getValor());	
	}

}
