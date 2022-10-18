package puzzle.nivel;
import puzzle.deslocamento.DeslocamentoNumero;

public class NivelNumero{
	
	static DeslocamentoNumero des = new DeslocamentoNumero();
	
	public DeslocamentoNumero deslocamento() {
		return des;
	}
	
	public void Dificuldade(String nivel) {
		des.setMaluco(false);
		if(des.getMaluco() || !des.getMaluco()) {
			switch(nivel) {
			case "Facil":
				des.getTabuleiro().setDefinir(3);
				des.getTabuleiro().Calculo();
				System.out.println(des.getTabuleiro().getNumeros());
				des.setGiro(4);// Coloca o limite caso o jogo esteja definido em maluco
				break;
			case "Medio":
				des.getTabuleiro().setDefinir(4);
				des.getTabuleiro().Calculo();
				System.out.println(des.getTabuleiro().getNumeros());
				des.setGiro(3);
				break;
			case "Dificil":
				des.getTabuleiro().setDefinir(5);
				des.getTabuleiro().Calculo();
				System.out.println(des.getTabuleiro().getNumeros());
				des.setGiro(2);
				break;
			}
		}
	}
	public static void main(String[] args) {
		NivelNumero teste = new NivelNumero();
		teste.Dificuldade("Facil");
	}
}