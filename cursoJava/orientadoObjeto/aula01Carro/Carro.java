package aula01Carro;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
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
