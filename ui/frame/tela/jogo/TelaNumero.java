package ui.frame.tela.jogo;
import puzzle.nivel.NivelNumero;
import puzzle.deslocamento.DeslocamentoNumero;
import puzzle.erros.ErroForaLimite;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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


public class TelaNumero extends JFrame implements MouseListener{
	static TelaNumero sistema = new TelaNumero();
	private int posB1;
	private int posB2;
	private int tempB2;
	private boolean conquista;
	NivelNumero teste = new NivelNumero();
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
	
	public NivelNumero getTeste() {
		return teste;
	}
	public void setConquista(boolean conquista) {
		this.conquista = conquista;
	}
	public void Teste() {
		// Metodos para alterar o tabuleiro
		teste.deslocamento().getTabuleiro().Calculo();
		this.começo = new GridLayout(teste.deslocamento().getTabuleiro().getDefinir(),teste.deslocamento().getTabuleiro().getDefinir());
		matriz.setLayout(começo);
		Subir = new Subir();
		Esquerda = new Esquerda();
		Direita = new Direita();
		Descer = new Descer();
		
		this.botoes = new JButton[(int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2)];
		
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
		
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
			if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
				matriz.add(botoes[i] = new JButton(""));
			}
			else {
				matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
			}
			botoes[i].setBackground(new Color(0,0,0));
			botoes[i].setForeground(new Color(255,153,0));
			
			}
			
			//dica
			logo = new ImageIcon(getClass().getResource("lampada001.jpg"));	
			resultado = new ImageIcon(getClass().getResource("puzzle3x3.jpg"));	
			
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
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
			/*if(conquista) {
				
			}*/
			
			if(teste.deslocamento().getTabuleiro().getDefinir() == 3) {
				if(teste.deslocamento().Facil()) {
					JOptionPane.showMessageDialog(null,
					        "Seu emprenho foi recompensado!!!\n\n", //mensagem
					        "PARABÉNS, VOCÊ VENCEU", // titulo da janela 
					        JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(teste.deslocamento().getTabuleiro().getDefinir() == 4){
				if(teste.deslocamento().Medio()) {
					JOptionPane.showMessageDialog(null,
					        "Seu emprenho foi recompensado!!!\n\n", //mensagem
					        "PARABÉNS, VOCÊ VENCEU", // titulo da janela 
					        JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(teste.deslocamento().getTabuleiro().getDefinir() == 5) {
				if(teste.deslocamento().Dificil()) {
					JOptionPane.showMessageDialog(null,
					        "Seu emprenho foi recompensado!!!\n\n", //mensagem
					        "PARABÉNS, VOCÊ VENCEU", // titulo da janela 
					        JOptionPane.INFORMATION_MESSAGE);
				}
			}
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
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
			/*if(conquista) {
			
			}*/
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
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
			/*if(conquista) {
			
			}*/
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
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
			/*if(conquista) {
			
			}*/
	}	
}
	public static void main(String[] args) {
		TelaNumero teste = new TelaNumero();
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