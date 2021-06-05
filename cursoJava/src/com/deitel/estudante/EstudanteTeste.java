package com.deitel.estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		Estudante estudante = new Estudante("Zezinho", 22);
		Estudante estudante2 = new Estudante("Zezinho", 80);
		
		System.out.println(estudante.getMedia());
		
		System.out.println(estudante.getNome() + " \n"+estudante.getLetterGrade());
		System.out.println(estudante2.getNome() + " \n"+estudante2.getLetterGrade());
		
		

	}

}
