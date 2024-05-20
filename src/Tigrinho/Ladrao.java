package Tigrinho;

public class Ladrao extends Recompensa implements IAcaoPontuacao{
	
	public Ladrao() {
		super(4, "Ladrão");
	}


	@Override
	public void acaoPontuacao(Jogador jogadorBeneficiado) {
		int pontuacaoAtual = jogadorBeneficiado.getPontuacao();
		
		jogadorBeneficiado.setPontuacao(pontuacaoAtual - 20);
	}
	
}
