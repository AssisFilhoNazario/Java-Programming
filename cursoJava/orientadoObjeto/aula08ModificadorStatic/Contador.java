package aula08ModificadorStatic;

public class Contador {
	
	public static int COUNT = 0;
	public static final  double PI = 3.14;
	
	public static void incrementar() {
		COUNT++;
	}
	
	public static void imprimirContatdor() {
		System.out.println("O valor do contador agora � "+ Contador.COUNT);
	}
	
	
	

}
