package lists;

import java.util.ArrayList;

public class Arraylists {

	public static void main(String[] args) {
		ArrayList fruits = new ArrayList();
		
		fruits.add("Apple");
		fruits.add(23);
		
		System.out.println(fruits);
	
		Pair<String ,Integer> p1 = new Pair("Drishti" , 19);
		Pair<Boolean ,String> p2 = new Pair(false , "Hello");
		
		p1.getDescription();
		p2.getDescription();

	}

}
