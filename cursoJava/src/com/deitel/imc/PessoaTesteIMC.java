package com.deitel.imc;

public class PessoaTesteIMC {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Zezinho", 50, 1.8);
		Pessoa p2 = new Pessoa("Zezinho2", 0, 0);
		
		System.out.println(p1.getCalculoImc());
		System.out.println(p2.getCalculoImc());
		System.out.println(p2.getPeso());

	}

}
