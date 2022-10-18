package ui.finale;

import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
 
import ui.finale.PaginaInicial; 
import ui.finale.Generos; 
import ui.frame.tela.jogo.TelaNumero;
 
 
public class TiposNumeros extends JFrame { 
	
	JFrame tela = new JFrame();
	JPanel painel = new JPanel();
	private JLabel inicial; 
	private JButton voltar; 
	private JButton facil; 
	private JButton medio; 
	private JButton dificil; 
	
	TelaNumero jogo = new TelaNumero();
  
 public void criarNumeros() {
	 
	 	tela.setSize(950, 750);
		tela.getContentPane().setBackground(new Color(51,153,255));
		
		painel.setBounds(260, 50, 370, 370);
		painel.setBackground(new Color(51,153,255));

		inicial = new JLabel("Nível Números"); 
		voltar = new JButton("Voltar"); 
		facil = new JButton("Facil"); 
		medio = new JButton("Médio"); 
		dificil = new JButton("Dificil"); 
   
  //inicial 
  inicial.setFont(new Font("Arial", Font.BOLD, 30));  
  inicial.setBounds(320, 50,700,50); 
  //inicial.setAlignmentY(TOP_ALIGNMENT); 
   
  //voltar 
  voltar.setBounds(690, 45, 150, 60); 
  voltar.setFont(new Font("Arial", Font.ITALIC, 30));  
  voltar.addActionListener(new ActionListener () {  
		public void actionPerformed (ActionEvent e) {  
			setVisible(false);
    new Generos().setVisible(true);  
   }  
  });  
   
  //facil 
  facil.setBounds(30, 30, 100, 100); 
  facil.setFont(new Font("Arial", Font.BOLD, 30));  
  facil.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
	   setVisible(false);
	   jogo.getTeste().deslocamento().getTabuleiro().setDefinir(3);
	   jogo.Teste();
   }  
  });  
   
  //medio 
  medio.setBounds(60, 60, 100, 100); 
  medio.setFont(new Font("Arial", Font.BOLD, 30));  
  medio.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
	   	setVisible(false);
		jogo.getTeste().deslocamento().getTabuleiro().setDefinir(4);
		jogo.Teste();   }  
  });  
   
  //dificil 
  dificil.setBounds(90, 90, 100, 100); 
  dificil.setFont(new Font("Arial", Font.BOLD, 30));  
  dificil.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
	   setVisible(false);
	   jogo.getTeste().deslocamento().getTabuleiro().setDefinir(5);
	   jogo.Teste();   }  
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
	painel.add(facil);
	painel.add(medio);
	painel.add(dificil);
 
 } 
  
 public TiposNumeros() { 
  criarNumeros(); 
 } 
 
 public static void main(String[] args) { 
  new TiposNumeros(); 
 } 
  
}