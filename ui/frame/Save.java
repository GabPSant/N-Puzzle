package ui.frame;

import java.io.*;
import java.util.ArrayList;

public class Save {

	File save = new File("D:\\N-Puzzle\\puzzle\\src");
	int jogadas;
	String jogador;
	ArrayList<Character> lista = new ArrayList<Character>();
	
	/*public Save(int jogadas, ArrayList<Character> lista, String jogador) {
		this.jogadas = jogadas;
		this.jogador = jogador;
		this.lista = lista;
	}*/
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
	public void setJogadas(int jogadas) {
		this.jogadas = jogadas;
	}
	public void setLista(ArrayList lista) {
		this.lista = lista;
	}
	public void salvarJogo() throws IOException {
		FileWriter escrever = new FileWriter("D:\\N-Puzzle\\puzzle\\src");
		
		escrever.write("Nº de jogadas: " + this.jogadas + "\n" + "Jogador" + this.jogador);
		for(int i=0;i<lista.size();i++) {
			escrever.write(lista.get(i) + "\n");
		}
		escrever.close();
	}
}
