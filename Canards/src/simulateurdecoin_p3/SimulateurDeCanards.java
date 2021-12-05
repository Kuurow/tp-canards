package simulateurdecoin_p3;

public class SimulateurDeCanards {

	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		simulateur.simuler();
	}

	void simuler() {
		Cancaneur colvert  = new CompteurDeCouacs(new Colvert());
		Cancaneur mandarin = new Mandarin();
		Cancaneur appelant = new Appelant();
		Cancaneur canardEnPlastique = new CanardEnPlastique();
		System.out.println("Simulateur de canards :");
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);
		
		System.out.println("Nous avons compté " + CompteurDeCouacs.getCouacs() + " couacs");
	}
	void simuler(Cancaneur canard) {
		canard.cancaner();
	}
}
