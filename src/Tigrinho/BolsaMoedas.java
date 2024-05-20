package Tigrinho;

public class BolsaMoedas extends Recompensa implements IAcaoPontuacao{

	public BolsaMoedas() {
		super(2, "Bolsa de moedas");
	}
	
	
	@Override
	public void acaoPontuacao(Jogador jogadorBeneficiado) {
		int pontuacaoAtual = jogadorBeneficiado.getPontuacao();
		
		jogadorBeneficiado.setPontuacao(pontuacaoAtual + 50);
		
	}
	
	
}
