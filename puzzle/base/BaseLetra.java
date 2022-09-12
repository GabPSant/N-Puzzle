package puzzle.base;

import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections;

public class BaseLetra {
    private int m = 0;
    private int definir;
    private char pecas[][];
    private char limite;
    ArrayList <Character> letras = new ArrayList <Character>();
	
    public void setModo(int definir) {
    	this.definir = definir;
    }
    public void setLimite(char limite) {
    	this.limite = limite;
    }
	public char[][] Calculo(){
		pecas = new char[definir][definir];
		for(char n = 'A'; n<limite; n++) {
			letras.add(n);
		}
		Collections.shuffle(letras);
		for(int x=0;x<definir;x++) {
			for(int y=0;y<definir;y++) {
				pecas[x][y] = letras.get(m);
				m++;
			}
		}
		System.out.println(Arrays.deepToString(pecas));
		return pecas;
	}
	public char porPecas(int x, int y) {
		return pecas[x][y];
	}
}
