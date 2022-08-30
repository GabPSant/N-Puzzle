package ui.visualizado.tela;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JLabel;
import ui.modelo.Jogador;
import ui.modelo.Tabuleiro;
import ui.modelo.TabuleiroObservador;
import ui.visualizado.botao.BotaoBaixo;
import ui.visualizado.botao.BotaoCima;
import ui.visualizado.botao.BotaoDireita;
import ui.visualizado.botao.BotaoEsquerda;

public class TelaControle implements KeyListener, TabuleiroObservador{// Serve para definir os botões que o usuário vai usar na tela
	private JPanel pecas = new JPanel();
	private Tabuleiro tabuleiro;
	private Jogador jogador;
	private TelaTabuleiro telaTabuleiro;
	private JLabel jogadasLabel;
	private BotaoCima botaoCima;
	private BotaoBaixo botaoBaixo;
	private BotaoDireita botaoDireita;
	private BotaoEsquerda botaoEsquerda;

	public TelaControle(Tabuleiro tabuleiro, TelaTabuleiro telaTabuleiro, Jogador jogador) {
		this.tabuleiro = tabuleiro;
		this.telaTabuleiro = telaTabuleiro;
		this.jogador = jogador;

		geraControleTabuleiro();
		this.tabuleiro.registrarObservador(this);
	}

	private void geraControleTabuleiro() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints posicao = new GridBagConstraints();
		posicao.fill = GridBagConstraints.HORIZONTAL;

		pecas.setLayout(layout);

		posicao.gridy = 0;
		posicao.gridx = 0;
		JLabel jogadorLabel = new JLabel(String.format("Jogador: %s", jogador.getJogadorNome()));
		pecas.add(jogadorLabel, posicao);

		posicao.gridy = 1;
		posicao.gridx = 0;
		posicao.gridwidth = 3;
		jogadasLabel = new JLabel(String.format("Jogadas: %d", jogador.getJogadas()));
		pecas.add(jogadasLabel, posicao);
// Ainda precisamos resolver o problema dos botões.
		posicao.gridwidth = 1;
		posicao.gridy = 0;
		posicao.gridx = 5;
		botaoCima = new BotaoCima("↑", tabuleiro, telaTabuleiro, this, jogador);
		pecas.add(botaoCima, posicao);

		posicao.gridy = 2;
		posicao.gridx = 5;
		botaoBaixo = new BotaoBaixo("↓", tabuleiro, telaTabuleiro, this, jogador);
		pecas.add(botaoBaixo, posicao);

		posicao.gridy = 1;
		posicao.gridx = 6;
		botaoDireita = new BotaoDireita("→", tabuleiro, telaTabuleiro, this, jogador);
		pecas.add(botaoDireita, posicao);

		posicao.gridy = 1;
		posicao.gridx = 4;
		botaoEsquerda = new BotaoEsquerda("←", tabuleiro, telaTabuleiro, this, jogador);
		pecas.add(botaoEsquerda, posicao);
	}

	public void atualizaJogadas(Integer numero) {
		jogadasLabel.setText(String.format("Jogadas: %d", numero));
	}

	public void finalizaJogadas(Integer numero) {
		jogadasLabel.setText(String.format("Venceu o jogo com %d jogadas!!", numero));
	}

	public void verificaFimJogo(Tabuleiro tabuleiro) {
		/*
		 * Aqui é onde vamos definir quando o usuário vence o jogo.
		 */
	}

	@Override
	public void alterouEstadoTabuleiro(Tabuleiro tabuleiro) {
		verificaFimJogo(tabuleiro);
	};

	@Override
	public void keyPressed(KeyEvent event) {
		Map<Integer, Runnable> mapa = new HashMap<Integer, Runnable>();

		mapa.put(KeyEvent.VK_DOWN, new Runnable() {
			@Override
			public void run() {
				botaoBaixo.alteraEstadoTabuleiro();
			}
		});
		mapa.put(KeyEvent.VK_UP, new Runnable() {
			@Override
			public void run() {
				botaoCima.alteraEstadoTabuleiro();
			}
		});
		mapa.put(KeyEvent.VK_RIGHT, new Runnable() {
			@Override
			public void run() {
				botaoDireita.alteraEstadoTabuleiro();
			}
		});
		mapa.put(KeyEvent.VK_LEFT, new Runnable() {
			@Override
			public void run() {
				botaoEsquerda.alteraEstadoTabuleiro();
			}
		});
		
		// TODO verificar se há tecla pressionada no hashmap
		mapa.get(event.getKeyCode()).run();
	}

	@Override
	public void keyReleased(KeyEvent event) {
	};

	@Override
	public void keyTyped(KeyEvent event) {
	}
}
