package fundamentosJava;

import java.util.Scanner;

public class OperadoTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		String indicacao = (idade >= 18) ? "Adulto" : "Adolescente";
		
		/*
		 * if (idade >= 18){
		 * 	
		 * 	indicacao  = "adulto"; 
		 * 	
		 * }else{
		 * 	
		 * 	indicacao = "adolescente"; 
		 * 
		 * }
		 * */
		
		System.out.println("Resultado: "+ indicacao);
		
		
		
		

	}

}
