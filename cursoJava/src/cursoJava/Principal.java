package cursoJava;

public class Principal {

	public static void main(String[] args) {
		
		Proprietario p = new Proprietario();
		p.nome ="valdiney";
		
		
		Carro carro = new Carro();
		carro.modelo = "Gol";
		carro.fabricante = "Fiat";
		carro.anoDeFabricacao = 2021;
		carro.valor = 50.0000;
		//carro.proprietario
		carro.proprietario = p;
		
		
		
		
		
		
		

		
		
		
		

	}

}
