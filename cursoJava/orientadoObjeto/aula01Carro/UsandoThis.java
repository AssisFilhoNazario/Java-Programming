package aula01Carro;

public class UsandoThis {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Palio";
		
		System.out.println(carro.modelo);
		
		carro.mudarModelo("CIVIC");
		
		System.out.println(carro.modelo);

	}

}
