package fahrzeuge;

public abstract class Fahrzeuge {
	private String kennzeichen;
	private boolean istBenziner;
	private Color farbe;
	private int ps;
	
	public Fahrzeuge(String kennzeichen, boolean istBenziner, Color farbe, int ps) {
		this.kennzeichen = kennzeichen;
		this.istBenziner = istBenziner;
		this.farbe = farbe;
		this.ps = ps;
	}
	
	//G&S auto-generated
	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public boolean isIstBenziner() {
		return istBenziner;
	}

	public void setIstBenziner(boolean istBenziner) {
		this.istBenziner = istBenziner;
	}

	public Color getFarbe() {
		return farbe;
	}

	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}
	
	
	
}
