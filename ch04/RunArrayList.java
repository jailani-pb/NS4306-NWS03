package ch04;

import java.util.ArrayList;

public class RunArrayList {

	public static void main(String[] args) {
		ArrayList<String> countryList = new ArrayList<String>();
		System.out.println("(1)" + countryList);
		//Adding elements into ArrayList.
		countryList.add("Brunei");
		System.out.println("(2)" + countryList);
		countryList.add("Singapore");
		System.out.println("(3)" + countryList);
		countryList.add("Indonesia");
		countryList.add("Malaysia");
		System.out.println("(4)" + countryList);
		countryList.add(1, "Vietnam");
		//index stated have to be within the size of the ArrayList.
		countryList.add(5, "Thailand");
		System.out.println("(5)" + countryList);
		
		//Remove elements from ArrayList.
		String removedCountry = countryList.remove(4);
		System.out.println("(6)" + countryList + " Removed: " + removedCountry);
		
		//Replace elements in ArrayList.
		String replacedCountry = countryList.set(1, "Cambodia");
		System.out.println("(7)" + countryList + " Replaced: " + replacedCountry);
		
		//Retrieve elements from ArrayList.
		System.out.println("First Element: " + countryList.get(0));
		System.out.println("Last Element: " + countryList.get(countryList.size()-1));
		System.out.println("Middle Element: " + countryList.get(countryList.size()/2));
	}

}
