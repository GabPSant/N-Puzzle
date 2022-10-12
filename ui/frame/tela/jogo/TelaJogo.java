package ui.frame.tela.jogo;
import puzzle.nivel.NivelNumero;
import puzzle.deslocamento.DeslocamentoNumero;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.GridLayout;


public class TelaJogo {
	static TelaJogo sistema = new TelaJogo();
	NivelNumero teste = new NivelNumero();
	JFrame jogo = new JFrame();
	JPanel matriz = new JPanel();
	JButton[] mov = new JButton[4];
	
	public void Teste() {
		// Metodos para alterar o tabuleiro
		teste.deslocamento().getTabuleiro().setDefinir(3);
		teste.deslocamento().getTabuleiro().Calculo();
		GridLayout começo = new GridLayout(teste.deslocamento().getTabuleiro().getDefinir(),teste.deslocamento().getTabuleiro().getDefinir());
		matriz.setLayout(começo);
		/*
		matriz.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == 'w') {
					teste.deslocamento().setUsado('w');
				}
				if(e.getKeyChar() == 'a') {
					teste.deslocamento().setUsado('a');
				}
				if(e.getKeyChar() == 'd') {
					teste.deslocamento().setUsado('d');
				}
				if(e.getKeyChar() == 's') {
					teste.deslocamento().setUsado('s');
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}


			
		});
		*/
		JButton[] botoes = new JButton[(int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2)];
		
		jogo.setSize(950, 750);
		jogo.getContentPane().setBackground(new Color(51,153,255));
		
		matriz.setBounds(260, 50, 370, 370);
		matriz.setBackground(new Color(51,153,255));
		mov[0] = new JButton("^");
	    mov[1] = new JButton("<");
		mov[2] = new JButton(">");
		mov[3] = new JButton("/");
		
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
		
		
		jogo.add(matriz);
		jogo.setLayout(null);
		jogo.setVisible(true);
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
			if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
				matriz.add(botoes[i] = new JButton(""));
			}
			else {
				matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
			}
			/*if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == i+1) {
				botoes[i].setBackground(new Color(0,204,0));
				botoes[i].setForeground(new Color(255,153,0));
			}*/
			botoes[i].setBackground(new Color(0,0,0));
			botoes[i].setForeground(new Color(255,153,0));
			}
			jogo.addKeyListener(new KeyListener() {
				public void keyTyped(KeyEvent e) {
					
				}

				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == 'w') {
						teste.deslocamento().setUsado('w');
					}
					if(e.getKeyChar() == 'a') {
						teste.deslocamento().setUsado('a');
					}
					if(e.getKeyChar() == 'd') {
						teste.deslocamento().setUsado('d');
					}
					if(e.getKeyChar() == 's') {
						teste.deslocamento().setUsado('s');
					}
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}


				
			});
		/*
		mov[0].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				teste.deslocamento().setMover("W");
				teste.deslocamento().getMover();
		}
		});
		mov[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teste.deslocamento().setMover("A");
				teste.deslocamento().getMover();
			}
		});
		mov[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teste.deslocamento().setMover("D");
				teste.deslocamento().getMover();
			}
		});
		mov[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teste.deslocamento().setMover("S");
				teste.deslocamento().getMover();
			}
		});
		*/
		/*jogo.add(new JButton("1"));
		jogo.add(new JButton("2"));
		jogo.add(new JButton("3"));
		jogo.add(new JButton("4"));
		jogo.add(new JButton("5"));
		jogo.add(new JButton("6"));
		jogo.add(new JButton("7"));
		jogo.add(new JButton("8"));
		jogo.add(new JButton(""));
		teste.deslocamento().setMaluco(false);
		teste.deslocamento().setGiro(4);
		teste.deslocamento().movimento(teste.deslocamento().Facil());*/
	}
	public static void main(String[] args) {
		TelaJogo teste = new TelaJogo();
		teste.Teste();
	}
}
