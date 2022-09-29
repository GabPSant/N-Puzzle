package ui.frame.tela.jogo;
import javax.swing.JFrame;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaJogo {
	JFrame jogo = new JFrame();
	GridLayout começo = new GridLayout(3,3);
	public void Teste() {
		jogo.setLayout(começo);
		jogo.add(new JButton("1"));
		jogo.add(new JButton("2"));
		jogo.add(new JButton("3"));
		jogo.add(new JButton("4"));
		jogo.add(new JButton("5"));
		jogo.add(new JButton("6"));
		jogo.add(new JButton("7"));
		jogo.add(new JButton(""));
		jogo.setSize(300, 300);
		jogo.setVisible(true);
	}
	public static void main(String[] args) {
		TelaJogo teste = new TelaJogo();
		teste.Teste();
	}
}
