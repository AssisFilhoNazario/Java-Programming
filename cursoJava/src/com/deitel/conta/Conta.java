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
	// método que deposita (adiciona) apenas uma quantia válida no saldo 
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {// se depositAmount for válido 
			saldo = saldo + depositAmount;  // o adiciona ao saldo 
		}
	}
	// método retorna o saldo da conta
	public double getSaldo() {
		return saldo;
	}
	

	// método que retorna o nome
	public String getNome() {
		return nome;
	}
	// método que define o nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
