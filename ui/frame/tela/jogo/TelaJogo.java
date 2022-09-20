package ui.frame.tela.jogo;
import javax.swing.JFrame;
import ui.frame.tela.jogo.TelaRegiao;

public class TelaJogo {
	JFrame jogo = new JFrame();
	TelaRegiao dimensao = new TelaRegiao(3);
	
	public void Teste() {
		jogo.add(dimensao.getRegiaoTela());
		jogo.setSize(300, 300);
		jogo.setVisible(true);
	}
	public static void main(String[] args) {
		TelaJogo teste = new TelaJogo();
		teste.Teste();
	}
}
