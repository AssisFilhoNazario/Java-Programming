package com.deitel.caixaDialago;

import javax.swing.JOptionPane;

public class Dialog1 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Qual o seu nome?");
		
		String mensagem = String.format("Welcome, %s, to Java Programming!", name);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
