package aula09Enums;

public enum Naipe {
	
	OURO("Vermelho"),
	PAUS("Preto"),
	ESPADAS("Preto"),
	COPAS("Vermelho");
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	Naipe(String cor){
		this.cor = cor;
	}
	
	private String cor;
	

}
