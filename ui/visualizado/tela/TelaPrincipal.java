package ui.visualizado.tela;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ui.modelo.Jogador;
import ui.modelo.Tabuleiro;

public class TelaPrincipal extends JFrame{
	private static final long serialVersionUID = 1L;
	private Tabuleiro tabuleiro;
	private Jogador jogador;

	public void IniciaJogo() {
		String JogadorNome = JOptionPane.showInputDialog("Digite seu nome para jogar:");
		jogador = new Jogador(JogadorNome);
		tabuleiro = new Tabuleiro();
		organizarLayout(this.tabuleiro);
	}

	private void organizarLayout(Tabuleiro tabuleiro) {
		TelaTabuleiro telaTabuleiro = new TelaTabuleiro(tabuleiro);
		TelaControle telaControle = new TelaControle(tabuleiro, telaTabuleiro, jogador);
		addKeyListener(telaControle);

		GridBagLayout gridBagLayout = (GridBagLayout) telaControle.getLayout();
		gridBagLayout.columnWidths = new int[] { 0, 200, 0, 0, 0, 0, 0 };
		telaControle.setPreferredSize(new Dimension(600, 100));

		getContentPane().setLayout(new BorderLayout());
		setTitle("Jogo do 8");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setFocusable(true);

		add(telaTabuleiro, BorderLayout.CENTER);
		add(telaControle, BorderLayout.SOUTH);
	}

}
