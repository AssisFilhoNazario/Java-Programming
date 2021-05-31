package exercicio;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeira Nota");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Segunda Nota");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		String res = (media >= 6) ? "Aprovado" : "Reprovado";
		
		System.out.println(res);
		
		//if(media <= 5) {
		//	System.out.println("Aluno Reprovado");
		//}else {
		//	System.out.println("Aluno Aprovado");
		//}
		
	}

}
