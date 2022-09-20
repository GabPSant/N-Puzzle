package ui.grafico.imagem.imglvl1;

import java.awt.*;

/*import java.awt.BorderLayout;
*import java.awt.Font;
*import java.awt.Graphics;
*import java.awt.Image;
*/

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BaseImagem extends JFrame {

	private JLabel grafico;
	private ImageIcon fone1;
	private ImageIcon fone2;
	private ImageIcon fone3;
	private ImageIcon fone4;
	private ImageIcon fone5;
	private ImageIcon fone6;
	private ImageIcon fone7;
	private ImageIcon fone8;
	
	private int a = 10;
	private int b = 230;
	private int c = 450;

	
public void criarTudo() {
	
	grafico = new JLabel();
	fone1 = new ImageIcon(getClass().getResource("fone1.jpg"));
	fone2 = new ImageIcon(getClass().getResource("fone2.jpg"));
	fone3 = new ImageIcon(getClass().getResource("fone3.jpg"));
	fone4 = new ImageIcon(getClass().getResource("fone4.jpg"));
	fone5 = new ImageIcon(getClass().getResource("fone5.jpg"));
	fone6 = new ImageIcon(getClass().getResource("fone6.jpg"));
	fone7 = new ImageIcon(getClass().getResource("fone7.jpg"));
	fone8 = new ImageIcon(getClass().getResource("fone8.jpg"));

	
	setSize(950, 750);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setVisible(true);

	Panel painel = new Panel();
	add(painel);
	painel.add(grafico);

}

public BaseImagem() {
	criarTudo();
}

public static void main(String[] args) {
	new BaseImagem();
}

public class Panel extends JPanel {
	
	public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image local1 = fone1.getImage();
			g.drawImage(local1, a, a, this);
			
			Image local2 = fone2.getImage();
			g.drawImage(local2, b, a, this);
			
			Image local3 = fone3.getImage();
			g.drawImage(local3, c, a, this);
			
			Image local4 = fone4.getImage();
			g.drawImage(local4, a, b, this);
			
			Image local5 = fone5.getImage();
			g.drawImage(local5, b, b, this);
			
			Image local6 = fone6.getImage();
			g.drawImage(local6, c, b, this);
			
			Image local7 = fone7.getImage();
			g.drawImage(local7, a, c, this);
			
			Image local8 = fone8.getImage();
			g.drawImage(local8, b, c, this);
		}
	}
}
