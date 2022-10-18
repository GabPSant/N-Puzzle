package puzzle.base;

import java.util.ArrayList; 
import java.util.Collections; 

public class BaseNumero implements Base{
	private int definir;
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public void setDefinir(int definir) {
		this.definir = definir;
	}
	public int getDefinir() {
		return this.definir;
	}// definir é o valor que define o  tamanho e quantidade de valores dentro da matriz
	
	public void Calculo() {
		
		for(int n = 0; n < (definir*definir); n++){// Cria o conjunto de números usados na Matriz
			if(n== (definir*definir)-1) {
				numeros.add(null);
			}
			else {
				numeros.add(n+1);
			}
		}
		Collections.shuffle(numeros);//Embaralha os numeros de forma aleátoria
	}
	public ArrayList<Integer> getNumeros(){
		return numeros;
	}
}