package capgemini_22012026;

import java.util.*;

public class arraylist_prog {

	public static void main(String[] args) {
		// Arraylist Programs
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(17);
		list.add(9);
		list.add(4);
		list.add(8);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index " + i + ": " + list.get(i));
		}
		
		System.out.println("----------------------------------------------------");
		
		for (int i : list) {
			System.out.println("Element: " + i);
		}
		
		System.out.println("----------------------------------------------------");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Apple");
		list2.add("Samsung");
		list2.add("OnePlus");
		list2.add("Google");
		list2.add("Vivo");
		list2.add("Oppo");
		list2.add("Xiaomi");
		list2.add("Nothing");
		
		Iterator<String> it = list2.iterator();
		// what is Iterator in Java?
		// Iterator is an interface in Java that provides a way to traverse a collection of objects.
		// hasNext() - returns true if there are more elements to iterate over 
		// next() - returns the next element in the iteration
		// remove() - removes the last element returned by the iterator from the underlying collection
		
		while (it.hasNext()) {
			// what is happening here?
			// if it.hasNext() returns true, then it.next() is called to get the next element in the iteration
			System.out.println("Element: " + it.next());
		}
		
		System.out.println("----------------------------------------------------");
		
		list2.remove("Google");
		for (String s : list2) {
			System.out.println("Element: " + s);
		}
		
		System.out.println("----------------------------------------------------");
		
		// iterator only works in one direction i.e. forward direction
		// iterator works across all collection classes like List, Set, Queue etc.
		// iterator is fail-fast i.e. if the collection is modified while iterating, it throws ConcurrentModificationException

		// Example of ConcurrentModificationException
		try {
			while (it.hasNext()) {
				String s = it.next();
				System.out.println("Element: " + s);
				if (s.equals("Nothing")) {
					list2.remove(s); // This will throw ConcurrentModificationException
				}
			}
		} catch (ConcurrentModificationException e) {
			System.out.println(e.getMessage());
			System.out.println("ConcurrentModificationException caught!");
			e.printStackTrace();
		}
	}

}
