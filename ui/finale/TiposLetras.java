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
import ui.finale.Generos; 
import ui.grafico.letras.lvl1.InterfaceLetraslvl1; 
 
public class TiposLetras extends JFrame { 
  
 private JLabel inicial; 
 private JButton voltar; 
 private JButton facil; 
 private JButton medio; 
 private JButton dificil; 
 
  
 public void criarLetras() { 
   
  inicial = new JLabel("Bem-Vindo ao Puzzle E.Carneiro"); 
  voltar = new JButton("Voltar"); 
  facil = new JButton("Facil"); 
  medio = new JButton("Medio"); 
  dificil = new JButton("Dificil"); 
 
   
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
    new Generos().setVisible(true);  
   }  
  });  
   
  //facil 
  facil.setBounds(30, 30, 100, 100); 
  facil.setFont(new Font("Arial", Font.BOLD, 30));  
  facil.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
    new InterfaceLetraslvl1().setVisible(true);  
   }  
  });  
   
  //medio 
  medio.setBounds(30, 30, 100, 100); 
  medio.setFont(new Font("Arial", Font.BOLD, 30));  
  medio.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
    new PaginaInicial().setVisible(true);  
   }  
  });  
   
  //dificil 
  dificil.setBounds(30, 30, 100, 100); 
  dificil.setFont(new Font("Arial", Font.BOLD, 30));  
  dificil.addActionListener(new ActionListener () {  
   public void actionPerformed (ActionEvent e) {  
    new PaginaInicial().setVisible(true);  
   }  
  });  
  
  Panel painel = new Panel(); 
  painel.setSize(300, 300); 
  painel.setLocation(475, 375); 
  add(painel); 
  add(inicial); 
  painel.add(voltar); 
  painel.add(facil); 
  painel.add(medio); 
  painel.add(dificil); 
 
 } 
  
 public TiposLetras() { 
  criarLetras(); 
 } 
 
 public static void main(String[] args) { 
  new TiposLetras(); 
 } 
  
}