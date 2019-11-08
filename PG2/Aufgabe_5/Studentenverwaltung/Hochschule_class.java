package studentenverwaltung;

import java.util.ArrayList;
import java.util.List;

public class Hochschule {

	private String hochSchulName;
	
	private Studiengaenge namen;
	
	private List<String> studienGaenge = new ArrayList<String>();

	public Hochschule(String hochSchulName, Studiengaenge namen) {
		super();
		this.hochSchulName = hochSchulName;
		this.namen = namen;
	}	
	
	
	
	
}
