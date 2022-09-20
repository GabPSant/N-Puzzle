package puzzle.deslocamento;

import java.util.Scanner;
import puzzle.base.BaseNumero;
import java.util.Collections;

public class DeslocamentoNumero{
	Scanner console = new Scanner(System.in);
	BaseNumero numero = new BaseNumero();
	private String mover;// Vai receber o input do usuário;
	private int observador;
	private int giro;
	private boolean maluco;
	
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
	public void movimento(boolean vitoria) {
		while(!vitoria) {
			int posX = numero.getNumeros().indexOf(null); // procura a possição atual do valor null
			int tempP;// usado como armazenador temporario do valor posição adjacente
			int posP;// representa a posição do valor ao qual vai trocar com null
			mover = console.nextLine();
			if(mover.equalsIgnoreCase("W")) {
				posP = posX - numero.getDefinir();
				tempP = numero.getNumeros().get(posP);
				numero.getNumeros().set(posP, null);
				numero.getNumeros().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("A")) {
				posP = posX - 1;
				tempP = numero.getNumeros().get(posP);
				numero.getNumeros().set(posP, null);
				numero.getNumeros().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("D")) {
				posP = posX + 1;
				tempP = numero.getNumeros().get(posP);
				numero.getNumeros().set(posP, null);
				numero.getNumeros().set(posX, tempP);
			}
			else if(mover.equalsIgnoreCase("S")) {
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
			System.out.println(numero.getNumeros());
			
		}
	}
}
