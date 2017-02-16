package ch04;

import java.util.HashSet;

public class RunHashSet {

	public static void main(String[] args) {
		HashSet<String> countryList = new HashSet<String>();
		//Add element into HashSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		//Retrieve element from HashSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
		//Check element from HashSet
		System.out.println("Countain Brunei: " + countryList.contains("Brunei"));
		System.out.println("Countain Singapore: " + countryList.contains("Singapore"));
		//Remove element from HashSet
		countryList.remove("Indonesia");
		System.out.println("(2) " + countryList);
	}

}
