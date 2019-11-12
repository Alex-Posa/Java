package artikelverwaltung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_programm {

	public static void main(String[] args) {

		List<Artikel> artikelListe = new ArrayList<Artikel>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an ID you want to search for: ");
		
		// input Abfrage
		int input = sc.nextInt();
		
		sc.close();
		
		
		// Artikel 1
		Farbe p1_farbe = new Farbe();
		p1_farbe.setRot(100);
		p1_farbe.setBlau(10);
		p1_farbe.setGrün(70);
		
		Preis p1_preis = new Preis();
		p1_preis.setWährung("Euro");
		p1_preis.setWert(1000.0f);
		
		
		Artikel produkt_Eins = new Artikel();
		produkt_Eins.setArtikelBezeichnung("Jetpack");
		produkt_Eins.setArtikelnummer(000001);
		produkt_Eins.setArtikelFarbe(p1_farbe);
		produkt_Eins.setArtikelPreis(p1_preis);
		
		artikelListe.add(produkt_Eins);
		
		// Artikel 2
		
		Farbe p2_farbe = new Farbe();
		p2_farbe.setRot(255);
		p2_farbe.setBlau(100);
		p2_farbe.setGrün(10);
		
		Preis p2_preis = new Preis();
		p2_preis.setWert(400);
		p2_preis.setWährung("USD");
		
		Artikel produkt_zwei = new Artikel();
		produkt_zwei.setArtikelBezeichnung("Pillow");
		produkt_zwei.setArtikelnummer(2);
		produkt_zwei.setArtikelFarbe(p2_farbe);
		produkt_zwei.setArtikelPreis(p2_preis);

		artikelListe.add(produkt_zwei);
		
		
	

		// volle liste ausgeben
		
		/*for(int i = 0; i < artikelListe.size(); i++) {
            artikelListe.get(i).printProduct();
        }*/
	 
		
		Artikel.ifAvailable(artikelListe, input);
		
	}

}

