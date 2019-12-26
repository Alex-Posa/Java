package vogelprogramm;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Vogel> vogelist = new ArrayList<>();
		
		vogelist.add(new Pinguin("Potter"));
		vogelist.add(new Drossel("Dumbo"));
		vogelist.add(new Amsel("Arudolfu"));
	
	
		for(Vogel v: vogelist) {
			System.out.println(v.getName());
			}

	}
}
