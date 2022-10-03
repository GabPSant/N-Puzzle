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
	private boolean[] vitoria = new boolean[3];
	
	public void setVitoria() {
		vitoria[0] = numero.getNumeros().get(0) == numero.getNumeros().indexOf(1) && numero.getNumeros().get(1) == numero.getNumeros().indexOf(2)
				   && numero.getNumeros().get(2) == numero.getNumeros().indexOf(3) && numero.getNumeros().get(3) == numero.getNumeros().indexOf(4)
				   && numero.getNumeros().get(4) == numero.getNumeros().indexOf(5) && numero.getNumeros().get(5) == numero.getNumeros().indexOf(6)
				   && numero.getNumeros().get(6) == numero.getNumeros().indexOf(7) && numero.getNumeros().get(7) == numero.getNumeros().indexOf(8) 
				   && numero.getNumeros().get(8) == numero.getNumeros().indexOf(null);
		
		vitoria[1] = numero.getNumeros().get(0) == numero.getNumeros().indexOf(1) && numero.getNumeros().get(1) == numero.getNumeros().indexOf(2)
				   && numero.getNumeros().get(2) == numero.getNumeros().indexOf(3) && numero.getNumeros().get(3) == numero.getNumeros().indexOf(4)
				   && numero.getNumeros().get(4) == numero.getNumeros().indexOf(5) && numero.getNumeros().get(5) == numero.getNumeros().indexOf(6)
				   && numero.getNumeros().get(6) == numero.getNumeros().indexOf(7) && numero.getNumeros().get(7) == numero.getNumeros().indexOf(8)
				   && numero.getNumeros().get(8) == numero.getNumeros().indexOf(9) && numero.getNumeros().get(9) == numero.getNumeros().indexOf(10)
				   && numero.getNumeros().get(10) == numero.getNumeros().indexOf(11) && numero.getNumeros().get(11) == numero.getNumeros().indexOf(12)
				   && numero.getNumeros().get(12) == numero.getNumeros().indexOf(13) && numero.getNumeros().get(13) == numero.getNumeros().indexOf(14)
				   && numero.getNumeros().get(14) == numero.getNumeros().indexOf(null);
		
		vitoria[2] = numero.getNumeros().get(0) == numero.getNumeros().indexOf(1) && numero.getNumeros().get(1) == numero.getNumeros().indexOf(2)
				   && numero.getNumeros().get(2) == numero.getNumeros().indexOf(3) && numero.getNumeros().get(3) == numero.getNumeros().indexOf(4)
				   && numero.getNumeros().get(4) == numero.getNumeros().indexOf(5) && numero.getNumeros().get(5) == numero.getNumeros().indexOf(6)
				   && numero.getNumeros().get(6) == numero.getNumeros().indexOf(7) && numero.getNumeros().get(7) == numero.getNumeros().indexOf(8)
				   && numero.getNumeros().get(8) == numero.getNumeros().indexOf(9) && numero.getNumeros().get(9) == numero.getNumeros().indexOf(10)
				   && numero.getNumeros().get(10) == numero.getNumeros().indexOf(11) && numero.getNumeros().get(11) == numero.getNumeros().indexOf(12)
				   && numero.getNumeros().get(12) == numero.getNumeros().indexOf(13) && numero.getNumeros().get(13) == numero.getNumeros().indexOf(14)
				   && numero.getNumeros().get(14) == numero.getNumeros().indexOf(15) && numero.getNumeros().get(15) == numero.getNumeros().indexOf(16)
				   && numero.getNumeros().get(16) == numero.getNumeros().indexOf(17) && numero.getNumeros().get(17) == numero.getNumeros().indexOf(18)
				   && numero.getNumeros().get(18) == numero.getNumeros().indexOf(19) && numero.getNumeros().get(19) == numero.getNumeros().indexOf(20)
				   && numero.getNumeros().get(20) == numero.getNumeros().indexOf(21) && numero.getNumeros().get(21) == numero.getNumeros().indexOf(22)
				   && numero.getNumeros().get(22) == numero.getNumeros().indexOf(23) && numero.getNumeros().get(23) == numero.getNumeros().indexOf(24)
				   && numero.getNumeros().get(24) == numero.getNumeros().indexOf(null);
		
	}
	
	public boolean Facil() {return vitoria[0];}
	public boolean Medio() {return vitoria[1];}
	public boolean Dificil() {return vitoria[2];}
	
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
	public void movimento(boolean objetivo) {
		while(!objetivo) {
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
