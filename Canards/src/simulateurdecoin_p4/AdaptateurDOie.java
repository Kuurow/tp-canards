package simulateurdecoin_p4;

public class AdaptateurDOie implements Cancaneur {
	private Oie uneOie;
	
	public AdaptateurDOie(Oie uneOie) {
		this.uneOie = uneOie;
	}
	
	public void cancaner() {
		uneOie.carcarder();
	}
}
