package ui.frameteste;

import java.awt.Font; 
import java.awt.Panel; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
 
import ui.grafico.imagem.imglvl1.BaseImagem; 
 
public class FrameTeste extends JFrame { 
  
	private JLabel grafico; 
	private JButton v1; 
  
	public void criar() { 
   
		grafico = new JLabel(); 
		v1 = new JButton(" Clique Aqui Para Mudar "); 
		
		//algoritimo para mudar de frame ao click de um elemento
		
		v1.addActionListener(new ActionListener () { 
			public void actionPerformed (ActionEvent e) { 
				setVisible(false);
				new BaseImagem().setVisible(true); 
			} 
		}); 
 
  
		setSize(950, 750); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLocationRelativeTo(null); 
		setVisible(true); 
 
		v1.setBounds(30, 30, 100, 100); 
		v1.setFont(new Font("Arial", Font.BOLD, 30)); 
  
		Panel painel = new Panel(); 
		add(painel); 
		painel.add(grafico); 
		painel.add(v1); 
  
	} 
  
	public FrameTeste() { 
		criar(); 
	} 
 
	public static void main(String[] args) { 
		new FrameTeste(); 
	} 
 
}
