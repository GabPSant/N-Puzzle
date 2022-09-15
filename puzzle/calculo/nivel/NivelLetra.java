package puzzle.calculo.nivel;
import puzzle.base.BaseLetra;
import puzzle.deslocamento.DeslocamentoLetra;

public class NivelLetra extends BaseLetra {
	
	static DeslocamentoLetra des = new DeslocamentoLetra();
	
	public void Dificuldade(String nivel) {
		switch (nivel) {
		case "Facil":
			des.getTabuleiro().setLimite('J');
			des.getTabuleiro().Calculo();
			break;
		case "Medio":
			des.getTabuleiro().setLimite('Q');
			des.getTabuleiro().Calculo();
			break;
		case "Dificil":
			des.getTabuleiro().setLimite('Z');
			des.getTabuleiro().Calculo();
			break;
		}
	}

	public static void main(String[] args) {
		NivelLetra teste = new NivelLetra();
		teste.Dificuldade("Facil");
		des.movimento();
	}

}
