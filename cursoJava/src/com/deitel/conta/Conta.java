package com.deitel.conta;

public class Conta {
	
	private String nome;
	private double saldo;
	
	public Conta (String nome, double saldo) {
		this.nome = nome;
		
		if(saldo > 0.0) {
			this.saldo = saldo;
		}
	}
	// m�todo que deposita (adiciona) apenas uma quantia v�lida no saldo 
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {// se depositAmount for v�lido 
			saldo = saldo + depositAmount;  // o adiciona ao saldo 
		}
	}
	// m�todo retorna o saldo da conta
	public double getSaldo() {
		return saldo;
	}
	

	// m�todo que retorna o nome
	public String getNome() {
		return nome;
	}
	// m�todo que define o nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
