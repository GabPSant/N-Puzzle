package puzzle.deslocamento;

import java.util.Scanner;
import puzzle.base.BaseNumero;

public class DeslocamentoNumero {
	Scanner console = new Scanner(System.in);
	BaseNumero numero = new BaseNumero();
	private String mover;// Vai receber o input do usuário;
	private int observador;
	
	public BaseNumero getTabuleiro() {
		return this.numero;
	}
	public void movimento() {
		int posX = numero.getNumeros().indexOf(null);
		int tempP;
		int posP;
		mover = console.nextLine();
		if(mover.equalsIgnoreCase("w")) {
			posP = posX - numero.getDefinir();
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
			System.out.println(numero.getNumeros());
		}
		else if(mover.equalsIgnoreCase("A")) {
			posP = posX - 1;
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
			System.out.println(numero.getNumeros());
		}
		else if(mover.equalsIgnoreCase("D")) {
			posP = posX + 1;
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
			System.out.println(numero.getNumeros());
		}
		else if(mover.equalsIgnoreCase("S")) {
			posP = posX + numero.getDefinir();
			tempP = numero.getNumeros().get(posP);
			numero.getNumeros().set(posP, null);
			numero.getNumeros().set(posX, tempP);
			System.out.println(numero.getNumeros());
		}
	}
}
