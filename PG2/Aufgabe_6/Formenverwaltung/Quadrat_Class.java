package formenverwaltung;

public class Quadrat {

	private double laenge;
	
	public double berechneFlaeche(double l) {
		return l*l;
	}
	
	public double berechneUmfang(double l) {
		return 4*l;
	}

	protected double getLaenge() {
		return laenge;
	}

	protected void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	
	
	
}
