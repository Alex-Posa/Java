package fahrzeuge;

public class PKW extends Fahrzeuge {
	private int anzahlTueren;
	private int anzahlSitzplaetze;

	public PKW(String kennzeichen, boolean istBenziner, Color farbe, int ps, int anzahlTueren, int anzahlSitzplaetze) {
		super(kennzeichen, istBenziner, farbe, ps);
		this.anzahlSitzplaetze = anzahlSitzplaetze;
		this.anzahlTueren = anzahlTueren;
	}
	//G&S auto-generated
	public int getAnzahlTueren() {
		return anzahlTueren;
	}

	public void setAnzahlTueren(int anzahlTueren) {
		this.anzahlTueren = anzahlTueren;
	}

	public int getAnzahlSitzplaetze() {
		return anzahlSitzplaetze;
	}

	public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
		this.anzahlSitzplaetze = anzahlSitzplaetze;
	}
	
	
	public void printCar() {
		String car = "";
		car += "KENNZEICHEN: ";
		car += getKennzeichen();
		car += " BENZINER: ";
		car += isIstBenziner();
		car += " FARBE: ";
		car += getFarbe();
		car += " PS: ";
		car += getPs();
		car += " TÜRENANZAHL: ";
		car += getAnzahlTueren();
		car += " SITZPLÄTZE: ";
		car += getAnzahlSitzplaetze();
		
		System.out.println(car);
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
		PKW other = (PKW) obj;
		
		if(this.getPs() != other.getPs()) {
			return false;
		}
		if(this.getFarbe() != other.getFarbe()) {
			return false;
		}
		if(anzahlSitzplaetze != other.anzahlSitzplaetze) {
			return false;
		}
		if(anzahlTueren != other.anzahlTueren) {
			return false;
		}
		return true;
	}
}
