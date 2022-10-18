package puzzle.deslocamento;
import puzzle.erros.ErroForaLimite;

import java.util.Scanner;
import puzzle.base.BaseNumero;
import java.util.Collections;
import ui.frame.tela.jogo.TelaNumero;

public class DeslocamentoNumero {
	static DeslocamentoNumero controle = new DeslocamentoNumero();
	Scanner console = new Scanner(System.in);
	BaseNumero numero = new BaseNumero();
	TelaNumero comandos = new TelaNumero();
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
	public int getObservador() {
		return observador;
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
	public void mudanças(char usado) throws ErroForaLimite{
		int posX = numero.getNumeros().indexOf(null); // procura a possição atual do valor null
		int tempP;// usado como armazenador temporario do valor posição adjacente
		int posP;// representa a posição do valor ao qual vai trocar com null
		if(usado == 'w') {
			posP = posX - numero.getDefinir();
			if(posP<0) {
				throw new ErroForaLimite();
			}
			else {
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
			}
		}
		else if(usado == 'a') {
			posP = posX - 1;
			if(posP<0 || posX%numero.getDefinir() == 0) {
				throw new ErroForaLimite();
			}
			else {
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
			}
		}
		else if(usado == 'd') {
			posP = posX + 1;
			if(posP>(int)Math.pow(numero.getDefinir(), 2) || posP%numero.getDefinir() == 0) {
				throw new ErroForaLimite();
			}
			else {
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
			}
		}
		else if(usado == 's') {
			posP = posX + numero.getDefinir();
			if(posP>(int)Math.pow(numero.getDefinir(), 2)) {
				throw new ErroForaLimite();
			}
			else {
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
			}
		}
		if(usado == 'w' || usado == 'a' || usado == 'd' || usado == 's') {
			observador ++;
			System.out.println("Nº de Movimentos: " + observador);
		}
		if(maluco) {
			if(observador%giro == 0) {// Ainda precisa melhorar para ficar menos estaticos;
				Collections.shuffle(numero.getNumeros());
				}
		}
		System.out.println(numero.getNumeros());
	}
}