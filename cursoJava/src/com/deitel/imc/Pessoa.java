package com.deitel.imc;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	
	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		
		if(peso > 0.0 && altura >0.0) {
			this.peso = peso;
			this.altura = altura;
		}
	}
	
	public String getCalculoImc() {
		double imc = peso / (altura *altura);
		String calculoImc = "";
		if (imc < 18.5) {
			calculoImc =  "MUITO BAIXO";
		}else if(imc < 18.5 || imc < 24.9  ) {
			calculoImc =  "PESO NORMAL";
		}else if(imc < 25 || imc < 29.9 ) {
			calculoImc =  "SOBREPESO";
		}else if(imc < 30 || imc < 34.9) {
			calculoImc =  "OBESIDADE GRAU 1";
		}else if(imc < 35 || imc < 39.9) {
			calculoImc =  "OBESIDADE GRAU 2";
		}else {
			calculoImc =  "OBESIDADE GRAU 3";

		}
		
		return calculoImc;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
