import java.util.Scanner;

public class Aufgabe_3_3_Gleichheit_Arrays {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	int[] array_1 = {1,4,3};
	int[] array_2 = {1,4,3};

	System.out.println(" array_1 equals array_2 =" + f(array_1, array_2));
	
	sc.close();
	}
	
	public static boolean f(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return false;
		}
		
		for(int i=0; i< a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
			
		}
		
		return true;
	}  
}
