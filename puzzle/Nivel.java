package puzzle;

public class Nivel extends Base{
	
	public void Dificuldade(String nivel) {
		
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
		//testando
		teste.Dificuldade("Facil");
	}
}