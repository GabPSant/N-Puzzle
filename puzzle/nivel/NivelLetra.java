package puzzle.nivel;
import puzzle.base.BaseLetra;
import puzzle.deslocamento.DeslocamentoLetra;

public class NivelLetra extends BaseLetra {
	
	static DeslocamentoLetra des = new DeslocamentoLetra();
	
	public void Dificuldade(String nivel) {
		if(des.getMaluco() || !des.getMaluco()) {
			switch (nivel) {
			case "Facil":
				des.getTabuleiro().setLimite('J');
				des.getTabuleiro().Calculo();
				des.setDefinir(3);
				des.setGiro(4);
				break;
			case "Medio":
				des.getTabuleiro().setLimite('Q');
				des.getTabuleiro().Calculo();
				des.setDefinir(4);
				des.setGiro(3);
				break;
			case "Dificil":
				des.getTabuleiro().setLimite('Z');
				des.getTabuleiro().Calculo();
				des.setDefinir(5);
				des.setGiro(2);
				break;
			}
		}
	}

	public static void main(String[] args) {
		NivelLetra teste = new NivelLetra();
		teste.Dificuldade("Facil");
		des.setMaluco(true);
		System.out.println(des.getTabuleiro().getLetras());
		des.movimento(false);
	}

}
