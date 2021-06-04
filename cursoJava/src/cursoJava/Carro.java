package cursoJava;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	double valor;
	Proprietario proprietario;
	
	
	
	
	
	void ligarAgora() {
		
		System.out.println("Ligou");
	}
	
	double Exibevalor() {
		
		if(valor > 25.000) {
			System.out.println("É maior: ");
		}else {
			System.out.println("É menor");
		}
		
		return valor;
		
		
		
	}

}
