package Practice;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		String[] fruits = new String[4];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Banana";
		fruits[3] = "Grapes";
		System.out.println(fruits[2]);
		
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Grapes");
		
		fruitList.remove("Apple");
		
		System.out.println(fruitList);
		
	}
}
