package puzzle.deslocamento;

import java.util.Scanner;
import puzzle.base.BaseLetra;
import java.util.Collections;
import ui.frame.tela.jogo.TelaJogo;

public class DeslocamentoL{
	static DeslocamentoL controle = new DeslocamentoL();
	Scanner console = new Scanner(System.in);
	BaseLetra letra = new BaseLetra();
	TelaJogo comandos = new TelaJogo();
	private String mover;// Vai receber o input do usuário;
	private int observador;
	private int giro;
	private char usado;
	private boolean maluco;
	
	private int definir;

	private boolean[] vitoria = new boolean[3];
	
	public boolean Facil() {
		vitoria[0] = letra.getLetras().get(0) == 'A' && letra.getLetras().get(1) == 'B'
				   && letra.getLetras().get(2) == 'C' && letra.getLetras().get(3) == 'D'
				   && letra.getLetras().get(4) == 'E' && letra.getLetras().get(5) == 'F'
				   && letra.getLetras().get(6) == 'G' && letra.getLetras().get(7) == 'H'
				   && letra.getLetras().get(8) == null;
		return vitoria[0];
		}
	public boolean Medio() {
		vitoria[1] = letra.getLetras().get(0) == 'A' && letra.getLetras().get(1) == 'B'
				   && letra.getLetras().get(2) == 'C' && letra.getLetras().get(3) == 'D'
				   && letra.getLetras().get(4) == 'E' && letra.getLetras().get(5) == 'F'
				   && letra.getLetras().get(6) == 'G' && letra.getLetras().get(7) == 'H'
				   && letra.getLetras().get(8) == 'I' && letra.getLetras().get(9) == 'J'
				   && letra.getLetras().get(10) == 'K' && letra.getLetras().get(11) == 'L'
				   && letra.getLetras().get(12) == 'M' && letra.getLetras().get(13) == 'N'
				   && letra.getLetras().get(14) == 'O' && letra.getLetras().get(15) == null;
		return vitoria[1];
		}
	public boolean Dificil() {
		vitoria[2] = letra.getLetras().get(0) == 'A' && letra.getLetras().get(1) == 'B'
				   && letra.getLetras().get(2) == 'C' && letra.getLetras().get(3) == 'D'
				   && letra.getLetras().get(4) == 'E' && letra.getLetras().get(5) == 'F'
				   && letra.getLetras().get(6) == 'G' && letra.getLetras().get(7) == 'H'
				   && letra.getLetras().get(8) == 'I' && letra.getLetras().get(9) == 'J'
				   && letra.getLetras().get(10) == 'K' && letra.getLetras().get(11) == 'L'
				   && letra.getLetras().get(12) == 'M' && letra.getLetras().get(13) == 'N'
				   && letra.getLetras().get(14) == 'O' && letra.getLetras().get(15) == 'P'
				   && letra.getLetras().get(16) == 'Q' && letra.getLetras().get(17) == 'R'
				   && letra.getLetras().get(18) == 'S' && letra.getLetras().get(19) == 'T'
				   && letra.getLetras().get(20) == 'U' && letra.getLetras().get(21) == 'V'
				   && letra.getLetras().get(22) == 'W' && letra.getLetras().get(23) == 'X'
				   && letra.getLetras().get(24) == null;
		return vitoria[2];
		}
	
	public void setDefinir(int definir) {
    	this.definir = definir;
    }
	
	public int getDefinir() {
    	return definir;
    }
	
	public void setMover(String mover) {
		this.mover = mover;
	}
	public String getMover() {
		return mover;
	}
	public void setUsado(char usado) {
		this.usado = usado;
	}
	public char getUsado() {
		return usado;
	}
	public BaseLetra getTabuleiro() {
		return this.letra;
	}
	public void setMaluco(boolean maluco) {
		this.maluco = maluco;
	}
	public boolean getMaluco() {
		return maluco;
	}
	public void setGiro(int giro) {
		this.giro = giro;
	}
	public void mudanças(char usado) {
		int posX = letra.getLetras().indexOf(null); // procura a possição atual do valor null
		int tempP;// usado como armazenador temporario do valor posição adjacente
		int posP;// representa a posição do valor ao qual vai trocar com null
		if(usado == 'w') {
			posP = posX - definir;
			tempP = letra.getLetras().get(posP);
			letra.getLetras().set(posP, null);
			letra.getLetras().set(posX, (char) tempP);
		}
		else if(usado == 'a') {
			posP = posX - 1;
			tempP = letra.getLetras().get(posP);
			letra.getLetras().set(posP, null);
			letra.getLetras().set(posX, (char) tempP);
		}
		else if(usado == 'd') {
			posP = posX + 1;
			tempP = letra.getLetras().get(posP);
			letra.getLetras().set(posP, null);
			letra.getLetras().set(posX, (char) tempP);
		}
		else if(usado == 's') {
			posP = posX + definir;
			tempP = letra.getLetras().get(posP);
			letra.getLetras().set(posP, null);
			letra.getLetras().set(posX, (char) tempP);
		}
		if(usado == 'w' || usado == 'a' || usado == 'd' || usado == 's') {
			observador ++;
			System.out.println("Nº de Movimentos: " + observador);
		}
		if(maluco) {
			if(observador%giro == 0) {// Ainda precisa melhorar para ficar menos estaticos;
				Collections.shuffle(letra.getLetras());
				}
		}
		System.out.println(letra.getLetras());
	}
	
}
