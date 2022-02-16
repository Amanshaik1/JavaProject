package Practice;

import java.util.ArrayList;
import java.util.Collections;

 


public class SortanArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Grapes");
		Collections.sort(fruitList); // Sort fruitList
		
		for (String i : fruitList) {
			System.out.println(i);
		}
		
	}

}
