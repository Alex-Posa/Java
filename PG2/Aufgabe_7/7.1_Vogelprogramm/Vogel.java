package vogelprogramm;

public abstract class Vogel implements HasName {
	
	public String name;
	
	public abstract void singen();
	
	public Vogel(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.sayHello + " " + this.getClass().getSimpleName() + " " + this.name;
	}
	
	
}
