package warenkorb;

public class Buch implements Produkt{
	
	private String name;
	private String author;
	private double preis;
	private double mwst = 1.05;
	
	public Buch(String n, String a, int p) {
		this.name = n;
		this.author = a;
		this.preis = p;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	@Override
	public double bruttoPreis() {
		return this.preis*this.mwst;
	}

	@Override
	public String toString() {
		return "Buch [name=" + this.name + ", author=" + this.author + ", preis=" + this.preis + "]";
	}

}
