package buchstabenmixer;

import java.util.Scanner;

public class MainBuchstabenMixer {
	
	public static void main(String[] args) {
		
		
		String sentence;
		System.out.println("Please enter your word or sentence: ");
		Scanner sc = new Scanner(System.in);
		
		sentence = sc.next();
		System.out.println("Sentence: " + sentence);
		
		String firstHalf = sentence.substring(0, sentence.length()/2);
		String secondHalf = sentence.substring(sentence.length()/2, sentence.length());
		
		String endResult = secondHalf + firstHalf;
		
		System.out.println("New Sentence: " + endResult);
		
		
		sc.close();
		
	}

}
