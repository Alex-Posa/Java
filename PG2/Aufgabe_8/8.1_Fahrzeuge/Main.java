package fahrzeuge;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PKW bmw01 = new PKW("BMW_1", false, Color.BLACK, 140, 4, 5);
		bmw01.printCar();
		
		PKW bmw03 = new PKW("BMW_3", false, Color.BLACK, 140, 4, 5);
		bmw03.printCar();
		
		if(bmw03.equals(bmw01)) {
			System.out.println(bmw03.getKennzeichen() + " ist das gleiche Auto wie " + bmw01.getKennzeichen());
		} else {
			System.out.println(bmw03.getKennzeichen() + " ist ungleich " + bmw01.getKennzeichen());
		}
		
		LKW brummi = new LKW("Brummi", true, Color.YELLOW, 200, 6, 1500);
		
		LKW azmodan = new LKW("Azmodan", true, Color.GREEN, 220, 4, 1800);
		
		if(brummi.equals(azmodan)) {
			System.out.println(brummi.getKennzeichen() + " ist der gleiche LKW wie " + azmodan.getKennzeichen());
		} else {
			System.out.println(brummi.getKennzeichen() + " ist ungleich " + azmodan.getKennzeichen());
		}
		
		List<LKW> kraftwagenListe = new ArrayList<LKW>();
		kraftwagenListe.add(brummi);
		kraftwagenListe.add(azmodan);
		
		if(kraftwagenListe.contains(brummi)) {
			System.out.println(brummi.getKennzeichen() + " existiert bereits in der Liste.");
		}
		
		
	}

}
