package ui.frame.tela.inicio;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

public class Inicio {
	JFrame pagina = new JFrame("teste da pagina de inicio");
	JLabel titulo = new JLabel("Titulo do Jogo");
	JButton inicio = new JButton("INICIAR");
	JPanel conteudo = new JPanel();
	
	public void Pagina() {
		this.titulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.titulo.setVerticalAlignment(SwingConstants.TOP);
		this.titulo.setSize(50,20);
		this.titulo.setForeground(new Color(204,0,0));
		this.titulo.setFont(new Font("Times New Roman", Font.BOLD, 50));
		
		this.inicio.setHorizontalAlignment(SwingConstants.CENTER);
		this.inicio.setSize(60, 45);
		this.inicio.setBackground(new Color(204,0,0));
		
		this.conteudo.setBounds(0,0,400,800);
		this.conteudo.add(inicio);
		this.conteudo.add(titulo);
		
		this.pagina.setSize(800, 800);
		this.pagina.setBackground(new Color(25,25,112));
		this.pagina.add(conteudo);
		
		this.pagina.setVisible(true);
		this.titulo.setVisible(true);
		this.inicio.setVisible(true);
	}
	public static void main(String[] args) {
		Inicio teste = new Inicio();
		teste.Pagina();
	}
}
