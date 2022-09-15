package puzzle.calculo.nivel;
import puzzle.deslocamento.DeslocamentoNumero;

public class NivelNumero extends DeslocamentoNumero{
	
	static DeslocamentoNumero des = new DeslocamentoNumero();
	
	public void Dificuldade(String nivel) {
		
		switch(nivel) {
		case "Facil":
			des.getTabuleiro().setDefinir(3);
			des.getTabuleiro().Calculo();
			break;
		case "Medio":
			des.getTabuleiro().setDefinir(4);
			des.getTabuleiro().Calculo();
			break;
		case "Dificil":
			des.getTabuleiro().setDefinir(5);
			des.getTabuleiro().Calculo();
			break;
		}
	}
	public static void main(String[] args) {
		NivelNumero teste = new NivelNumero();
		
		teste.Dificuldade("Facil");
		System.out.println(des.getTabuleiro().getNumeros());
		des.movimento();
	}
}