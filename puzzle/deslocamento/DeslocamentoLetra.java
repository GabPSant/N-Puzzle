package puzzle.deslocamento;

import java.util.Collections;
import java.util.Scanner;
import puzzle.base.BaseLetra;

public class DeslocamentoLetra {
	Scanner console = new Scanner(System.in);
	BaseLetra alfabeto = new BaseLetra();
	private int definir;
	private String mover;
	private int observador;
	private int giro;
	private boolean maluco;
	
	public BaseLetra getTabuleiro() {
		return this.alfabeto;
	}
	public void setDefinir(int definir) {
    	this.definir = definir;
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
	public void movimento(boolean vitoria) {
		while(!vitoria) {
			int posX = alfabeto.getLetras().indexOf(null);
			char tempP;
			int posP;
			mover = console.nextLine();
			if(mover.equalsIgnoreCase("W")) {
				posP = posX - definir;
				tempP = alfabeto.getLetras().get(posP);
				alfabeto.getLetras().set(posP, null);
				alfabeto.getLetras().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("A")) {
				posP = posX-1;
				tempP = alfabeto.getLetras().get(posP);
				alfabeto.getLetras().set(posP, null);
				alfabeto.getLetras().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("D")) {
				posP = posX +1;
				tempP = alfabeto.getLetras().get(posP);
				alfabeto.getLetras().set(posP, null);
				alfabeto.getLetras().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("S")) {
				posP = posX + definir;
				tempP = alfabeto.getLetras().get(posP);
				alfabeto.getLetras().set(posP, null);
				alfabeto.getLetras().set(posX, tempP);
			}
			if(mover.equalsIgnoreCase("W") || mover.equalsIgnoreCase("A") || mover.equalsIgnoreCase("D")|| mover.equalsIgnoreCase("S")) {
				observador ++;
				System.out.println("Nº de Movimentos: " + observador);
			}
			if(maluco) { // Ainda precisa melhorar para ficar menos estaticos;
				if(observador == giro) {
					Collections.shuffle(alfabeto.getLetras());
					}
			}
			System.out.println(alfabeto.getLetras());
		}
	}
}
