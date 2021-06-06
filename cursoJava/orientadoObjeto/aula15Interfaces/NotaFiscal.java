package aula15Interfaces;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail{
	
	private int numero;
	
	public NotaFiscal(int numero) {
		this.numero = numero;
	}

	public void imprimir() {

		System.out.println("vamos imprimir essa nota fiscal de numero: " + numero);
		
	}
	
	public void adcionarPedido(String produto) {
		//
	}

	@Override
	public void enviar(String email) {
		System.out.println("Enviando a nota de numero: "+ numero + " para email" + email);
		
	}
	
}
