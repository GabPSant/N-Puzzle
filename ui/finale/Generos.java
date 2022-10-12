package ui.finale;

import java.awt.*; 

import java.awt.BorderLayout; 
import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
 
import ui.finale.PaginaInicial; 
import ui.finale.TiposNumeros; 
import ui.finale.TiposLetras; 
import ui.finale.TiposImagens; 
 
public class Generos extends JFrame { 
  
 private JLabel inicial; 
 private JButton voltar; 
 private JButton numeros; 
 private JButton letras; 
 private JButton imagens; 
  
 public void criarTudo() { 
   
  inicial = new JLabel("Bem-Vindo ao Puzzle E.Carneiro"); 
  voltar = new JButton("Voltar"); 
  numeros = new JButton("Numeros"); 
  letras = new JButton("Letras"); 
  imagens = new JButton("Imagens"); 
   
  setSize(950, 750); 
  setDefaultCloseOperation(EXIT_ON_CLOSE); 
  setLocationRelativeTo(null); 
  setVisible(true); 
   
  //inicial 
  inicial.setFont(new Font("Arial", Font.BOLD, 30));  
  inicial.setSize(150, 150); 
  inicial.setAlignmentY(TOP_ALIGNMENT); 
   
  //voltar 
  voltar.setBounds(30, 30, 100, 100); 
  voltar.setFont(new Font("Arial", Font.BOLD, 30)); 
  
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
   
  //imagens 
  imagens.setBounds(90, 30, 100, 100); 
  imagens.setFont(new Font("Arial", Font.BOLD, 30));  
  imagens.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {
	   setVisible(false);
    new TiposImagens().setVisible(true);  
   }  
  });  
  
  Panel painel = new Panel(); 
  painel.setSize(300, 300); 
  painel.setLocation(475, 375); 
  add(painel); 
  add(inicial); 
  painel.add(voltar); 
  painel.add(numeros); 
  painel.add(letras); 
  painel.add(imagens); 
 
 } 
  
 public Generos() { 
  criarTudo(); 
 } 
 
 public static void main(String[] args) { 
  new Generos(); 
 } 
  
}