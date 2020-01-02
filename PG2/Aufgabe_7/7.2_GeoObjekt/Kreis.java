package geo_object;

public class Kreis extends GeoObjekt {

	private int radius;
	
	public Kreis(double x, double y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double berechneFlaeche() {
		return (radius*radius*Math.PI);
	}

	@Override
	public double berechneUmfang() {
		return (2*radius*Math.PI);
	}
	

}
