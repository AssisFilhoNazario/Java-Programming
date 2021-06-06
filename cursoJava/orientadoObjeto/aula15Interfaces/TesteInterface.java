package aula15Interfaces;

public class TesteInterface {

	public static void main(String[] args) {
		Imprimivel i = new NotaFiscal(1234);
		i.imprimir();
		
		EnviavelPorEmail e = (EnviavelPorEmail) i;
		e.enviar("assisfilho2254@gmail.com");
	}

}
