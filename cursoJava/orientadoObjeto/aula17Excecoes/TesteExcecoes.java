package aula17Excecoes;

public class TesteExcecoes {
	public static void main(String[] args) {
		/*
		*int numero = 5 / 0; // Lança java.lang.ArithmeticException: 
		*String s = null;
		String maiuscula = s.toUpperCase();// Lançajava.lang.NullPointerException:
		*
		*/
		
		
		ContaCorrente cc =new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
			//Varias linhas de códigos....
		} catch (IllegalArgumentException e) {
			System.out.println("Você usaou uma operacao ilegal: "+ e.getMessage());
		}
		
		
	}

}
