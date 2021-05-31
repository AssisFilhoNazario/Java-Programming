package ex03CalcularArePI;

public class CalculadoraProfessor {

	public static void main(String[] args) {
		double pi = 3.14;
		double raio = 5.3;
		
		double area = raio * raio *pi;
		int areaSemCasasDecimais= (int)area;
		
		System.out.print("Resultado: "+ area + "\n"
				+ "Sem casa Decimais: "+ areaSemCasasDecimais);

	}

}
