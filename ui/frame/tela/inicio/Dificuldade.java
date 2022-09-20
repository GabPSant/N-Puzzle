package ui.frame.tela.inicio;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import puzzle.nivel.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Dificuldade {
	private JFrame dificuldade = new JFrame("Pagina do nivel");
	private JLabel titulo = new JLabel("Qual vai ser a dificuldade?");
	private JButton nivelFacil = new JButton("Facil");
	private JButton nivelMedio = new JButton("Medio");
	private JButton nivelDificil = new JButton("Dificil");
	
	public void Pagina() {
		nivelFacil.setBounds(250, 125, 100, 60);
		nivelFacil.setBackground(new Color(153,153,153));
		nivelFacil.setForeground(new Color(0,255,51));
		
		nivelMedio.setBounds(250,275,100,60);
		nivelMedio.setBackground(new Color(153,153,153));
		nivelMedio.setForeground(new Color(255,102,0));
		
		nivelDificil.setBounds(250,425,100,60);
		nivelDificil.setBackground(new Color(153,153,153));
		nivelDificil.setForeground(new Color(255,0,0));
		
		titulo.setBounds(195, 25, 250, 100);
		titulo.setFont(new Font("Times New Roman",Font.BOLD, 20));
		titulo.setForeground(new Color(0,0,204));
		
		dificuldade.setSize(600, 600);
		dificuldade.setLayout(null);
		dificuldade.getContentPane().setBackground(new Color(255,204,51));
		dificuldade.add(nivelFacil);
		dificuldade.add(nivelMedio);
		dificuldade.add(nivelDificil);
		dificuldade.add(titulo);
		dificuldade.setVisible(true);
	}
	public static void main(String[] args) {
		Dificuldade teste = new Dificuldade();
		teste.Pagina();
	}
}
