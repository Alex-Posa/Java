package geo_object;

public class Quadrat extends GeoObjekt {
	
	private int laenge;

	public Quadrat(double x, double y, int laenge) {
		super(x, y);
		this.laenge = laenge;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	@Override
	public double berechneFlaeche() {
		return laenge*laenge;
	}

	@Override
	public double berechneUmfang() {
		return 4*laenge;
	}
	

}
