package ch04;

import java.util.LinkedHashMap;

public class RunLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, String> capitalList = new LinkedHashMap<String, String>();
		//Add elements into LinkedHashMap
		capitalList.put("Brunei", "Bandar Seri Begawan");
		capitalList.put("Indonesia", "Jakarta");
		capitalList.put("Malaysia", "Kuala Lumpur");
		capitalList.put("Thailand", "Bangkok");
		capitalList.put("Phillippines", "Manila");
		capitalList.put("Brunei", "Bangar");
		System.out.println("(1) " + capitalList);
		//Remove element from LinkedHashMap
		System.out.println("Removed: " + capitalList.remove("Brunei"));
		System.out.println("(2) " + capitalList);
		//Retrieve element from LinkedHashMap
		System.out.println("Retrieved: " + capitalList.get("Thailand"));
		//Retrieve all keys in LinkedHashMap
		System.out.println("Countries: " + capitalList.keySet());
		//Retrieve all values in LinkedHashMap
		System.out.println("Capitals: " + capitalList.values());
		//Find if Thailand (country) is stored inside the LinkedHashMap
		if(capitalList.containsKey("Thailand")) {
			System.out.println("Retrieved: " + capitalList.get("Thailand"));
		}
		//Retrieve all elements in LinkedHashMap
		for(String country : capitalList.keySet()) {
			System.out.println(country + " = " + capitalList.get(country));
		}
	}

}
