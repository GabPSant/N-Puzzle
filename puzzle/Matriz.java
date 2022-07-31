package puzzle;
import java.util.*;

public class Matriz {
    
    private int pecas[][] = new Array [2][2];

    public void Tabela(int x, int y){
        Random gerador = new Random();
        for(x = 0; x<3; x++){
            for(y=0; y<3; y++){
                pecas[x][y] = gerador.nextInt(9);
                if(pecas[x][y]==0){pecas[x][y] = null;}
            }
            System.out.println(pecas[x][y]);
        }
    }
    public static void main(String[] args){
        Matriz processo = new Matriz();
        processo.Tabela(0, 0);
    }
}
