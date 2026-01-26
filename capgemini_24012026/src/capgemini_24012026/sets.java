package capgemini_24012026;

import java.util.HashMap;
import java.util.HashSet;

public class sets {

	public static void main(String[] args) {
		// different types of sets in java
		
		// 1. HashSet
		// 2. LinkedHashSet
		// 3. TreeSet
		
		// HashSet
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Kolkata");
		hashSet.add("Bangalore");
		hashSet.add("Guwahati");
		hashSet.add("Ahmedabad");
		hashSet.add("Pune");
		hashSet.add("Chennai");
		hashSet.add("Mumbai");
		hashSet.add("Delhi");
		System.out.println("HashSet: " + hashSet);
		System.out.println("Size of HashSet: " + hashSet.size());
		System.out.println("Is HashSet empty? " + hashSet.isEmpty());
		System.out.println("Does HashSet contain 'Pune'? " + hashSet.contains("Pune"));
		hashSet.remove("Guwahati");
		System.out.println("HashSet after removing 'Guwahati': " + hashSet);
		System.out.println("Size of HashSet after removal: " + hashSet.size());
		System.out.println("---------------------------------------------------");

		// how exactly HashSet works internally
		// HashSet uses a hash table to store elements
		// It calculates the hash code of each element and uses it to determine the bucket location
		// If two elements have the same hash code, they are stored in a linked list at that bucket
		// This allows for fast retrieval, addition, and removal of elements
		
		// Hash Map 
		// HashMap is a key-value pair data structure
		// It uses a hash table to store the key-value pairs
		// Hash code of the key is calculated to determine the bucket location
		// If two keys have the same hash code, they are stored in a linked list at that bucket
		// This allows for fast retrieval, addition, and removal of key-value pairs
		
		// HashSet does not maintain any order of elements
		// Example
		System.out.println("Iterating through HashSet:");
		for (String city : hashSet) {
			System.out.println(city);
		}
		
		System.out.println("---------------------------------------------------");

		// can i print the hash map?
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Kolkata", "West Bengal");
		hashMap.put("Bangalore", "Karnataka");
		hashMap.put("Guwahati", "Assam");
		hashMap.put("Ahmedabad", "Gujarat");
		hashMap.put("Pune", "Maharashtra");
		hashMap.put("Chennai", "Tamil Nadu");
		hashMap.put("Mumbai", "Maharashtra");
		hashMap.put("Delhi", "Delhi");
		System.out.println("HashMap: " + hashMap);
		System.out.println("Size of HashMap: " + hashMap.size());
		System.out.println("Is HashMap empty? " + hashMap.isEmpty());
		System.out.println("Does HashMap contain key 'Pune'? " + hashMap.containsKey("Pune"));
		System.out.println("Does HashMap contain value 'Maharashtra'? " + hashMap.containsValue("Maharashtra"));
		hashMap.remove("Guwahati");
		System.out.println("HashMap after removing 'Guwahati': " + hashMap);
		System.out.println("Size of HashMap after removal: " + hashMap.size());
		System.out.println("---------------------------------------------------");

	}

}
