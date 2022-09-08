package puzzle.calculo.nivel;

import puzzle.base.BaseNumero;

public class NivelNumero extends BaseNumero{
	public NivelNumero(int definir) {
		super(definir);
	}
	
	public void Dificuldade(String nivel) {
		BaseNumero escolha = new BaseNumero(0);
		switch(nivel) {
		case "Facil":
			escolha.SetModo(3);
			escolha.Calculo();
			break;
		case "Medio":
			escolha.SetModo(4);
			escolha.Calculo();
			break;
		case "Dificil":
			escolha.SetModo(5);
			escolha.Calculo();
			break;
		}
	}
	public static void main(String[] args) {
		NivelNumero teste = new NivelNumero(0);
		teste.Dificuldade("Dificil");
	}
}