package ex08sobrecarga;

public class MaquinaCafe {
	
	int acucarDisponivel;
	
	void fazerCafe(int quantidadeAcucar) {
		if(this.acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há açucar suficiente para fazer seu café.");
		}else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com "+quantidadeAcucar+" gramas de açucar.");
		}
	}
	
	void fazerCafe(){
		fazerCafe(10);
	}

}
