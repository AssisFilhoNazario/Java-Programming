package aula21Collections;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		//CRIANDO OS ELEMENTOS
		Aluno a1 = new Aluno("Assis");
		Aluno a2 = new Aluno("Marla");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Joao");

		//DELCARA O ARRAY E ADCIONA O ELEMENTOS DENTRO DO ARRAY
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		//E ADCIONA O ELEMENTOS DENTRO DO ARRAY
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		
		//IMPRIMINDO A LISTA
		imprimiAlunos(alunos);
				

	}
	//IMPRIMI O ARRAY
	public static void imprimiAlunos(List<Aluno> alunos) {
		//Pega um por uma dos elementos desta lista e coloca em a
		for(Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
