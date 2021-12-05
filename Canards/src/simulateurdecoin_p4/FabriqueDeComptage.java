package simulateurdecoin_p4;

public class FabriqueDeComptage extends FabriqueDeCanardsAbstraite {
	public Cancaneur creerColvert() {
		return new CompteurDeCouacs(new Colvert());
	}
	
	public Cancaneur creerMandarin() {
		return new CompteurDeCouacs(new Mandarin());
	}
}
