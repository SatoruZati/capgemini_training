package capgemini_27012026;

import java.util.HashMap;

public class maps_java {

	public static void main(String[] args) {
		// maps in java
		// create map interface object using HashMap class
		HashMap<Integer, String> map = new HashMap<>();
		
		// add key value pair to map using put() method
		map.put(1, "Manuel Neuer");
		map.put(7, "Cristiano Ronaldo");
		map.put(10, "Lionel Messi");
		map.put(4, "Sergio Ramos");
		map.put(11, "Neymar Jr");
		map.put(2, "Carvajal");
		map.put(9, "Benzema");
		map.put(8, "Toni Kroos");
		map.put(99, "Donarumma");
		map.put(10, "Modric"); // duplicate value allowed, key 10 will be updated to "Modric"
		
		// print map
		System.out.println("Map: " + map);
		
		// get value from map using get() method
		String player = map.get(7);
		System.out.println("Player with key 7: " + player);
		
		// remove key value pair from map using remove() method
		map.remove(99);
		System.out.println("Map after removing key 99: " + map);
		
		// check if key exists in map using containsKey() method
		boolean hasKey10 = map.containsKey(10);
		System.out.println("Map contains key 10: " + hasKey10);
		
		boolean hasKey99 = map.containsKey(99);
		System.out.println("Map contains key 99: " + hasKey99);
		
		// get size of map using size() method
		int size = map.size();
		System.out.println("Size of map: " + size);
		
		// entry set of map using entrySet() method
		System.out.println("Entry set of map: " + map.entrySet());
		
		// for each loop to iterate over map
		System.out.println("Iterating over map using for each loop:");
		for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		// get key set of map using keySet() method
		System.out.println("Key set of map: " + map.keySet());
		
		// get values of map using values() method
		System.out.println("Values of map: " + map.values());
		
		// getKeys and Values using lambda expression
		System.out.println("Keys and Values using lambda expression:");
		map.forEach((key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
		});
		
		// isEmpty() method to check if map is empty
		boolean isEmpty = map.isEmpty();
		
		// add 2 new key value pairs using put() method
		map.put(5, "Zinedine Zidane");
		map.put(17, "Kevin De Bruyne");
		
		// replace value for key 5 using replace() method
		map.replace(5, "Jude Bellingham");
		System.out.println("Map after adding new key value pairs and replacing value for key 5: " + map);
		
		// containsValue() method to check if value exists in map
		boolean hasValueRonaldo = map.containsValue("Cristiano Ronaldo");
		System.out.println("Map contains value 'Cristiano Ronaldo': " + hasValueRonaldo);
		
		// containsKey() method to check if key exists in map
		boolean hasKey4 = map.containsKey(4);
		System.out.println("Map contains key 4: " + hasKey4);
		
		// clear() method to remove all key value pairs from map
		map.clear();
		System.out.println("Map after clearing all key value pairs: " + map);
		// output should be empty map

	}

}
