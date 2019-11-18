package studentenverwaltung;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		Hochschule othr = new Hochschule();
		othr.setName("OTH Regensburg");

		
		
		//add students to your hearts extent
		
		Student alex = new Student();
		alex.setName("Alex");
		alex.setMatrikelnummer(30008600);
		alex.setEmail("alex@email.de");
		studentList.add(alex);
		
		Student chris = new Student();
		chris.setName("Chris");
		chris.setMatrikelnummer(40004300);
		chris.setEmail("chris@email.de");
		studentList.add(chris);
		
		
		//Studiengänge
		
		Studiengänge informatik1 = new Studiengänge();
		informatik1.setName("allgemeine Informatik");

		
		
		//Kurse
		
		Kurse mathe = new Kurse();
		mathe.setName("Mathematik 1");
		mathe.setMultiplikator(0.5);
		mathe.setCredits(7);
		
		Kurse programmieren = new Kurse();
		programmieren.setName("Programmieren 1");
		programmieren.setMultiplikator(0.5);
		programmieren.setCredits(8);
		
		// Logic stuff
		
		
		
		Student.printList(studentList);
		
		
	}

}
