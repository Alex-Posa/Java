public class Array_loops {

	public static void main(String[] args) {
		int[] num_array = {6,42,10,15}; // insert any amount of numbers, just for test purposes. 
		int sum = 0;
	
		for(int x=0; x < num_array.length; x++) { // going through the array and summing up.
			sum += num_array[x];
		}
		System.out.println(sum);
	}
}
