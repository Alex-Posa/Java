package warenkorb;

public class Luxusartikel implements Produkt{

	private String name;
	private double preis;
	private double mwst = 1.25;
	
	public Luxusartikel(String n, double p) {
		this.name = n;
		this.preis = p;
	}
	
	@Override
	public double bruttoPreis() {
		return this.preis*this.mwst;
	}

	@Override
	public String toString() {
		return "Luxusartikel [name=" + this.name + ", preis=" + this.preis + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public double getMwst() {
		return mwst;
	}

}
