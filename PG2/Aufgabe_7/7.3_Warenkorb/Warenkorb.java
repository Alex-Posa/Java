package warenkorb;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

	private List<Produkt> artikel = new ArrayList<Produkt>();
	
	public void clear() {
		this.artikel.clear();
	}
	
	public void add(Produkt p) {
		this.artikel.add(p);
	}
	
	public double gesamtPreis() {
		double summe = 0.0;
		for(Produkt p : artikel) {
			summe = summe + p.bruttoPreis();
		}
		return summe;
	}
	
	public void print() {
		for(Produkt p: artikel) {
			System.out.println(p.toString());
		}
	}

	public List<Produkt> getArtikel() {
		return artikel;
	}

	public void setArtikel(List<Produkt> artikel) {
		this.artikel = artikel;
	}

}
