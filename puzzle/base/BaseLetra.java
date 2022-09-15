package puzzle.base;

import java.util.ArrayList; 
import java.util.Collections;

public class BaseLetra {
    private char limite;
    ArrayList <Character> letras = new ArrayList <Character>();
	
    public void setLimite(char limite) {
    	this.limite = limite;
    }
    public char getLimite() {
    	return this.limite;
    }
	public void Calculo(){
		for(char n = 'A'; n<limite; n++) {
			if(n==limite-1) {
				letras.add(null);
			}
			else {
				letras.add(n);
			}
		}
		Collections.shuffle(letras);
		System.out.println(letras);
	}
	public ArrayList<Character> getLetras(){
		return letras;
	}
}
