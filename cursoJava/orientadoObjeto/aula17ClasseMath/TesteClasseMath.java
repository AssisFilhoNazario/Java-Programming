package aula17ClasseMath;

import static java.lang.Math.PI;

public class TesteClasseMath {

	public static void main(String[] args) {
		//Comprimento de uam circunferência 2 x r x PI (3.14)
		int raio = 4;
		double comprimento = 2 * raio * Math.PI;
		
		System.out.println("Comprimento: " + comprimento);
		
		//Máximo e mínimo
		double[] precosProdutoA = {30.20, 25.49};
		double maiorPreco = Math.max(precosProdutoA[0], precosProdutoA[1]);
		double menorPreco = Math.min(precosProdutoA[0], precosProdutoA[1]);
		System.out.println("Maior Preço: " + maiorPreco +"  " + "Menor Preço: "+ menorPreco);		
		
		//Potência
		System.out.println("Potencia de 2^3: "+ Math.pow(2, 3));
		
		//Raiz quadrada
		
		System.out.println("Raiz de 9: "+ Math.sqrt(9));
		
		
		//Arredondamento ceil, floor e round
		
		double n = 5.68;
		System.out.println("Menor inteiro: "+ Math.floor(n));
		System.out.println("Maior inteiro: "+ Math.ceil(n));
		System.out.println("Arredondando: "+ Math.round(n));
		
		//Trigonometria
		
		System.out.println("Seno: "+ Math.sin(40));
		
		// Números randomicos
		
		double numerosAleatorio = Math.random() *100;
		System.out.println(numerosAleatorio);
		


	}

}
