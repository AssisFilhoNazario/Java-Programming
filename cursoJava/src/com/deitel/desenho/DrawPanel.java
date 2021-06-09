package com.deitel.desenho;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		// chama paintComponent para assegurar que o painel � exibido corretamente
		super.paintComponent(g);
		 
		int width = getWidth(); // largura total �
		int height = getHeight(); // altura total�
		
		// desenha uma linha a partir do canto superior esquerdo at� o inferior direito
		g.drawLine(0, 0, width, height);
		
		// desenha uma linha a partir do canto inferior esquerdo at� o superior direito
		g.drawLine(0, height, width, 0);
		
		
		
	}

}
