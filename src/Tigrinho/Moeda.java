package Tigrinho;

public class Moeda extends Recompensa implements IAcaoPontuacao {

	public Moeda() {
		super(1, "Moeda");
	}
	
	
	@Override
	public void acaoPontuacao(Jogador jogadorBeneficiado) {
		int pontuacaoAtual = jogadorBeneficiado.getPontuacao();
		
		jogadorBeneficiado.setPontuacao(pontuacaoAtual + 10);
		
	}
	
	
	
}
