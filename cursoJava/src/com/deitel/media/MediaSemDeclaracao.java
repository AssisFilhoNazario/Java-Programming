package com.deitel.media;

import java.util.Scanner;

public class MediaSemDeclaracao {

	public static void main(String[] args) {
		
		int total  = 0;
		int counter = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota ");
		int nota= entrada.nextInt();
		
		while(nota != -1) {
			total = total + nota;
			counter++;
			
			System.out.print("Digite a nota ");
			nota = entrada.nextInt();
		}
		
		if(counter != 0) {
			double media = total / counter;
			System.out.print("A media é: "+ media);
		}else {
			System.out.print("Nenhuma nota foi inserida");
		}

	}

}
