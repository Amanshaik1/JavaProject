package Practice;

import java.util.ArrayList;
import java.util.Collections;  

public class LoopArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Tesla");
		cars.add("Lamborghini");
		cars.add("Ferrari");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Toyota");
		for (String i :cars) {
			System.out.println(i);
		}

	}

}
