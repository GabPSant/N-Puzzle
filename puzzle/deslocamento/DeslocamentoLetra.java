package puzzle.deslocamento;

import java.util.Scanner;
import puzzle.base.BaseLetra;

public class DeslocamentoLetra {
	Scanner console = new Scanner(System.in);
	BaseLetra alfabeto = new BaseLetra();
	private String mover;
	private int observador;
	
	public BaseLetra getTabuleiro() {
		return this.alfabeto;
	}
	public void movimento() {
		int posX = alfabeto.getLetras().indexOf(null);
		char tempP;
		int posP;
		mover = console.nextLine();
		if(mover.equalsIgnoreCase("W")) {
			posP = posX - alfabeto.getLimite();
			tempP = alfabeto.getLetras().get(posP);
			alfabeto.getLetras().set(posP, null);
			alfabeto.getLetras().set(posX, tempP);
			System.out.println(alfabeto.getLetras());
		}
		else if(mover.equalsIgnoreCase("A")) {
			posP = posX-1;
			tempP = alfabeto.getLetras().get(posP);
			alfabeto.getLetras().set(posP, null);
			alfabeto.getLetras().set(posX, tempP);
			System.out.println(alfabeto.getLetras());
		}
		else if(mover.equalsIgnoreCase("D")) {
			posP = posX +1;
			tempP = alfabeto.getLetras().get(posP);
			alfabeto.getLetras().set(posP, null);
			alfabeto.getLetras().set(posX, tempP);
			System.out.println(alfabeto.getLetras());
		}
		else if(mover.equalsIgnoreCase("S")) {
			posP = posX + alfabeto.getLimite();
			tempP = alfabeto.getLetras().get(posP);
			alfabeto.getLetras().set(posP, null);
			alfabeto.getLetras().set(posX, tempP);
			System.out.println(alfabeto.getLetras());
		}
	}
}
