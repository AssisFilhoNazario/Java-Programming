package com.deitel.media;

import java.util.Scanner;

public class ControleAprovacoes {

	public static void main(String[] args) {
		int aprovacoes = 0;
		int reprovacoes = 0;
		int contadorAlunos = 1;
		
		while (contadorAlunos <=10) {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite a nota ");
			int numero = entrada.nextInt();
			
			if(numero == 1) {
				aprovacoes += 1;
			}else {
				reprovacoes += 1;
			}
			
			contadorAlunos++;
		}
		
		System.out.println("Numeros de aprovações: "+ aprovacoes);
		System.out.println("Numeros de reprovações: "+ reprovacoes);
		
		
		if(aprovacoes > 8) {
			System.out.println(aprovacoes + "Foram aprovados para ser instrutores");
		}
	
	}

}
