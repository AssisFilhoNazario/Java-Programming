package crud2;

public class Funcionario extends Pessoa {
	
	private double salario;
	private ContaPoupanca poupanca;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public ContaPoupanca getPoupanca() {
		return poupanca;
	}
	public void setPoupanca(ContaPoupanca poupanca) {
		this.poupanca = poupanca;
	}	
}
