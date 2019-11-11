package artikelverwaltung;

import java.util.ArrayList;
import java.util.List;

public class Main_programm {

	public static void main(String[] args) {

		List<Artikel> artikelListe = new ArrayList<Artikel>();
		
		Farbe p1_farbe = new Farbe();
		p1_farbe.setRot(100);
		p1_farbe.setBlau(10);
		p1_farbe.setGrün(70);
		
		Preis p1_preis = new Preis();
		p1_preis.setWährung("Euro");
		p1_preis.setWert(1000.0f);
		
		
		Artikel produkt_Eins = new Artikel();
		produkt_Eins.setArtikelBezeichnung("Knife");
		produkt_Eins.setArtikelnummer(000001);
		produkt_Eins.setArtikelFarbe(p1_farbe);
		produkt_Eins.setArtikelPreis(p1_preis);
		
		produkt_Eins.printProduct();
	
		artikelListe.add(produkt_Eins);
		artikelListe.add(produkt_Eins);
		
		
		
	 
	}

}
