package ex07staticFinal;

public class MatematicaUtil {
	
	public static final  double PI = 3.14;
	
	public static int calcucarFibonacci(int posicao) {
		 if(posicao  < 2) {
			 return posicao;
		 }
		return calcucarFibonacci(posicao - 1) + calcucarFibonacci(posicao -2) ;
	}
	
	public static double calcularAreaCirculo(double raio) {
		 double area =  raio * raio * MatematicaUtil.PI;
		
		return area;
	}
	
	

}
