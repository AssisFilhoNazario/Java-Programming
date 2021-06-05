package com.deitel.estudante;

public class Estudante {
	
	private String nome;
	private double media;
	
	public Estudante (String nome, double media) {
		this.nome = nome;
		
		if(media > 0.0 && media <= 100.0) {
			this.media = media;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		
		return media;
	}

	public void setMedia(double media) {
		if(media > 0.0 && media <= 100.0) {
			this.media = media;
		}
	}
	
	public String getLetterGrade() {
		String letterGrade ="";
		if(media >= 90) {
			letterGrade = "A";
		}else if(media >= 80) {
			letterGrade = "B";
		}else if(media >= 70) {
			letterGrade = "C";
		}else if(media >=60) {
			letterGrade = "D";
		}else {
			letterGrade = "F";
		}
		return letterGrade;
	}
	
	

}
