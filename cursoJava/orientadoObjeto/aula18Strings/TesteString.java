package aula18Strings;

public class TesteString {

	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
		String s = "Ol�"; //Criada a String "Ol�"
		s = s + " Pessoal"; // Criada a String "Ol� Pessoa"
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Ol�"); //Existe a StringBuilder 
		sb.append(" Pessoal"); // reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);

	}

}
