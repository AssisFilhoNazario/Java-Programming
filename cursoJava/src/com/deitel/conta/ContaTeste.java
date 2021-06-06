package com.deitel.conta;



import javax.swing.JOptionPane;

public class ContaTeste {

	public static void main(String[] args) {
	
		Conta minhaConta = new Conta("Marla", 1000);
		Conta minhaConta2 = new Conta("Fulano", -700);
		
		imprirStatus(minhaConta);
		imprirStatus(minhaConta2);
		
		
	
		
		
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado"));
		minhaConta.deposit(saldo);
	
		imprirStatus(minhaConta);
		imprirStatus(minhaConta2);
		
	}
	
	public static void imprirStatus(Conta conta) {
		System.out.println("Nome é: " + conta.getNome() +" tem "+ conta.getSaldo());
	}
	
	

}
