package puzzle;

public class Nivel extends Base{
	private String nivel = "Dificil";
	public void Dificuldade() {
		if(nivel == "Facil") {
			Base calculo = new Base();
			calculo.Calculo(3);
		}
		else if(nivel == "Medio") {
			Base calculo = new Base();
			calculo.Calculo(4);
		}
		else if(nivel == "Dificil") {
			Base calculo = new Base();
			calculo.Calculo(5);
		}
	}
	public static void main(String[] args) {
		Nivel teste = new Nivel();
		teste.Dificuldade();
	}
}