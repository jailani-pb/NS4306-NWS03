package ch04;

import java.util.TreeMap;

public class RunTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> capitalList = new TreeMap<String, String>();
		//Add elements into TreeMap
		capitalList.put("Brunei", "Bandar Seri Begawan");
		capitalList.put("Indonesia", "Jakarta");
		capitalList.put("Malaysia", "Kuala Lumpur");
		capitalList.put("Thailand", "Bangkok");
		capitalList.put("Phillippines", "Manila");
		capitalList.put("Brunei", "Bangar");
		System.out.println("(1) " + capitalList);
		//Remove element from TreeMap
		System.out.println("Removed: " + capitalList.remove("Brunei"));
		System.out.println("(2) " + capitalList);
		//Retrieve element from TreeMap
		System.out.println("Retrieved: " + capitalList.get("Thailand"));
		//Retrieve all keys in TreeMap
		System.out.println("Countries: " + capitalList.keySet());
		//Retrieve all values in TreeMap
		System.out.println("Capitals: " + capitalList.values());
		//Find if Thailand (country) is stored inside the TreeMap
		if(capitalList.containsKey("Thailand")) {
			System.out.println("Retrieved: " + capitalList.get("Thailand"));
		}
		//Retrieve all elements in TreeMap
		for(String country : capitalList.keySet()) {
			System.out.println(country + " = " + capitalList.get(country));
		}
	}

}
