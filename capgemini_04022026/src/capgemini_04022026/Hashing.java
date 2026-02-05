// HashMap 
/* HashMap is a part of Java's collection framework and is used to store data in key-value pairs.
* It allows for fast retrieval, insertion, and deletion of elements based on their keys.
* HashMap uses a hash table to store the map, which means it uses a hash function to compute an index
* into an array of buckets or slots, from which the desired value can be found.
*/
		
/* Example of HashMap syntax
* 
* HashMap<KeyType, ValueType> mapName = new HashMap<>();
* 
* KeyType: The data type of the keys in the map (e.g., Integer, String).
* ValueType: The data type of the values in the map (e.g., String, Integer).
* mapName: The name of the HashMap instance.
*/
	
// Hashing Algorithm
/* * A hashing algorithm is a function that converts an input (or 'message') into a fixed-size string of bytes.
* The output is typically a 'digest' that is unique to each unique input.
* Hashing is commonly used in various applications such as data integrity verification, password storage, and digital signatures.
*/
		

package capgemini_04022026;

import java.util.HashMap;
import java.util.Map;

public class Hashing {

	public static void main(String[] args) {
		
		System.out.println("Hashing Algorithm in Java");
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Samsung", 1);
		map.put("Apple", 2);
		map.put("OnePlus", 3);
		map.put("Xiaomi", 4);
		map.put("Google", 5);
		
		System.out.println("HashMap: " + map);
		System.out.println("Value for key 'Apple': " + map.get("Apple"));
		System.out.println("Value for key 'OnePlus': " + map.get("OnePlus"));
		System.out.println("Value for key 'Xiaomi': " + map.get("Xiaomi"));
		System.out.println("Value for key 'Google': " + map.get("Google"));

		// getOrDefault() method returns the value to which the 
		// specified key is mapped, or defaultValue if this map contains 
		// no mapping for the key. 
		// In this case, since "Samsung" is a key in the map, it will return its associated value (1).
		//syntax: map.getOrDefault(key, defaultValue)
		map.getOrDefault("Samsung", null);
		map.getOrDefault("Nokia", null); // returns null because "Nokia" is not a key in the map
		
		System.out.println("Value for key 'Samsung' using getOrDefault: " + map.getOrDefault("Samsung", null));
		System.out.println("Value for key 'Nokia' using getOrDefault: " + map.getOrDefault("Nokia", null));
		
		// putIfAbsent() method inserts the specified key-value pair into the map only if the key is not already present.
		// If the key is already present, the method does not modify the map and returns the existing value associated with the key.
		// In this case, since "Apple" is already a key in the map, putIfAbsent will not change the value associated with "Apple" and will return 2.
		//syntax: map.putIfAbsent(key, value)
		map.putIfAbsent("Apple", 10); // does not change the value for "Apple" because it is already present
		map.putIfAbsent("Nokia", 6); // adds "Nokia" to the map because it is not already present
		
		System.out.println("HashMap after putIfAbsent: " + map);
		
		// loadRatio() method returns the load factor of the hash map, which is the ratio of the number of entries to the capacity of the hash table.
		// The load factor is a measure of how full the hash table is. A higher load factor means more entries are stored in the hash table, which can lead to more collisions and slower performance.
		// In Java's HashMap, the default load factor is 0.75, which means that when the number of entries exceeds 75% of the capacity, the hash table will be resized to maintain performance.
		
		// load ratio = number of entries / capacity of the hash table
		// example: if the hash table has a capacity of 16 and there are 5 entries, the load factor would be 5/16 = 0.3125
		map.size(); // returns the number of entries in the map, which is 6 after adding "Nokia"
		
		System.out.println("Load factor of the HashMap: " + ((float) map.size() / 16)); // assuming default capacity of 16
		
		
	}

}
