package aula11sobrePosicao;

import java.util.Date;

public class TesteSobrePosicao {
	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Caixa de fosforo";
		pp.dataValidade = new Date();
		pp.identificar();
		
	}

}
