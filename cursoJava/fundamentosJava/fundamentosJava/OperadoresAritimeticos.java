package fundamentosJava;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int soma = 2 + 10;
		int subtracao = 6 - 10;
		int multiplicacao = 8 * 3;
		int divisao = 8 / 2;
		int restoDaDivisao = 7 % 2;
		
		System.out.println("A soma é : " + soma + "\n"
				+ "A subtração é: "+ subtracao +"\n"
				+ "A multiplicação é: "+ multiplicacao + "\n"
				+ "Divisão é: "+ divisao +"\n"
				+ "e por fim o Resto da Divisão é: "+ restoDaDivisao);
		
		// Notas e media de aluno
		
		int nota1 = 99;
		int nota2 = 80;
		int nota3 = 53;
		
		int media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A média é: "+ media);

	}

}
