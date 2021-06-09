package com.deitel.media;

import java.util.Scanner;

public class ClasseAvarange {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contador = 1;
		
		while (contador <= 10) {
			System.out.print("Digite a nota ");
			int nota= entrada.nextInt();
			total = total + nota;
			contador ++;				
		}
		
		int media = total/10;
		
		
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", media);
		


	}

}
