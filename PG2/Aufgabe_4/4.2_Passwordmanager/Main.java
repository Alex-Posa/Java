package passwordmanager;

import java.util.Scanner;

public class Main {
	public static String name = "PG2 Master Programm";
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			PasswordManager pwm = new PasswordManager();
			
			while(true) {
				System.out.println("Wilkommen beim Passwortmanager. Wählen sie eine Funktion aus:");
				System.out.println("  1.Anmelden");
				System.out.println("  2.Passwort ändern");
				
				int wahl = sc.nextInt();
				if(wahl == 1) {
					System.out.println("Bitte Passwort eingeben: ");
					String pw = sc.next();
					int anmeldung = pwm.verifyPw(pw);
					
					if(anmeldung < 0) {
						System.out.println("Oops. Zu viele Fehlversuche. Probieren sie es später erneut.");
						break;
					} else if(anmeldung == 1) {
						System.out.println("Sie haben sich erfolgreich beim " + name + " angemeldet.");
						break;
					} else {
						System.out.println("Falsches Passwort. Fehlversuche: " + pwm.failedCounter);
					}
					
				}
				
				if(wahl == 2) {
					System.out.println("Bitte geben sie das alte Passwort ein: ");
					String oldpw = sc.next();
					System.out.println("Bitte geben sie das neue Passwort ein: ");
					String newpw = sc.next();
					
					boolean success = pwm.changePw(oldpw, newpw);
					if(success) {
						System.out.println("Passwort wurde erfolgreich geändert");
					} else {
						System.out.println("Passwort konnte nicht geändert werden.");
					}
				}
				
				if(wahl < 1  ||  wahl > 2) {
					System.out.println("Falsche eingabe. Erneut versuchen: ");
				}
				
			}
			
			
			sc.close();
		}

}
