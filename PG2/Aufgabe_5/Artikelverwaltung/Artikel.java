package artikelverwaltung;
import java.util.ArrayList;
import java.util.List;



public class Artikel {
	
	private int artikelnummer;
	private String artikelBezeichnung;
	
	private Farbe artikelFarbe;
	private Preis artikelPreis;
	
	
	List<Artikel> artikelListe = new ArrayList<Artikel>();
	
	// getters and setters
	
	public int getArtikelnummer() {
		return artikelnummer;
	}

	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}

	public String getArtikelBezeichnung() {
		return artikelBezeichnung;
	}

	public void setArtikelBezeichnung(String artikelBezeichnung) {
		this.artikelBezeichnung = artikelBezeichnung;
	}

	public Farbe getArtikelFarbe() {
		return artikelFarbe;
	}

	public void setArtikelFarbe(Farbe artikelFarbe) {
		this.artikelFarbe = artikelFarbe;
	}

	public Preis getArtikelPreis() {
		return artikelPreis;
	}

	public void setArtikelPreis(Preis artikelPreis) {
		this.artikelPreis = artikelPreis;
	}
	    
	// getters and setters end
	
	// methods from here on
	
	
	public void printProduct() {
		
		String product = "";
		product += getArtikelBezeichnung();
		product += " ";
		product += getArtikelnummer();
		product += " ";
		product += artikelFarbe.getRot();
		product += " ";
		product += artikelFarbe.getBlau();
		product += " ";
		product += artikelFarbe.getGrün();
		product += " ";
		product += artikelPreis.getWert();
		product += " ";
		product += artikelPreis.getWährung();
		
		System.out.println(product);
	}
	
	
	
	

}
