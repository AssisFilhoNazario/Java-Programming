package fundamentosJava;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		String nome = entrada.nextLine();
		
		System.out.println("Bem vindo "+nome);
		
	}

}
