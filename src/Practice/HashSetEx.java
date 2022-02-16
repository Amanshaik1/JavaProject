package Practice;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Tesla");
		cars.add("Ford");
		cars.add("Ferrari");
		cars.add("Tesla");
		cars.add("Ford");
		cars.add("Toyota");
		System.out.println(cars);

		cars.contains("Tesla"); 	// checking item 
		System.out.println(cars.contains("Tesla"));
		
		cars.contains("BMW"); 	// checking item 
		System.out.println(cars.contains("BMW"));
		
		cars.remove("Ford");
		
	}

}
