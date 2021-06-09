package aula01Carro;

public class Carro {
	public String fabricante;
	public String modelo;
	public String cor;
	public int anoDeFabricacao;
	boolean biCombustivel;
	Proprietario dono;
	
	
	void mudarModelo(String modelo) {
		if(modelo != null) {
			this.modelo = modelo;
		}
	}
	
	void ligarAgora() {
		System.out.println("Ligando o carro "+ modelo);
	}
	

}
