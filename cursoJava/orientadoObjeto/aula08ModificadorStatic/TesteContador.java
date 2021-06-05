package aula08ModificadorStatic;

public class TesteContador {

	public static void main(String[] args) {
		Contador c = new Contador();
		c.incrementar();
		Contador.incrementar();
		Contador.imprimirContatdor();
		
	

	}

}
