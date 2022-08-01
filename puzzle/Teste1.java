package puzzle;

import java.util.Arrays;
import java.util.Random;


public class Teste1 {

	public static void main(String[] args) {
		
		boolean iguais = false;
		 
		int[][] pecas = new int[3][3];
		
	    Random gerador = new Random();
	    int x, y;
	       for(x = 0; x<3; x++){
	           for(y=0; y<3; y++){
	               pecas[x][y] = gerador.nextInt(8) + 1;
	               if(pecas[x][y]==0){
	                 pecas[x][y] = 0;
	                	}
	               if (x != y) {
	                 if (pecas[x] == pecas[y]) {
	                		iguais = true;
	                	}
	                }
	                }
	            }
		System.out.print(Arrays.deepToString(pecas));
	}


}
