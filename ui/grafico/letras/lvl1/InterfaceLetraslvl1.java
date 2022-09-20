package ui.grafico.letras.lvl1;

import java.awt.*;

/*import java.awt.BorderLayout;
*import java.awt.Font;
*import java.awt.Graphics;
*import java.awt.Image;
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfaceLetraslvl1 extends JFrame {

	private JLabel grafico;
	private JTextField v1;
	private JTextField v2;
	private JTextField v3;
	private JTextField v4;
	private JTextField v5;
	private JTextField v6;
	private JTextField v7;
	private JTextField v8;

	private int a = 30;
	private int b = 250;
	private int c = 470;
	
public void criarTudo() {
	
	grafico = new JLabel();
	v1 = new JTextField(" A ");
	v2 = new JTextField(" B ");
	v3 = new JTextField(" C ");
	v4 = new JTextField(" D ");
	v5 = new JTextField(" E ");
	v6 = new JTextField(" F ");
	v7 = new JTextField(" G ");
	v8 = new JTextField(" H ");
	
	setSize(950, 750);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setVisible(true);

  v1.setBounds(a, a, 100, 100);
  v1.setFont(new Font("Arial", Font.BOLD, 90));
  
  v2.setBounds(b, a, 100, 100);
  v2.setFont(new Font("Arial", Font.BOLD, 90));

  v3.setBounds(c, a, 100, 100);
  v3.setFont(new Font("Arial", Font.BOLD, 90));

  v4.setBounds(a, b, 100, 100);
  v4.setFont(new Font("Arial", Font.BOLD, 90));

  v5.setBounds(b, b, 100, 100);
  v5.setFont(new Font("Arial", Font.BOLD, 90));

  v6.setBounds(c, b, 100, 100);
  v6.setFont(new Font("Arial", Font.BOLD, 90));

  v7.setBounds(a, c, 100, 100);
  v7.setFont(new Font("Arial", Font.BOLD, 90));

  v8.setBounds(b, c, 100, 100);
  v8.setFont(new Font("Arial", Font.BOLD, 90));

  
	Panel painel = new Panel();
	add(painel);
	painel.add(grafico);
	painel.add(v1);
	painel.add(v2);
	painel.add(v3);
	painel.add(v4);
	painel.add(v5);
	painel.add(v6);
	painel.add(v7);
	painel.add(v8);

}

public InterfaceLetraslvl1() {
	criarTudo();
}

public static void main(String[] args) {
	new InterfaceLetraslvl1();
}

}


