package ch04;

import java.util.TreeSet;

public class RunTreeSet {

	public static void main(String[] args) {
		TreeSet<String> countryList = new TreeSet<String>();
		//Add element into TreeSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		//Retrieve element from TreeSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
		//Check element from TreeSet
		System.out.println("Countain Brunei: " + countryList.contains("Brunei"));
		System.out.println("Countain Singapore: " + countryList.contains("Singapore"));
		//Remove element from TreeSet
		countryList.remove("Indonesia");
		System.out.println("(2) " + countryList);
	}

}
