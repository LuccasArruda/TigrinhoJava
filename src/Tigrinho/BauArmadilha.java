package Tigrinho;

public class BauArmadilha extends Recompensa implements IAcaoRodada, IAcaoPontuacao{
	
	public BauArmadilha() {
		super(3, "Bau com armadilha");
	}

	
	@Override
	public void acaoRodada(Partida tabuleiro) {
		
		
	}


	@Override
	public void acaoPontuacao(Jogador jogadorBeneficiado) {
		int pontuacaoAtual = jogadorBeneficiado.getPontuacao();
		
		jogadorBeneficiado.setPontuacao(pontuacaoAtual * 2);
	}
	
}
