package ui.grafico.imagem.imglvl3;

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


public class BaseImagemlvl3 extends JFrame {

	private JLabel grafico;
	private ImageIcon quatrob1;
	private ImageIcon quatrob2;
	private ImageIcon quatrob3;
	private ImageIcon quatrob4;
	private ImageIcon quatrob5;
	private ImageIcon quatrob6;
	private ImageIcon quatrob7;
	private ImageIcon quatrob8;
	private ImageIcon quatrob9;
	private ImageIcon quatrob10;
	private ImageIcon quatrob11;
	private ImageIcon quatrob12;
	private ImageIcon quatrob13;
	private ImageIcon quatrob14;
	private ImageIcon quatrob15;
	private ImageIcon quatrob16;
	private ImageIcon quatrob17;
	private ImageIcon quatrob18;
	private ImageIcon quatrob19;
	private ImageIcon quatrob20;
	private ImageIcon quatrob21;
	private ImageIcon quatrob22;
	private ImageIcon quatrob23;
	private ImageIcon quatrob24;

	private int a = 10;
	private int b = 150;
	private int c = 290;
	private int d = 430;
	private int e = 570;

public void criarTudo() {
	
	grafico = new JLabel();
	quatrob1 = new ImageIcon(getClass().getResource("quatrob1.jpg"));
	quatrob2 = new ImageIcon(getClass().getResource("quatrob2.jpg"));
	quatrob3 = new ImageIcon(getClass().getResource("quatrob3.jpg"));
	quatrob4 = new ImageIcon(getClass().getResource("quatrob4.jpg"));
	quatrob5 = new ImageIcon(getClass().getResource("quatrob5.jpg"));
	quatrob6 = new ImageIcon(getClass().getResource("quatrob6.jpg"));
	quatrob7 = new ImageIcon(getClass().getResource("quatrob7.jpg"));
	quatrob8 = new ImageIcon(getClass().getResource("quatrob8.jpg"));
	quatrob9 = new ImageIcon(getClass().getResource("quatrob9.jpg"));
	quatrob10 = new ImageIcon(getClass().getResource("quatrob10.jpg"));
	quatrob11 = new ImageIcon(getClass().getResource("quatrob11.jpg"));
	quatrob12 = new ImageIcon(getClass().getResource("quatrob12.jpg"));
	quatrob13 = new ImageIcon(getClass().getResource("quatrob13.jpg"));
	quatrob14 = new ImageIcon(getClass().getResource("quatrob14.jpg"));
	quatrob15 = new ImageIcon(getClass().getResource("quatrob15.jpg"));
	quatrob16 = new ImageIcon(getClass().getResource("quatrob16.jpg"));
	quatrob17 = new ImageIcon(getClass().getResource("quatrob17.jpg"));
	quatrob18 = new ImageIcon(getClass().getResource("quatrob18.jpg"));
	quatrob19 = new ImageIcon(getClass().getResource("quatrob19.jpg"));
	quatrob20 = new ImageIcon(getClass().getResource("quatrob20.jpg"));
	quatrob21 = new ImageIcon(getClass().getResource("quatrob21.jpg"));
	quatrob22 = new ImageIcon(getClass().getResource("quatrob22.jpg"));
	quatrob23 = new ImageIcon(getClass().getResource("quatrob23.jpg"));
	quatrob24 = new ImageIcon(getClass().getResource("quatrob24.jpg"));
	
	setSize(950, 750);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setVisible(true);

	Panel painel = new Panel();
	add(painel);
	painel.add(grafico);

}

public BaseImagemlvl3() {
	criarTudo();
}

public static void main(String[] args) {
	new BaseImagemlvl3();
}

public class Panel extends JPanel {
	
	public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image local1 = quatrob1.getImage();
			g.drawImage(local1, a, a, this);
			
			Image local2 = quatrob2.getImage();
			g.drawImage(local2, b, a, this);
			
			Image local3 = quatrob3.getImage();
			g.drawImage(local3, c, a, this);
			
			Image local4 = quatrob4.getImage();
			g.drawImage(local4, d, a, this);
			
			Image local5 = quatrob5.getImage();
			g.drawImage(local5, e, a, this);
			
			Image local6 = quatrob6.getImage();
			g.drawImage(local6, a, b, this);
			
			Image local7 = quatrob7.getImage();
			g.drawImage(local7, b, b, this);
			
			Image local8 = quatrob8.getImage();
			g.drawImage(local8, c, b, this);

			Image local9 = quatrob9.getImage();
			g.drawImage(local9, d, b, this);

			Image local10 = quatrob10.getImage();
			g.drawImage(local10, e, b, this);

			Image local11 = quatrob11.getImage();
			g.drawImage(local11, a, c, this);

			Image local12 = quatrob12.getImage();
			g.drawImage(local12, b, c, this);

			Image local13 = quatrob13.getImage();
			g.drawImage(local13, c, c, this);

			Image local14 = quatrob14.getImage();
			g.drawImage(local14, d, c, this);

			Image local15 = quatrob15.getImage();
			g.drawImage(local15, e, c, this);

			Image local16 = quatrob16.getImage();
			g.drawImage(local16, a, d, this);

			Image local17 = quatrob17.getImage();
			g.drawImage(local17, b, d, this);

			Image local18 = quatrob18.getImage();
			g.drawImage(local18, c, d, this);

			Image local19 = quatrob19.getImage();
			g.drawImage(local19, d, d, this);

			Image local20 = quatrob20.getImage();
			g.drawImage(local20, e, d, this);

			Image local21 = quatrob21.getImage();
			g.drawImage(local21, a, e, this);

			Image local22 = quatrob22.getImage();
			g.drawImage(local22, b, e, this);

			Image local23 = quatrob23.getImage();
			g.drawImage(local23, c, e, this);

			Image local24 = quatrob24.getImage();
			g.drawImage(local24, d, e, this);

		}
	}
}