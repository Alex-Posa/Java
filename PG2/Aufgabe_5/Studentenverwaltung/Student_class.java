package studentenverwaltung;

public class Student {

	private String vorName;
	private String nachName;
	private int matrikelnummer;
	private String email; 
	
	//
	
	public String getVorName() {
		return vorName;
	}

	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	public String getNachName() {
		return nachName;
	}

	public void setNachName(String nachName) {
		this.nachName = nachName;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Studiengaenge getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(Studiengaenge studiengang) {
		this.studiengang = studiengang;
	}

	private Studiengaenge studiengang;

	
	
	//
	
	
	
	
	
	
	

	
}
