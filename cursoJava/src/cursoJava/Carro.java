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
			System.out.println("� maior: ");
		}else {
			System.out.println("� menor");
		}
		
		return valor;
		
		
		
	}

}
