package ui.grafico.imagem.imglvl2;

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
 
 
public class BaseImagemlvl2 extends JFrame { 
 
 private JLabel grafico; 
 private ImageIcon fone4x41; 
 private ImageIcon fone4x42; 
 private ImageIcon fone4x43; 
 private ImageIcon fone4x44; 
 private ImageIcon fone4x45; 
 private ImageIcon fone4x46; 
 private ImageIcon fone4x47; 
 private ImageIcon fone4x48; 
 private ImageIcon fone4x49; 
 private ImageIcon fone4x410; 
 private ImageIcon fone4x411; 
 private ImageIcon fone4x412; 
 private ImageIcon fone4x413; 
 private ImageIcon fone4x414; 
 private ImageIcon fone4x415; 
 
  
 private int a = 10; 
 private int b = 150; 
 private int c = 290; 
 private int d = 430; 
 
  
public void criarTudo() { 
  
 grafico = new JLabel(); 
 fone4x41 = new ImageIcon(getClass().getResource("fone4x41.jpg")); 
 fone4x42 = new ImageIcon(getClass().getResource("fone4x42.jpg")); 
 fone4x43 = new ImageIcon(getClass().getResource("fone4x43.jpg")); 
 fone4x44 = new ImageIcon(getClass().getResource("fone4x44.jpg")); 
 fone4x45 = new ImageIcon(getClass().getResource("fone4x45.jpg")); 
 fone4x46 = new ImageIcon(getClass().getResource("fone4x46.jpg")); 
 fone4x47 = new ImageIcon(getClass().getResource("fone4x47.jpg")); 
 fone4x48 = new ImageIcon(getClass().getResource("fone4x48.jpg")); 
 fone4x49 = new ImageIcon(getClass().getResource("fone4x49.jpg")); 
 fone4x410 = new ImageIcon(getClass().getResource("fone4x410.jpg")); 
 fone4x411 = new ImageIcon(getClass().getResource("fone4x411.jpg")); 
 fone4x412 = new ImageIcon(getClass().getResource("fone4x412.jpg")); 
 fone4x413 = new ImageIcon(getClass().getResource("fone4x413.jpg")); 
 fone4x414 = new ImageIcon(getClass().getResource("fone4x414.jpg")); 
 fone4x415 = new ImageIcon(getClass().getResource("fone4x415.jpg")); 
 
  
 setSize(950, 750); 
 setDefaultCloseOperation(EXIT_ON_CLOSE); 
 setLocationRelativeTo(null); 
 setVisible(true); 
 
 Panel painel = new Panel(); 
 add(painel); 
 painel.add(grafico); 
 
} 
 
public BaseImagemlvl2() { 
 criarTudo(); 
} 
 
public static void main(String[] args) { 
 new BaseImagemlvl2(); 
} 
 
public class Panel extends JPanel { 
  
 public void paintComponent(Graphics g) { 
   super.paintComponent(g); 
    
   Image local1 = fone4x41.getImage(); 
   g.drawImage(local1, a, a, this); 
    
   Image local2 = fone4x42.getImage(); 
   g.drawImage(local2, b, a, this); 
    
   Image local3 = fone4x43.getImage(); 
   g.drawImage(local3, c, a, this); 
    
   Image local4 = fone4x44.getImage(); 
   g.drawImage(local4, d, a, this); 
    
   Image local5 = fone4x45.getImage(); 
   g.drawImage(local5, a, b, this); 
    
   Image local6 = fone4x46.getImage(); 
   g.drawImage(local6, b, b, this); 
    
   Image local7 = fone4x47.getImage(); 
   g.drawImage(local7, c, b, this); 
    
   Image local8 = fone4x48.getImage(); 
   g.drawImage(local8, d, b, this); 
 
   Image local9 = fone4x49.getImage(); 
   g.drawImage(local9, a, c, this); 
 
   Image local10 = fone4x410.getImage(); 
   g.drawImage(local10, b, c, this); 
 
   Image local11 = fone4x411.getImage(); 
   g.drawImage(local11, c, c, this); 
 
   Image local12 = fone4x412.getImage(); 
   g.drawImage(local12, d, c, this); 
 
   Image local13 = fone4x413.getImage(); 
   g.drawImage(local13, a, d, this); 
 
   Image local14 = fone4x414.getImage(); 
   g.drawImage(local14, b, d, this); 
 
   Image local15 = fone4x415.getImage(); 
   g.drawImage(local15, c, d, this); 
  } 
 } 
}
