package com.deitel.conta;



import javax.swing.JOptionPane;

public class ContaTeste {

	public static void main(String[] args) {
	
		Conta minhaConta = new Conta("Marla", 1000);
		Conta minhaConta2 = new Conta("Fulano", -700);
		
		
		System.out.println("O nome é "+minhaConta.getNome() + " saldo de " + minhaConta.getSaldo());
		System.out.println("O nome é "+minhaConta2.getNome() + " saldo de " + minhaConta2.getSaldo());
		
		
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado"));
		minhaConta.deposit(saldo);
	
		JOptionPane.showMessageDialog(null, "Nome é: " + minhaConta.getNome() + " tem " + minhaConta.getSaldo() );
		JOptionPane.showMessageDialog(null, "Nome é: " + minhaConta2.getNome() + " tem " + minhaConta2.getSaldo() );
		
	}
	
	

}
