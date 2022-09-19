package puzzle.nivel;
import puzzle.deslocamento.DeslocamentoNumero;

public class NivelNumero extends DeslocamentoNumero{
	
	static DeslocamentoNumero des = new DeslocamentoNumero();
	
	public void Dificuldade(String nivel) {
		if(des.getMaluco() || !des.getMaluco()) {
			switch(nivel) {
			case "Facil":
				des.getTabuleiro().setDefinir(3);
				des.getTabuleiro().Calculo();
				des.setGiro(4);// Coloca o limite caso o jogo esteja definido em maluco
				break;
			case "Medio":
				des.getTabuleiro().setDefinir(4);
				des.getTabuleiro().Calculo();
				des.setGiro(3);
				break;
			case "Dificil":
				des.getTabuleiro().setDefinir(5);
				des.getTabuleiro().Calculo();
				des.setGiro(2);
				break;
			}
		}
	}
	public static void main(String[] args) {
		NivelNumero teste = new NivelNumero();
		des.setMaluco(true);
		teste.Dificuldade("Facil");
		System.out.println(des.getTabuleiro().getNumeros());
		des.movimento(false);
	}
}