package geo_object;

public class Rechteck extends Quadrat {
	
	private int breite;

	public Rechteck(double x, double y, int laenge, int breite) {
		super(x, y, laenge);
		this.breite = breite;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}
	
}
