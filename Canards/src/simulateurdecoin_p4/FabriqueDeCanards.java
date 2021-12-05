package simulateurdecoin_p4;

public class FabriqueDeCanards extends FabriqueDeCanardsAbstraite{
	public Colvert creerColvert() {
		return new Colvert();
	}

	public Mandarin creerMandarin() {
		return new Mandarin();
	}
}
