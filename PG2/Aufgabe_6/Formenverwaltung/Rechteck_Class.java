package formenverwaltung;

public class Rechteck extends Quadrat {

	private double breite;
	
	
	public double berechneUmfang(double l, double b) {
		return (2*l)+(2*b);
	}
	
	public double berechneFlaeche(double l, double b) {
		return l*b;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}
	
}
