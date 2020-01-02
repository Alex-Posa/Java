package geo_object;

public abstract class GeoObjekt implements Rechnen {
	
	@SuppressWarnings("unused")
	private double x;
	@SuppressWarnings("unused")
	private double y;
	
	public GeoObjekt(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
