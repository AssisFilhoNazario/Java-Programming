package aula09Enums;

public class TesteOperacaoEnum {

	public static void main(String[] args) {
		OperacaoAritmetica op1 = OperacaoAritmetica.ADICAO;
		
		int resultado1 = op1.operacao(5, 3);
		System.out.println("O resultado é: " + resultado1);
		
		//pegando todos os elementos dentro do ENUM
		for(OperacaoAritmetica oa: OperacaoAritmetica.values()) {
			System.out.println(oa +" -> " + oa.operacao(4, 2));
		}

	}

}
