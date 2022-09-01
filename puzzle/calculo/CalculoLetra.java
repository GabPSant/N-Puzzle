package puzzle.calculo;

import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections;

import puzzle.*;

public class CalculoLetra extends Base{

	private static Object caracteres;
	
	public CalculoLetra(int definir) {
	
		super(definir);
	}
	
	private int x;
    private int y;
	private int m = 0;
	private int definir;
	private int pecas[][];
	

	// definir é o valor que define o  tamanho e quantidade de valores dentro da matriz
	@SuppressWarnings("unchecked")
	public int[][] Calculo() {
		pecas = new int[definir][definir];
		ArrayList<Integer> caracteres = new ArrayList<Integer>();
		for(int n = 0; n < (definir*definir); n++){// Cria o conjunto de números usados na Matriz
			caracteres.add(n);
		}
		
		Collections.shuffle(caracteres);//Embaralha os numeros de forma aleátoria
		//System.out.println(numeros);
	       for(x = 0; x < definir; x++){ // Defini cada espaço do array que forma a matriz
	           for(y = 0; y < definir; y++){
	             //  pecas[x][y] = caracteres.get(m);
				 //  m++;

				   switch(((ArrayList<Integer>) CalculoLetra.caracteres).get(m)) {
				   case 0:
					    System.out.println(" ");
					    break;
				   case 1:
					    System.out.println("A ");
					    break;
					case 2:
					    System.out.println("B");
					    break;
					case 3:
					    System.out.println("C");
					    break;
					case 4:
					    System.out.println("D");
					    break;
					case 5:
					    System.out.println("E");
					    break;
					case 6:
					    System.out.println("F");
					    break;
					case 7:
					    System.out.println("G");
					    break;
					case 8:
					    System.out.println("H");
					    break;
					case 9:
					    System.out.println("I");
					    break;
					case 10:
					    System.out.println("J");
					    break;
					case 11:
					    System.out.println("K");
					    break;
					case 12:
					    System.out.println("L");
					    break;
					case 13:
					    System.out.println("M");
					    break;
					case 14:
					    System.out.println("N");
					    break;
					case 15:
					    System.out.println("O");
					    break;
					case 16:
					    System.out.println("P");
					    break;
					case 17:
					    System.out.println("Q");
					    break;
					case 18:
					    System.out.println("R");
					    break;
					case 19:
					    System.out.println("S");
					    break;
					case 20:
					    System.out.println("T");
					    break;
					case 21:
					    System.out.println("U");
					    break;
					case 22:
					    System.out.println("V");
					    break;
					case 23:
					    System.out.println("W");
					    break;
					case 24:
					    System.out.println("X");
					    break;
					
				   }
				   m++;
	            }
	           System.out.print("");
	        }
	       m = 0;

	       
			System.out.print(Arrays.deepToString(pecas));
			return pecas;
		}
		public int PorPeça(int x, int y) {
			return pecas[x][y];
		}

}
