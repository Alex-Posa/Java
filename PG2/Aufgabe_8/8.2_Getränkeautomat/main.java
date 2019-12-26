package getraenkeautomat;

public class Main {

	public static void main(String[] args) {
		Automat atm = new Automat();
		
		while(true) {
			atm.inhaltAnzeigen();
			atm.getraenkeWahl();
			System.out.println("- - - - - - - - - - - - - - - - - - -");
		}
	}

}
