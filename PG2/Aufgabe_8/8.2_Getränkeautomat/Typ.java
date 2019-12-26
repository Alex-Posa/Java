package getraenkeautomat;

public enum Typ {

	COLA(1,"Cola", 80), 
	LIMO(2,"Limo", 70), 
	Wasser(3, "Wasser", 60);
	
	private int id;
	private String name;
	private int preisInCent;
	
	
	Typ(int ID, String Name, int PiC){
		this.id = ID;
		this.name = Name;
		this.preisInCent = PiC;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getPreisInCent() {
		return preisInCent;
	}
	

	public String toString() {
		return getId() + ": " + getName() + " [" + getPreisInCent() + "Cent] ";
	}
}
