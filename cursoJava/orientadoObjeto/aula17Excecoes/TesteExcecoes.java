package aula17Excecoes;

public class TesteExcecoes {
	public static void main(String[] args) {
		/*
		*int numero = 5 / 0; // Lan�a java.lang.ArithmeticException: 
		*String s = null;
		String maiuscula = s.toUpperCase();// Lan�ajava.lang.NullPointerException:
		*
		*/
		
		
		ContaCorrente cc =new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
			//Varias linhas de c�digos....
		} catch (IllegalArgumentException e) {
			System.out.println("Voc� usaou uma operacao ilegal: "+ e.getMessage());
		}
		
		
	}

}
