package aula01Carro;

public class Principal {
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo= "Palio";
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Preto";
		meuCarro.ligarAgora();
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo= "Civic";
		seuCarro.anoDeFabricacao = 2009;
		seuCarro.cor = "Preto";
		seuCarro.ligarAgora();
		
		System.out.println("MEU CARRO");
		System.out.println("---------------------------");
		System.out.println("Modelo:" + meuCarro.modelo);	
		System.out.println("Ano:" + meuCarro.anoDeFabricacao);
		System.out.println("Fabricante " + meuCarro.fabricante);
		System.out.println("Cor " + meuCarro.cor);
		System.out.println();
		System.out.println("SEU CARRO");
		System.out.println("---------------------------");
		System.out.println("Modelo:" + seuCarro.modelo);	
		System.out.println("Ano:" + seuCarro.anoDeFabricacao);
		System.out.println("Fabricante " + seuCarro.fabricante);
		System.out.println("Cor " + seuCarro.cor);
		
		
		
		
		
		
	}

}
