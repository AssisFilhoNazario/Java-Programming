package aula21Collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

	public static void main(String[] args) {
		//CRIANDO OS ELEMENTOS
		Aluno a1 = new Aluno("Assis");
		Aluno a2 = new Aluno("Marla");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Joao");
		
		//Exemplo: criando os alunos com os numeros de matriculas
		//DELCARA HASHMAP COLOCA O TIPO DA CHAVE, E DEPOIS O VALOR  NO CASO OS ELEMENTOS ACIMA INSTANCIADOS.
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);
		
		
		//IMPRIMINDO A LISTA
		imprimirAlunos(alunos);
		
		//Procurando um aluno atraves da chave
		
		Aluno buscaAluno = alunos.get("3");
		System.out.println("Nome do alunos na chave 3: " + buscaAluno.getNome());
	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		//Pega os elementos atraves do valor dentro dele, se quiser pode pegar pela chave (k)
		for(Aluno a : alunos.values()) {
			System.out.println("Nome: " + a.getNome());
		}
		
	}

}
