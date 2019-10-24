import java.util.Scanner;

public class Aufgabe_3_1_Morse_Code {
	
	public static void main(String[] args) {
		
		char []array = new char [5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < array.length; i++ ) {
			System.out.println("Please enter the next char: " );
			array[i] = sc.next().charAt(0);
	}
		sc.close();
		
		String eingabe = new String(array);
		
		switch(eingabe) {
		
		case "-----":
			System.out.println(0);
			break;
			
		case ".----":
			System.out.println(1);
			break;
			
		case "..---":
			System.out.println(2);
			break;
				
		case "...--":
			System.out.println(3);
			break;
			
		case "....-":
			System.out.println(4);
			break;
			
		case ".....":
			System.out.println(5);
			break;
			
		case "-....":
			System.out.println(6);
			break;
			
		case "--...":
			System.out.println(7);
			break;
			
		case "---..":
			System.out.println(8);
			break;
			
		case "----.":
			System.out.println(9);
			break;
			
		default:
			System.out.println("Incorrect Morse-Code");
		
		}
	}		
}
