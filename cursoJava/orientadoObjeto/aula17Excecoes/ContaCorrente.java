package aula17Excecoes;

import java.text.DecimalFormat;

public class ContaCorrente {
	
	private double saldo;
	
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
		
	public void depositar(double deposito) {
		if(deposito <= 0) {
			throw new IllegalArgumentException("O valor nã pode ser menor que zero.");
		}
		this.saldo += deposito;
	}
	
	public void sacar(double quantidade) throws SaldoInsuficienteException{
		double saldoTemp = saldo - quantidade;
		if(saldoTemp < 0) {
			throw new SaldoInsuficienteException("Você nao possui saldo suficiente");
		}
		this.saldo -= quantidade;
	}
	
	public void saldoformatado() {
		double saldoTemp = this.saldo;
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		System.out.println(formatador.format(saldoTemp));

	}

	public double getSaldo() {
		return saldo;
	}
	
}
