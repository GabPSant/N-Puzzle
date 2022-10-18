package ui.frame.tela.jogo;

import puzzle.nivel.NivelLetra;
import puzzle.deslocamento.DeslocamentoLetra;
import puzzle.erros.ErroForaLimite;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.GridLayout;


public class TelaLetra extends JFrame implements MouseListener{
	static TelaLetra sistema = new TelaLetra();
	NivelLetra teste = new NivelLetra();
	JFrame jogo = new JFrame();
	JPanel matriz = new JPanel();
	JButton[] mov = new JButton[4];
	JButton[] botoes;
	GridLayout começo;
	Action Subir;
	Action Esquerda;
	Action Direita;
	Action Descer;
	
	JButton dica;
	ImageIcon resultado;
	ImageIcon logo;
	
	public NivelLetra getTeste() {
		return teste;
	}
	
	public void Teste() {
		// Metodos para alterar o tabuleiro
		//teste.deslocamento().getTabuleiro().setLimite('Z');
		teste.deslocamento().getTabuleiro().Calculo();
		//teste.deslocamento().setDefinir(5);
		this.começo = new GridLayout(teste.deslocamento().getDefinir(),teste.deslocamento().getDefinir());
		matriz.setLayout(começo);
		Subir = new Subir();
		Esquerda = new Esquerda();
		Direita = new Direita();
		Descer = new Descer();
		
		this.botoes = new JButton[(int)Math.pow(teste.deslocamento().getTabuleiro().getLimite(), 2)];
		
		jogo.setSize(950, 750);
		jogo.getContentPane().setBackground(new Color(51,153,255));
		
		matriz.setBounds(260, 50, 370, 370);
		matriz.setBackground(new Color(51,153,255));
		mov[0] = new JButton("^");
	    mov[1] = new JButton("<");
		mov[2] = new JButton(">");
		mov[3] = new JButton("\\/");
		
		mov[0].setBounds(750, 450, 50, 50);
		mov[1].setBounds(680, 515, 50, 50);
		mov[2].setBounds(820, 515, 50, 50);
		mov[3].setBounds(750, 580, 50, 50);
		for(int i = 0; i<4; i++) {
			mov[i].setFont(new Font("Times New Roman",Font.BOLD,15));
		}
		jogo.add(mov[0]);
		jogo.add(mov[1]);
		jogo.add(mov[2]);
		jogo.add(mov[3]);
		
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getDefinir(), 2); i++) {
			if(teste.deslocamento().getTabuleiro().getLetras().get(i) == null) {
				matriz.add(botoes[i] = new JButton(""));
			}
			else {
				matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getLetras().get(i))));
			}
			botoes[i].setBackground(new Color(0,0,0));
			botoes[i].setForeground(new Color(255,153,0));
			
			}
			
			//dica
			logo = new ImageIcon(getClass().getResource("lampada001.jpg"));	
			resultado = new ImageIcon(getClass().getResource("puzzleletras.png"));	
			
			dica = new JButton();
			dica.setBounds(720, 90, 100, 100);
			dica.setIcon(logo);
			dica.setOpaque(true);
			dica.addMouseListener(this);
			
			jogo.add(matriz);
			jogo.setLayout(null);
			jogo.setVisible(true);
			jogo.add(dica);
			jogo.setDefaultCloseOperation(EXIT_ON_CLOSE); 
			jogo.setLocationRelativeTo(null); 
			matriz.getInputMap().put(KeyStroke.getKeyStroke("W"), "Subir");
			matriz.getActionMap().put("Subir", Subir);
			matriz.getInputMap().put(KeyStroke.getKeyStroke("A"), "Esquerda");
			matriz.getActionMap().put("Esquerda", Esquerda);
			matriz.getInputMap().put(KeyStroke.getKeyStroke("D"), "Direita");
			matriz.getActionMap().put("Direita", Direita);
			matriz.getInputMap().put(KeyStroke.getKeyStroke("S"), "Descer");
			matriz.getActionMap().put("Descer", Descer);
	}
	public class Subir extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			try {
				teste.deslocamento().mudanças('w');
			} catch (ErroForaLimite e1) {
				System.out.println("Esta fora do limite");
			}
			matriz.removeAll();
			//matriz.repaint();
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getLetras().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getLetras().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
		}
	}
	public class Esquerda extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			try {
				teste.deslocamento().mudanças('a');
			} catch (ErroForaLimite e1) {
				System.out.println("Esta fora do limite");
			}
			matriz.removeAll();
			//matriz.repaint();
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getLetras().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getLetras().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
	}
}
	public class Direita extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			try {
				teste.deslocamento().mudanças('d');
			} catch (ErroForaLimite e1) {
				System.out.println("Esta fora do limite");
			}
			matriz.removeAll();
			//matriz.repaint();
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getLetras().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getLetras().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
	}
}
	public class Descer extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			try {
				teste.deslocamento().mudanças('s');
			} catch (ErroForaLimite e1) {
				System.out.println("Esta fora do limite");
			}
			matriz.removeAll();
			//matriz.repaint();
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getLetras().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getLetras().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
	}	
}
	public static void main(String[] args) {
		TelaLetra teste = new TelaLetra();
		teste.Teste();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		dica.setBounds(630, 20, 300, 300);
		dica.setIcon(resultado);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		dica.setBounds(720, 90, 100, 100);
		dica.setIcon(logo);

		
	}

}
