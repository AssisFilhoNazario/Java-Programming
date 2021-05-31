package fundamentosJava;

import java.util.Scanner;

public class Escopo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		boolean podeDirigir = idade >= 18;
		String nomeDoPai ="";
		
		if(!podeDirigir) {
			System.out.print("Nome do Pai: ");
			nomeDoPai = entrada.next();		
		}
		
		System.out.println("Pode dirigir?");	
		
		if (podeDirigir) {
			System.out.print("Sim , claro");	
		}else {
			System.out.print("Não, se fizer isso seu pai: "+ nomeDoPai +" vai ser preso!!!");
		}

	}

}
