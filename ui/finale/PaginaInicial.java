package ui.finale;

import java.awt.Color;
//import java.awt.BorderLayout; 
import java.awt.Font; 
import java.awt.Graphics; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 

import ui.finale.Generos; 

public class PaginaInicial extends JFrame { 

	JFrame tela = new JFrame();
	JPanel painel = new JPanel();
	private JLabel inicial; 
	private JButton generos; 

	public void criarTudo() { 
		
		tela.setSize(950, 750);
		tela.getContentPane().setBackground(new Color(51,153,255));
		
		painel.setBounds(260, 50, 370, 370);
		painel.setBackground(new Color(51,153,255));
		
		inicial = new JLabel("Bem-Vindo ao Puzzle Dr. E.Carneiro"); 
		generos = new JButton("Iniciar"); 
 
		//inicial 
		inicial.setFont(new Font("Arial", Font.BOLD, 30));  
		inicial.setBounds(200, 50,700,50); 
		//inicial.setAlignmentY(TOP_ALIGNMENT); 

 
		//generos 
		generos.setBounds(60, 50, 110, 70); 
		generos.setFont(new Font("Arial", Font.BOLD, 30));  
		generos.addActionListener(new ActionListener () {  
			public void actionPerformed (ActionEvent e) {
				setVisible(false);
				new Generos().setVisible(true);  
			}  
		});  
 

		tela.add(inicial); 
		tela.add(painel);
		tela.setLayout(null);
		tela.setVisible(true);
		tela.setSize(950, 750); 
		tela.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		tela.setLocationRelativeTo(null); 
		painel.setSize(300, 300); 
		painel.setLocation(300, 300); 
		painel.add(generos);
		
	} 

	public PaginaInicial() { 
		criarTudo(); 
	} 

	public static void main(String[] args) { 
		new PaginaInicial(); 
	} 

}