package personenbeziehungen;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		/*String jim = "Jim likes Larry and Jean, but hates Kim.";
		String bob = "Bob loves Jean, and likes Larry and Kim.";
		String jean = "Jean loves Bob, likes Jim, but hates Kim.";
		String kim = "Kim hates Jim, likes Larry and Bob.";
		String larry ="Larry loves Martin, and hates Karl and Jean.";
		*/
		
		List<String> lovesList = new ArrayList<String>();
		List<String> likesList = new ArrayList<String>();
		List<String> hatesList = new ArrayList<String>();

		lovesList.add(" ");
		likesList.add("Larry");
		likesList.add("Jean");
		hatesList.add("Kim");
		
		System.out.println("Jim: " + " " + "loves:" + " " + lovesList + " "+ "likes: " +  likesList + " " + " hates: " + hatesList);
		
	}

}
