package aula18Strings;

public class TesteString {

	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
		String s = "Olá"; //Criada a String "Olá"
		s = s + " Pessoal"; // Criada a String "Olá Pessoa"
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Olá"); //Existe a StringBuilder 
		sb.append(" Pessoal"); // reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);

	}

}
