package aula09Enums;

public enum OperacaoAritmetica {
	ADICAO {
		@Override
		public int operacao(int x, int y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	},
	SUBTRACAO {
		@Override
		public int operacao(int x, int y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	},
	DIVISAO{

		@Override
		public int operacao(int x, int y) {
			// TODO Auto-generated method stub
			return x / y;
		}
		
	},
	MULTIPLICACAO {
		@Override
		public int operacao(int x, int y) {
			// TODO Auto-generated method stub
			return x * y;
		}
	};
	
	public abstract int operacao(int x, int y);

}
