package fahrzeuge;

public class LKW extends Fahrzeuge {
	private int anzahlReifen;
	private int ladeGewicht;
	
	public LKW(String kennzeichen, boolean istBenziner, Color farbe, int ps, int anzahlReifen, int ladeGewicht) {
		super(kennzeichen, istBenziner, farbe, ps);
		this.anzahlReifen = anzahlReifen;
		this.ladeGewicht = ladeGewicht;
	}
	//G&S auto-generated
	public int getAnzahlReifen() {
		return anzahlReifen;
	}

	public void setAnzahlReifen(int anzahlReifen) {
		this.anzahlReifen = anzahlReifen;
	}

	public int getLadeGewicht() {
		return ladeGewicht;
	}

	public void setLadeGewicht(int ladeGewicht) {
		this.ladeGewicht = ladeGewicht;
	}
	
	public void printLkw() {
		String lkw = "";
		lkw += "KENNZEICHEN: ";
		lkw += getKennzeichen();
		lkw += " BENZINER: ";
		lkw += isIstBenziner();
		lkw += " FARBE: ";
		lkw += getFarbe();
		lkw += " PS: ";
		lkw += getPs();
		lkw += " REIFENANZAHL: ";
		lkw += getAnzahlReifen();
		lkw += " LADEGEWICHT: ";
		lkw += getLadeGewicht();
		lkw += " Kg.";
		
		System.out.println(lkw);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj) == false) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		LKW other = (LKW) obj;
		if(this.getLadeGewicht() != other.getLadeGewicht()) {
			return false;
		}
		if(this.getAnzahlReifen() != other.getAnzahlReifen()) {
			return false;
		}
		
		return true;
	}
}
