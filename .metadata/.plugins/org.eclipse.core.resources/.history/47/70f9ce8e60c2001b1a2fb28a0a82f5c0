package exercicio;

import java.util.Scanner;

public class TabelaIMC {
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o seu nome: ");
		String nome = entrada.nextLine();
		
		
		System.out.print("Seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Seu altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura *altura);

		
		if (imc < 18.5) {
			System.out.print("O seu peso é de: "+ imc +" e esta MUITO BAIXO do ideal");
		}else if(imc < 18.5 || imc < 24.9  ) {
			System.out.print("O seu peso é de: "+ imc +" e esta no peso do normal");
		}else if(imc < 25 || imc < 29.9 ) {
			System.out.print("O seu peso é de: "+ imc +" e esta no SOBREPESO");
		}else if(imc < 30 || imc < 34.9) {
			System.out.print("O seu peso é de: "+ imc +" e esta na OBESIDADE GRAU 1");
		}else if(imc < 35 || imc < 39.9) {
			System.out.print("O seu peso é de: "+ imc +" e esta na OBESIDADE GRAU 2");
		}else {
			System.out.print("O seu peso é de: "+ imc +" e esta no OBESIDADE GRAU 3");
		}
	}

}
