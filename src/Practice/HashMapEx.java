package Practice;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> stateTimeZone = new HashMap<String, String>();
		
		stateTimeZone.put("Alabama", "CST");
		stateTimeZone.put("Missouri","CST");
		stateTimeZone.put("Calfornia", "PST");
		stateTimeZone.put("New Mexico", "MST");
		stateTimeZone.put("New York", "EST");
		System.out.println(stateTimeZone);
		
		stateTimeZone.get("New York");			// get function
		System.out.println(stateTimeZone.get("New York"));
		
		stateTimeZone.remove("New Mexico");	// Remove item
		System.out.println(stateTimeZone);
	}

}
