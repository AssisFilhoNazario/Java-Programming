package exercicio;

import java.util.Scanner;

public class PrecoMedioBombom {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Codigo que recebe o primeiro valor
		System.out.print("Digite o primeiro valor: ");
		int preco1 = entrada.nextInt();
		//Codigo que recebe o segundov alor
		System.out.print("Digite o segundo valor: ");
		int preco2 = entrada.nextInt();
		//Codigo que recebe o terceiro valor
		System.out.print("Digite o terceiro valor: ");
		int preco3 = entrada.nextInt();
		
		// calculo da media dos valores passado pelo o usuario acima
		int mediaPreco = (preco1 + preco2 + preco3)/3;
		
		System.out.print("A media dos seguintes valores " +preco1 +" + "+ preco2 +" + "+ preco3+ " = "+mediaPreco);
		
		

	}

}
