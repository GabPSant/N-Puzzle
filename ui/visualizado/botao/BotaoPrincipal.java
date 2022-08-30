package ui.visualizado.botao;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import ui.modelo.Jogador;
import ui.modelo.Tabuleiro;
import ui.controle.TabuleiroControle;
import ui.visualizado.tela.TelaTabuleiro;
import ui.visualizado.tela.TelaControle;

public abstract class BotaoPrincipal implements ActionListener {
	private JButton principal = new JButton();
	private Tabuleiro tabuleiro;
	private Jogador jogador;
	private TabuleiroControle tabuleiroControle;
	private TelaTabuleiro telaTabuleiro;
	private TelaControle controleTabuleiro;

	public BotaoPrincipal(String posicao, Tabuleiro tabuleiro, 
		TelaTabuleiro telaTabuleiro, TelaControle controleTabuleiro, Jogador jogador) {
		principal.setText(posicao);
		principal.addActionListener(this);
		setTabuleiro(tabuleiro);
		setJogador(jogador);
		setTabuleiroControle(new TabuleiroControle(tabuleiro));
		setTelaTabuleiro(telaTabuleiro);
		setControleTabuleiro(controleTabuleiro);
	}

	public abstract void alteraEstadoTabuleiro();

	public TabuleiroControle getTabuleiroControle() {
		return tabuleiroControle;
	}

	public void setTabuleiroControle(TabuleiroControle controle) {
		this.tabuleiroControle = controle;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public TelaTabuleiro getTelaTabuleiro() {
		return telaTabuleiro;
	}

	public void setTelaTabuleiro(TelaTabuleiro telaTabuleiro) {
		this.telaTabuleiro = telaTabuleiro;
	}

	public TelaControle getControleTabuleiro() {
		return controleTabuleiro;
	}

	public void setControleTabuleiro(TelaControle controleTabuleiro) {
		this.controleTabuleiro = controleTabuleiro;
	}
}
