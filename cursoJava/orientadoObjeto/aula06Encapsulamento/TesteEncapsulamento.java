package aula06Encapsulamento;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();// 17 - 25
		
		ar.trocarTemperatura(20);
		
		
		System.out.println("Temperatura do ar: " + ar.obterTemperatura()+"º");
		
		

	}

}
