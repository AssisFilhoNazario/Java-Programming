package aula16Arrays;

import aula01Carro.Carro;

public class TesteArrayComCarro {

	public static void main(String[] args) {
		Carro[] carros = new Carro[4];
		
		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2012;
		
		System.out.println(carros[0].anoDeFabricacao);

	}

}
