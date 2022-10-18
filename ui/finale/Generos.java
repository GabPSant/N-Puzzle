package ui.finale;

import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
 
import ui.finale.PaginaInicial; 
import ui.finale.TiposNumeros; 
import ui.finale.TiposLetras; 
 
public class Generos extends JFrame { 
	
	JFrame tela = new JFrame();
	JPanel painel = new JPanel();
	private JLabel inicial; 
	private JButton voltar; 
	private JButton numeros; 
	private JButton letras; 
  
 public void criarTudo() { 
	 
	 	tela.setSize(950, 750);
		tela.getContentPane().setBackground(new Color(51,153,255));
		
		painel.setBounds(260, 50, 370, 370);
		painel.setBackground(new Color(51,153,255));
   
		inicial = new JLabel("Tipos"); 
		voltar = new JButton("Voltar"); 
		numeros = new JButton("Números"); 
		letras = new JButton("Letras"); 
   
  //inicial 
  inicial.setFont(new Font("Arial", Font.BOLD, 30));  
  inicial.setBounds(380, 50,700,50); 
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
   
  //numeros 
  numeros.setBounds(50, 50, 100, 100); 
  numeros.setFont(new Font("Arial", Font.BOLD, 30));  
  numeros.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
	setVisible(false);
    new TiposNumeros().setVisible(true);  
   }  
  });  
   
  //letras 
  letras.setBounds(70, 30, 100, 100); 
  letras.setFont(new Font("Arial", Font.BOLD, 30));  
  letras.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
	   setVisible(false);
	new TiposLetras().setVisible(true);  
   }  
  });  
  
	tela.add(inicial); 
	tela.add(voltar);
	tela.add(painel);
	tela.setLayout(null);
	tela.setVisible(true);
	tela.setSize(950, 750); 
	tela.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	tela.setLocationRelativeTo(null); 
	painel.setSize(150, 300); 
	painel.setLocation(350, 300); 
	painel.add(numeros);
	painel.add(letras);
 
 } 
  
 public Generos() { 
  criarTudo(); 
 } 
 
 public static void main(String[] args) { 
  new Generos(); 
 } 
  
}