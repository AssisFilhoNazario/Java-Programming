package aula20Numeros;

import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		double valorProduto = 1330.00;
		System.out.println(valorProduto);
		System.out.println(formatador.format(valorProduto));
		
		String entrada = "R$ 50,34";
		
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("Número: " + numero);
		} catch (ParseException e) {
			System.out.println("Entrada Invalida");
		}

	}

}
