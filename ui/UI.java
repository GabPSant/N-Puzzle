package ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import puzzle.Nivel;
public class UI extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton botão[] = new JButton[9];
	Nivel valores = new Nivel(0);
	public void UITeste(){
		JFrame tela = new JFrame("teste");
		JPanel grade = new JPanel();
		tela.setSize(600,600);
		tela.setVisible(true);
		grade.setSize(300,300);
		grade.setBounds(50, 50, 300, 300);
		grade.setVisible(true);
		grade.setBackground(Color.blue);
		botão[0] = new JButton("1");
		botão[0].setBounds(50, 100, 40, 40);
		botão[1] = new JButton("2");
		botão[1].setBounds(100,100,40,40);
		botão[2] = new JButton("3");
		botão[2].setBounds(150,100,40,40);
		botão[3] = new JButton("4");
		botão[3].setBounds(50,150,40,40);
		botão[4] = new JButton("5");
		botão[4].setBounds(100,150,40,40);
		botão[5] = new JButton("6");
		botão[5].setBounds(150,150,40,40);
		botão[6] = new JButton("7");
		botão[6].setBounds(50,200,40,40);
		botão[7] = new JButton("8");
		botão[7].setBounds(100,200,40,40);
		botão[8] = new JButton("");
		botão[8].setBounds(150,200,40,40);
		grade.add(botão[0]);grade.add(botão[1]);grade.add(botão[2]);grade.add(botão[3]);
		grade.add(botão[4]);grade.add(botão[5]);grade.add(botão[6]);grade.add(botão[7]);
		tela.add(grade);
	}
	public static void main(String[] args) {
		UI teste = new UI();
		teste.UITeste();
	}
}
