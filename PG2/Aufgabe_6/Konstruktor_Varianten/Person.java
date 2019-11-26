package konstruktor_varianten;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person() {
		System.out.println("Created new person");
	}
	
	public Person(String firstName) {
		this.firstName = firstName;
		System.out.println("Created new person " + firstName);
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName  =  lastName;
		System.out.println("Created new person " + firstName + " " + lastName);
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
