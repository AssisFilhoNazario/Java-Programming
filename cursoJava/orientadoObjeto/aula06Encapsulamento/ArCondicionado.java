package aula06Encapsulamento;

public class ArCondicionado {

	private int temperatura;
	
	void trocarTemperatura(int temperatura) {
		if(temperatura >= 17 && temperatura <=25) {
			this.temperatura = temperatura;
		}
	}
	
	int obterTemperatura() {
		return temperatura;
	}
	
	
}
