package ex07staticFinal;

public class TesteMatematica {

	public static void main(String[] args) {
		
		int numeroFibanacci = MatematicaUtil.calcucarFibonacci(8);
		System.out.println("Número de Fibanaci da posição 8: " + numeroFibanacci);
		
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("Área do cículo: " + areaCirculo);

		

	}

}
