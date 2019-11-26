package static_student;

public class Student {
	private static int static_id;
	private String firstName;
	private String lastName;
	
	
	public int getId() {
		return static_id;
	}
	public void setId(int id) {
		Student.static_id = id;
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
	
	public Student(int id,String firstName, String lastName) {
		this.firstName = "";
		this.lastName = "";
		Student.static_id = id;
		
		System.out.println(firstName + ": " + static_id);
	}
	
}
