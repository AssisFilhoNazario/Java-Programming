package aula02Paciente;

public class Pincipal {
	public static void main(String[] args) {
		Paciente zezinho = new Paciente();
		zezinho.peso = 100;
		zezinho.altura = 1.65;
		
		
		
		IMC imc = zezinho.calcularIndiceDeMassaCorporal();
		
		System.out.println("Abaixo do peso ideal: " + imc.abaixodopesoIdadeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de Obesidade: " + imc.grauObesidade);
		
	}
}
