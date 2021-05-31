package aula03FolhaDePagamento;

public class FolhaPagamento {
	
	double calcularSalario(int horasNormais, int horaExtras, double valorHoraNormal, double valorHoraExtra) {
		double valorHoraNomais =  horasNormais * valorHoraNormal;
		double valorHoraExtras = horaExtras * valorHoraExtra;
		
		return valorHoraNomais + valorHoraExtra;

		
	}
	
	
}
