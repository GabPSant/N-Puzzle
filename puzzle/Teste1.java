package puzzle;

import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections; 


public class Teste1 {

	public static void main(String[] args) {
		
	    int x, y, n, m = 0;   
		
	    ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		int[][] pecas = new int[3][3];
		
		for(n = 0; n < 9; n++){ 
			   numeros.add(n); 
			  } 
		
		Collections.shuffle(numeros); 
			  
	       for(x = 0; x < 3; x++){
	           for(y = 0; y < 3; y++){
	        	   pecas[x][y] = numeros.get(m); 
	    	       m++; 	               

	    	       if(pecas[x][y] == 0){  
		                  pecas[x][y] =  x; 
	                	}
	                }
	                }
	            
		System.out.print(Arrays.deepToString(pecas));
	}


}
