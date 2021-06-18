package aula21Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		//CRIANDO OS ELEMENTOS
		Aluno a1 = new Aluno("Assis");
		Aluno a2 = new Aluno("Marla");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Joao");
		
		//DELCARA O HASHSET 
		Set<Aluno> alunos  = new HashSet<Aluno>();
		
		//E ADCIONA OS ELEMENTOS
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		/*OBS: O HASHSET IMPRIMI DE MANEIRA ALEATORIA OS ELEMENTOS
		 * ELE NAO COLOCA VALORES REPETIDOS, POR EXEMPLO, IMPMIR DUAS VEZES O JOÃO 
		 * EXEMPLO: 
		 * alunos.add(a4);
		 * alunos.add(a4);
		 * 
		 */
		 
		imprimiAlunos(alunos);
		
	}
	
	//IMPRIMI O HASHSET
	public static void imprimiAlunos(Set<Aluno> alunos) {
		//Pega um por uma dos elementos desta lista e coloca em a
		for(Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}
	
	

}
