import java.util.Scanner;

public class Aufgabe_3_2_Schleife {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max, div;
		
		max = sc.nextInt();
		div = sc.nextInt();
		
		System.out.println("max: " + max);
		
		System.out.println("div: " + div);
		
		for(int i = 0; i < max; i++) {
			if(i%div == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
