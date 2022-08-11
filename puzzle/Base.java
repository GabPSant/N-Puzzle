package puzzle;

import java.util.Arrays;

import java.util.ArrayList; 
import java.util.Collections; 

public class Base {
	private int x;
    private int y;
	private int m;
	// definir é o valor que define o  tamanho e quantidade de valores dentro da matriz
	public String Calculo(int definir) {
		int pecas[][] = new int[definir][definir];
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		m = 0;
		for(int n = 0; n < (definir*definir); n++){// Cria o conjunto de números usados na Matriz
			numeros.add(n);
		}
		Collections.shuffle(numeros);//Embaralha os numeros de forma aleátoria
		//System.out.println(numeros);
	       for(x = 0; x < definir; x++){ // Defini cada espaço do array que forma a matriz
	           for(y = 0; y < definir; y++){
	               pecas[x][y] = numeros.get(m);
				   m++;
	            }
	        }
		System.out.print(Arrays.deepToString(pecas));
		return Arrays.deepToString(pecas);
	}
}
