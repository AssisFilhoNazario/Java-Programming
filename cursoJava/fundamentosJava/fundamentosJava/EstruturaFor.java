package fundamentosJava;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Digite o numero inicial: ");
		//int numeroInicial = entrada.nextInt();
		
		
		System.out.println("Digite o numero Final: ");
		int numeroFinal = entrada.nextInt();
			
		
		for(int ini = 0; ini <= numeroFinal; ini++) {
			System.out.println(ini);		
		}

	}

}
