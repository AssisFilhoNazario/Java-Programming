package aula16Arrays;

public class Arrays {

	public static void main(String[] args) {
		
		int[] nota = new int[4]; 
		nota[0] = 10;
		nota[1] = 5;
		nota[2] = 8;
		nota[3] = 9;
		
		
		
		for(int i = 0; i < nota.length; i++) {
			System.out.println("Posição["+ i + "]="+ nota[i]);
		}
		

	}

}
