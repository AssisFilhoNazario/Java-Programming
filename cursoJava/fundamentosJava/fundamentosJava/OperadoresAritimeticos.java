package fundamentosJava;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int soma = 2 + 10;
		int subtracao = 6 - 10;
		int multiplicacao = 8 * 3;
		int divisao = 8 / 2;
		int restoDaDivisao = 7 % 2;
		
		System.out.println("A soma � : " + soma + "\n"
				+ "A subtra��o �: "+ subtracao +"\n"
				+ "A multiplica��o �: "+ multiplicacao + "\n"
				+ "Divis�o �: "+ divisao +"\n"
				+ "e por fim o Resto da Divis�o �: "+ restoDaDivisao);
		
		// Notas e media de aluno
		
		int nota1 = 99;
		int nota2 = 80;
		int nota3 = 53;
		
		int media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A m�dia �: "+ media);

	}

}
