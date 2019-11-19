package formenverwaltung;

public class Main {

	public static void main(String[] args) {

		Quadrat q1 = new Quadrat();
		q1.setLaenge(4);
		System.out.println(q1.berechneFlaeche(q1.getLaenge()));
		
		Rechteck r1 = new Rechteck();
		r1.setBreite(5);
		r1.setLaenge(4);
		System.out.println(r1.berechneFlaeche(r1.getBreite(),r1.getLaenge()));
	}

}
