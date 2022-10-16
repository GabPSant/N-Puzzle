package ui.finale;

import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
 
import ui.finale.PaginaInicial; 
 
public class Regras extends JFrame { 
  
	JFrame tela = new JFrame();
	JPanel painel = new JPanel();
	private JLabel inicial; 
	private JLabel leis;
	private JButton voltar; 
  
 public void criarTudo() { 
	
	 tela.setSize(950, 750);
	 tela.getContentPane().setBackground(new Color(51,153,255));
	 
	 painel.setBounds(260, 50, 370, 370);
	 painel.setBackground(new Color(51,153,255));
   
	 inicial = new JLabel("Regras"); 
	 voltar = new JButton("Voltar"); 
	 leis = new JLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
   
  	//inicial 
  	inicial.setFont(new Font("Arial", Font.BOLD, 30));  
	inicial.setBounds(390, 50,700,50); 
  	//inicial.setAlignmentY(TOP_ALIGNMENT); 
   
  	//voltar 
  	voltar.setBounds(690, 45, 150, 60); 
  	voltar.setFont(new Font("Arial", Font.ITALIC, 30));  
  	voltar.addActionListener(new ActionListener () {  
  		public void actionPerformed (ActionEvent e) {  
  			setVisible(false);
  			new PaginaInicial().setVisible(true);  
  		}  
  	});  
  	
  	//leis
  	leis.setBounds(10, 10, 150, 150); 
  	leis.setFont(new Font("Arial", Font.LAYOUT_NO_LIMIT_CONTEXT, 20));  
  
	tela.add(inicial); 
	tela.add(voltar);
	tela.add(painel);
	tela.setLayout(null);
	tela.setVisible(true);
	tela.setSize(950, 750); 
	tela.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	tela.setLocationRelativeTo(null); 
	painel.setSize(300, 300); 
	painel.setLocation(300, 300); 
	painel.add(leis);
 	} 
  
 	public Regras() { 
 		criarTudo(); 
 	} 
 
 	public static void main(String[] args) { 
 		new Regras(); 
 	} 
  
}