package getraenkeautomat;

import java.util.ArrayList;
import java.util.Scanner;

public class Automat {

		Scanner sc = new Scanner(System.in);
		
		private ArrayList<Flasche> typSlot1 = new ArrayList<>();
		private ArrayList<Flasche> typSlot2 = new ArrayList<>();
		private ArrayList<Flasche> typSlot3 = new ArrayList<>();
		
		private int tenCents    = 10;
		private int twentyCents =  5;
		
		public Automat() {
			for(int i = 0; i < 2; i++) {
				this.typSlot1.add(new Flasche(Typ.COLA));
				this.typSlot2.add(new Flasche(Typ.LIMO));
				this.typSlot3.add(new Flasche(Typ.Wasser));
			}
		}
		
		
		public void inhaltAnzeigen() {
			System.out.println("Bitte Getränk auswählen:");
			
			if(this.typSlot1.isEmpty() != true) {
				Flasche flasche = this.typSlot1.get(0);
				System.out.println(flasche.getSort().toString());
			}
			
			if(this.typSlot2.isEmpty() != true) {
				Flasche flasche = this.typSlot2.get(0);
				System.out.println(flasche.getSort().toString());
			}
			
			if(this.typSlot3.isEmpty() != true) {
				Flasche flasche = this.typSlot3.get(0);
				System.out.println(flasche.getSort().toString());
			}
		}
		
		public void getraenkeWahl() {
			ArrayList<Flasche> typSlot = null;
			Flasche flasche = null;
			
			while(true) {
				int wahl = this.sc.nextInt();
				
				if(this.typSlot1.isEmpty() != true) {
					flasche = this.typSlot1.get(0);
					if(flasche.getSort().getId() == wahl) {
						typSlot = this.typSlot1;
						break;
					}
				}
				
				if(this.typSlot2.isEmpty() != true) {
					flasche = this.typSlot2.get(0);
					if(flasche.getSort().getId() == wahl) {
						typSlot = this.typSlot2;
						break;
					}
				}
				
				if(this.typSlot3.isEmpty() != true) {
					flasche = this.typSlot3.get(0);
					if(flasche.getSort().getId() == wahl) {
						typSlot = this.typSlot3;
						break;
					}
				}
				
				if(typSlot == null) {
					System.out.println("Falsche Eingabe. Biite wiederholen: ");
				}
					
			}
			// wahl zu ende
			
			// beginn der zahlungsart
			
			
				int offenerBetrag = flasche.getSort().getPreisInCent();
				while(offenerBetrag > 0) {
					System.out.println("Offener Betrag: " + offenerBetrag + " Cent");
					System.out.println("Gültiger Einwurf: 10: 10 Cent, 20: 20 Cent, 50: 50 Cent, 100: 1 Euro");
				
					int eingabe = sc.nextInt();
					if(eingabe == 10 || eingabe == 20 || eingabe == 50 || eingabe == 100) {
						if(eingabe == 10) {
							this.tenCents++;
						}
						
						if(eingabe == 20) {
							this.twentyCents++;
						}
						
						offenerBetrag = offenerBetrag - eingabe;
					} else {
						System.out.println("Falsche Eingabe. Bitte Wiederholen: ");
					}
				}
				
				if(offenerBetrag < 0) {
					System.out.println("Wechselgeld: " + offenerBetrag*(-1) + " Cent");
					
					while(offenerBetrag <= -20) {
						this.twentyCents--;
						offenerBetrag += 20;
						System.out.println(" 20 Cent zurück");
					}
					
					while(offenerBetrag <= -10) {
						this.tenCents--;
						offenerBetrag += 10;
						System.out.println(" 10 Cent zurück");
					}
				}
				
				System.out.println("Vielen Dank für Ihre Wahl. Bitte nehmen Sie ihr Getränk aus dem Fach.");
				
				typSlot.remove(flasche);
		}
		
		
		public void münzenAnzeigen() {
			System.out.println("- - - - - - - - - - - - - - - - - - - -");
			System.out.println("Anzahl 10-Cent Münzen: " + this.tenCents);
			System.out.println("Anzahl 20-Cent Münzen: " + this.twentyCents);
		}
		
}
