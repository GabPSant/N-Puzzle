package puzzle;
import java.util.*;

public class Matriz {

    private int pecas[][] = new Array [2][2];

    public int Tabela(int x, int y){
        Random gerador = new Random();
        for(x = 0; x<2; x++){
            for(y=0; y<2; y++){
                pecas[x][y] = gerador.nextInt(9);
                if(pecas[x][y]==0){pecas[x][y] = null;}
            }
            System.out.println(pecas[x][y]);
        }
        return x;
    }
    public static void main(String[] args){
        Matriz estudo = new Matriz();
        estudo.Tabela(0,0);
    }
}
