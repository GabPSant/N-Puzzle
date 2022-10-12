package testeTelaNumeros;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import puzzle.deslocamento.DeslocamentoNumero;

public class TelaNumeros extends JFrame{
	DeslocamentoNumero teste = new DeslocamentoNumero();
	private JLabel grafico;
	private JButton v1;
	
	public void criar() {
		teste.getTabuleiro().setDefinir(3);
		teste.getTabuleiro().Calculo();
		teste.getTabuleiro().getNumeros().get(0);
		teste.getTabuleiro().getNumeros().get(1).toString();
		/*
		 * for(int i = 0; i<9; i++){
		 * jogo.add(new JButton(teste.getTabuleiro().getNumeros().get(i));
		 *
		 * }
		 */

	grafico = new JLabel();
	v1 = new JButton();

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
	
	public TelaNumeros() {
		criar();
	}

	public static void main(String[] args) {
		new TelaNumeros();
	}


}
