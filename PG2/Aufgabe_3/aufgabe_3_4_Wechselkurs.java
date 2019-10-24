import java.util.Scanner;


public class Aufgabe_3_4_Wechselkurs {
	
	public static float usd(float betrag) {
		
		float umrechner = 1.11f;
		float neuer_wert = betrag * umrechner ;
		return neuer_wert;
	}
	
	
	
	public static void main(String[] args) {
		
		float euro_zahl;
		Scanner sc = new Scanner(System.in);
		euro_zahl = sc.nextFloat();
		
		System.out.println("Der Wert in USD beträgt: " + usd(euro_zahl) + "$");
		sc.close();
	}
	
}
