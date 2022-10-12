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
 
public class Regras extends JFrame { 
  
 private JLabel inicial; 
 private JButton voltar; 
  
 public void criarTudo() { 
   
  inicial = new JLabel("Bem-Vindo ao Puzzle E.Carneiro"); 
  voltar = new JButton("Voltar"); 
   
  setLayout(null); 
  setSize(950, 750); 
  setDefaultCloseOperation(EXIT_ON_CLOSE); 
  setLocationRelativeTo(null); 
  setVisible(true); 
   
  //inicial 
  inicial.setFont(new Font("Arial", Font.BOLD, 30));  
  inicial.setSize(500, 500); 
  //inicial.setAlignmentY(TOP_ALIGNMENT); 
   
  //voltar 
  voltar.setBounds(100, 300, 100, 60); 
  voltar.setFont(new Font("Arial", Font.BOLD, 30));  
  voltar.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
	   setVisible(false);
    new PaginaInicial().setVisible(true);  
   }  
  });  
  
  Panel painel = new Panel(); 
  painel.setSize(300, 300); 
  painel.setLocation(300, 300); 
  add(painel); 
  add(inicial); 
  painel.add(voltar); 
 
 } 
  
 public Regras() { 
  criarTudo(); 
 } 
 
 public static void main(String[] args) { 
  new Regras(); 
 } 
  
}