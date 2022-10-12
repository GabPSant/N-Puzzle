package puzzle.deslocamento;

import java.util.Scanner;
import puzzle.base.BaseNumero;
import java.util.Collections;
import ui.frame.tela.jogo.TelaJogo;

public class DeslocamentoNumero{
	static DeslocamentoNumero controle = new DeslocamentoNumero();
	Scanner console = new Scanner(System.in);
	BaseNumero numero = new BaseNumero();
	TelaJogo comandos = new TelaJogo();
	private String mover;// Vai receber o input do usuário;
	private int observador;
	private int giro;
	private char usado;
	private boolean maluco;
	private boolean[] vitoria = new boolean[3];
	
	public boolean Facil() {
		vitoria[0] = numero.getNumeros().get(0) == 1 && numero.getNumeros().get(1) == 2
				   && numero.getNumeros().get(2) == 3 && numero.getNumeros().get(3) == 4
				   && numero.getNumeros().get(4) == 5 && numero.getNumeros().get(5) == 6
				   && numero.getNumeros().get(6) == 7 && numero.getNumeros().get(7) == 8
				   && numero.getNumeros().get(8) == null;
		return vitoria[0];
		}
	public boolean Medio() {
		vitoria[1] = numero.getNumeros().get(0) == 1 && numero.getNumeros().get(1) == 2
				   && numero.getNumeros().get(2) == 3 && numero.getNumeros().get(3) == 4
				   && numero.getNumeros().get(4) == 5 && numero.getNumeros().get(5) == 6
				   && numero.getNumeros().get(6) == 7 && numero.getNumeros().get(7) == 8
				   && numero.getNumeros().get(8) == 9 && numero.getNumeros().get(9) == 10
				   && numero.getNumeros().get(10) == 11 && numero.getNumeros().get(11) == 12
				   && numero.getNumeros().get(12) == 13 && numero.getNumeros().get(13) == 14
				   && numero.getNumeros().get(14) == 15 && numero.getNumeros().get(15) == null;
		return vitoria[1];
		}
	public boolean Dificil() {
		vitoria[2] = numero.getNumeros().get(0) == 1 && numero.getNumeros().get(1) == 2
				   && numero.getNumeros().get(2) == 3 && numero.getNumeros().get(3) == 4
				   && numero.getNumeros().get(4) == 5 && numero.getNumeros().get(5) == 6
				   && numero.getNumeros().get(6) == 7 && numero.getNumeros().get(7) == 8
				   && numero.getNumeros().get(8) == 9 && numero.getNumeros().get(9) == 10
				   && numero.getNumeros().get(10) == 11 && numero.getNumeros().get(11) == 12
				   && numero.getNumeros().get(12) == 13 && numero.getNumeros().get(13) == 14
				   && numero.getNumeros().get(14) == 15 && numero.getNumeros().get(15) == 16
				   && numero.getNumeros().get(16) == 17 && numero.getNumeros().get(17) == 18
				   && numero.getNumeros().get(18) == 19 && numero.getNumeros().get(19) == 20
				   && numero.getNumeros().get(20) == 21 && numero.getNumeros().get(21) == 22
				   && numero.getNumeros().get(22) == 23 && numero.getNumeros().get(23) == 24
				   && numero.getNumeros().get(24) == null;
		return vitoria[2];
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
	public BaseNumero getTabuleiro() {
		return this.numero;
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
		int posX = numero.getNumeros().indexOf(null); // procura a possição atual do valor null
		int tempP;// usado como armazenador temporario do valor posição adjacente
		int posP;// representa a posição do valor ao qual vai trocar com null
		if(usado == 'w' || usado == 'W') {
			posP = posX - numero.getDefinir();
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
		}
		else if(usado == 'a' || usado == 'A') {
			posP = posX - 1;
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
		}
		else if(usado == 'd' || usado == 'D') {
			posP = posX + 1;
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
		}
		else if(usado == 's' || usado == 'S') {
			posP = posX + numero.getDefinir();
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
		}
		if(usado == 'w' || usado == 'W' ||usado == 'a' || usado == 'A'|| usado == 'd' || usado == 'D' || usado == 's' || usado == 'S') {
			observador ++;
			System.out.println("Nº de Movimentos: " + observador);
		}
		if(maluco) {
			if(observador%giro == 0) {// Ainda precisa melhorar para ficar menos estaticos;
				Collections.shuffle(numero.getNumeros());
				}
		}
	}
	public void movimento(boolean objetivo) {
		System.out.println(numero.getNumeros());
		while(!objetivo) {
			controle.mudanças(controle.getUsado());
			/*
			int posX = numero.getNumeros().indexOf(null); // procura a possição atual do valor null
			int tempP;// usado como armazenador temporario do valor posição adjacente
			int posP;// representa a posição do valor ao qual vai trocar com null
			mover = console.nextLine();
			if(mover.equalsIgnoreCase("W") || controle.getMover() == "W") {
				posP = posX - numero.getDefinir();
				tempP = numero.getNumeros().get(posP);
				numero.getNumeros().set(posP, null);
				numero.getNumeros().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("A") || controle.getMover() == "A") {
				posP = posX - 1;
				tempP = numero.getNumeros().get(posP);
				numero.getNumeros().set(posP, null);
				numero.getNumeros().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("D") || controle.getMover() == "D") {
				posP = posX + 1;
				tempP = numero.getNumeros().get(posP);
				numero.getNumeros().set(posP, null);
				numero.getNumeros().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("S") || controle.getMover() == "S") {
				posP = posX + numero.getDefinir();
				tempP = numero.getNumeros().get(posP);
				numero.getNumeros().set(posP, null);
				numero.getNumeros().set(posX, tempP);
			}
			if(mover.equalsIgnoreCase("W") || mover.equalsIgnoreCase("A") || mover.equalsIgnoreCase("D")|| mover.equalsIgnoreCase("S")) {
				observador ++;
				System.out.println("Nº de Movimentos: " + observador);
			}
			if(maluco) {
				if(observador%giro == 0) {// Ainda precisa melhorar para ficar menos estaticos;
					Collections.shuffle(numero.getNumeros());
					}
			}
			*/
			System.out.println(numero.getNumeros());
			
		}
	}
}
