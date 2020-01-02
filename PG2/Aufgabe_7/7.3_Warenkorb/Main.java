package warenkorb;

public class Main {

	public static void main(String[] args) {
		Warenkorb w1 = new Warenkorb();
		
		Produkt pkw = new Luxusartikel("AMG Mercedes", 100000);
		Produkt kette = new Schmuck("Iced-Out-Kette", 4500);
		Produkt buch = new Buch("ASOIF", "GRRM", 25);
		
		w1.add(pkw);
		w1.add(kette);
		w1.add(buch);
		
		w1.print();
		System.out.println("Gesamtpreis des Warenkorbes: " + w1.gesamtPreis() + "€");
		w1.clear();
		
	}

}
