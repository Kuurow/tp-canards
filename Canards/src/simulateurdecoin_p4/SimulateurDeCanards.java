package simulateurdecoin_p4;

public class SimulateurDeCanards {

	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeCanards();
		simulateur.simuler(fabriqueDeCanards);
	}

	void simuler(FabriqueDeCanardsAbstraite fabriqueDeComptage) {
		Cancaneur colvert  = new FabriqueDeComptage().creerColvert();
		Cancaneur mandarin = new FabriqueDeComptage().creerMandarin();
		simuler(colvert);
		simuler(mandarin);
	}
	void simuler(Cancaneur canard) {
		canard.cancaner();
	}
}
