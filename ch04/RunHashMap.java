package ch04;

import java.util.HashMap;

public class RunHashMap {

	public static void main(String[] args) {
		HashMap<String, String> capitalList = new HashMap<String, String>();
		//Add elements into HashMap
		capitalList.put("Brunei", "Bandar Seri Begawan");
		capitalList.put("Indonesia", "Jakarta");
		capitalList.put("Malaysia", "Kuala Lumpur");
		capitalList.put("Thailand", "Bangkok");
		capitalList.put("Phillippines", "Manila");
		capitalList.put("Brunei", "Bangar");
		System.out.println("(1) " + capitalList);
		//Remove element from HashMap
		System.out.println("Removed: " + capitalList.remove("Brunei"));
		System.out.println("(2) " + capitalList);
		//Retrieve element from HashMap
		System.out.println("Retrieved: " + capitalList.get("Thailand"));
		//Retrieve all keys in HashMap
		System.out.println("Countries: " + capitalList.keySet());
		//Retrieve all values in HashMap
		System.out.println("Capitals: " + capitalList.values());
		//Find if Thailand (country) is stored inside the HashMaps
		if(capitalList.containsKey("Thailand")) {
			System.out.println("Retrieved: " + capitalList.get("Thailand"));
		}
		//Retrieve all elements in HashMap
		for(String country : capitalList.keySet()) {
			System.out.println(country + " = " + capitalList.get(country));
		}
	}

}
