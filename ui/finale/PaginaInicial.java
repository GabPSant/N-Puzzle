package ui.finale;

import java.awt.*; 

//import java.awt.BorderLayout; 
import java.awt.Font; 
import java.awt.Graphics; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 

import ui.finale.Regras; 
import ui.finale.Generos; 

public class PaginaInicial extends JFrame { 

	private JLabel inicial; 
	private JButton generos; 
	private JButton regras; 


	public void criarTudo() { 
 
		inicial = new JLabel("Bem-Vindo ao Puzzle E.Carneiro"); 
		generos = new JButton("Generos"); 
		regras = new JButton("Regras"); 
 
		setSize(950, 750); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLocationRelativeTo(null); 
		setVisible(true); 
 
		//inicial 
		inicial.setFont(new Font("Arial", Font.BOLD, 30));  
		inicial.setSize(500, 50); 
		//inicial.setAlignmentY(TOP_ALIGNMENT); 
 
		//generos 
		generos.setBounds(60, 50, 110, 70); 
		generos.setFont(new Font("Arial", Font.BOLD, 30));  
		generos.addActionListener(new ActionListener () {  
			public void actionPerformed (ActionEvent e) {  
				new Generos().setVisible(true);  
			}  
		});  
 
		//regras 
		regras.setBounds(60, 200, 110, 70);  
		regras.setFont(new Font("Arial", Font.BOLD, 30));  
		regras.addActionListener(new ActionListener () {  
			public void actionPerformed (ActionEvent e) {  
				new Regras().setVisible(true);  
			}  
		});  


		Panel painel = new Panel(); 
		//painel.setLayout(null); 
		painel.setSize(300, 300); 
		painel.setLocation(300, 300); 
		add(painel); 
		add(inicial); 
		painel.add(generos); 
		painel.add(regras); 

	} 

	public PaginaInicial() { 
		criarTudo(); 
	} 

	public static void main(String[] args) { 
		new PaginaInicial(); 
	} 

	public class Panel extends JPanel { 
 
		public void paintComponent(Graphics g) { 
			super.paintComponent(g); 

		} 
	} 
}