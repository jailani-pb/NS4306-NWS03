package ch04;

import java.util.LinkedHashSet;

public class RunLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> countryList = new LinkedHashSet<String>();
		//Add element into LinkedHashSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		//Retrieve element from LinkedHashSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
		//Check element from LinkedHashSet
		System.out.println("Countain Brunei: " + countryList.contains("Brunei"));
		System.out.println("Countain Singapore: " + countryList.contains("Singapore"));
		//Remove element from LinkedHashSet
		countryList.remove("Indonesia");
		System.out.println("(2) " + countryList);
	}

}
