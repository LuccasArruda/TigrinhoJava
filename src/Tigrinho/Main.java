package Tigrinho;

public class Main {
	public static void main(String[] args) {
		Tigrinho.Partida p1 = new Partida("Railso");
		p1.randomizaTabuleiroEspelho();
		p1.mostraTabuleiroEspelho();
		
		Partida p2 = new Partida("Teste");
		p2.randomizaTabuleiroEspelho();
		p2.mostraTabuleiroEspelho();
	}

}
