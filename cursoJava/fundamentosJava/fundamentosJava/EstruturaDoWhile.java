package fundamentosJava;

import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite 0 {ZERO}, para SAIR, ou qualquer numero para somar ");
			valor = entrada.nextInt();
			
			soma += valor;
			System.out.println("Soma: " + soma);
			
		}while(valor != 0);
		
		System.out.println("valeu doidoooo ");

	}

}
