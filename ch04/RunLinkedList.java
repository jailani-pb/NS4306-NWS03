package ch04;

import java.util.LinkedList;
import java.util.ListIterator;

public class RunLinkedList {

	public static void main(String[] args) {
		LinkedList<String> countryList = new LinkedList<String>();
		System.out.println("(1)" + countryList);
		//Adding to first element in LinkedList
		countryList.addFirst("Brunei");
		countryList.addFirst("Philippines");
		System.out.println("(2)" + countryList);
		//Adding to last element in LinkedList
		countryList.addLast("Thailand");
		System.out.println("(3)" + countryList);
		//Retrieve first and last element
		//Student TODO
		//Remove first and last element
		//Student TODO
		
		ListIterator<String> countryIterator = countryList.listIterator();
		//Add elements using ListIterator
		countryIterator.add("Vietnam");
		System.out.println("(4)" + countryList);
		//Move iterator to the end of LinkedList
		System.out.println("--Moving the Iterator--");
		while(countryIterator.hasNext()) {
			System.out.println("Currently Traversed: " + countryIterator.next());
		}
		//Move iterator to the beginning of LinkedList
		System.out.println("--Moving the Iterator--");
		while(countryIterator.hasPrevious()) {
			System.out.println("Currently Traversed: " + countryIterator.previous());
		}
		//Move iterator to the middle of LinkedList
		System.out.println("--Moving the Iterator--");
		int counter = 0;
		while(counter != countryList.size()/2 && countryIterator.hasNext()) {
			System.out.println("Currently Traversed: " + countryIterator.next());
			counter++;
		}
		//Remove element using ListIterator
		countryIterator.remove();
		System.out.println("(5)" + countryList);
		
		countryIterator.next();
		//Replace element using ListIterator
		countryIterator.set("Brunei Darussalam");
		System.out.println("(6)" + countryList);
	}

}
