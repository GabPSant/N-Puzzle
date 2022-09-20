package ui.frame.tela.jogo;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants; 

import java.awt.Color;
import java.awt.Font;

public class TelaRegiao {
	private JLabel regiaotela;
	
	public TelaRegiao(Integer numero) {
		this.regiaotela = new JLabel(numero.toString());
		this.regiaotela.setForeground(Color.RED);
		this.regiaotela.setHorizontalAlignment(SwingConstants.CENTER);
		this.regiaotela.setFont(new Font("Times New Roman", Font.ITALIC, 72));
		this.regiaotela.setBackground(Color.WHITE);
		this.regiaotela.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.regiaotela.setVisible(true);
	}
	public JLabel getRegiaoTela() {
		return regiaotela;
	}
	public void setRegiaoTela(Integer numero) {
		this.regiaotela.setText(numero.toString());
	}
}
