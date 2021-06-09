package com.deitel.desenho;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		 
		int width = getWidth(); // largura total ÿ
		int height = getHeight(); // altura totalÿ
		
		// desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, width, height);
		
		// desenha uma linha a partir do canto inferior esquerdo até o superior direito
		g.drawLine(0, height, width, 0);
		
		
		
	}

}
