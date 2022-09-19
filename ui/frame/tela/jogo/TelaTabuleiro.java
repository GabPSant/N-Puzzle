package ui.frame.tela.jogo;
import javax.swing.JPanel;
import java.awt.GridLayout;
import puzzle.nivel.NivelNumero;
import ui.modelo.Tabuleiro;
import java.util.ArrayList;

public class TelaTabuleiro extends JPanel{
	private static final long serialVersionUID = 1L;
	NivelNumero nivel = new NivelNumero();
	private ArrayList <TelaRegiao> regioes;
	
	public TelaTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(nivel.getTabuleiro().getDefinir(),nivel.getTabuleiro().getDefinir()));
		for(int i =0; i<nivel.getTabuleiro().getDefinir()*nivel.getTabuleiro().getDefinir();i++) {
			
		}
	}
}
