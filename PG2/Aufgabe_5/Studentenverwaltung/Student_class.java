package studentenverwaltung;


import java.util.List;

public class Student {

	private String name;
	private int matrikelnummer;
	private String email;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	//Logic
	
	public static boolean ifExists(List<Student> studentList) {
	
		return true;
	}
	
	public static void addToList(){
		
	}
	
	public static void printList(List<Student> studentList) {
		for(Student s: studentList) {
			System.out.println("Name: " + s.getName());
			System.out.print("Matrikelnummer: ");
			System.out.println(s.getMatrikelnummer());
			System.out.println("EMail: " + s.getEmail());
			System.out.println();
			}
	}
	
}
