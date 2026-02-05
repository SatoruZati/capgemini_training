package capgemini_04022026;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		// Find duplicate elements in an array using Hashing
		int[] arr = {17, 25, 33, 9, 12, 12, 10, 4, 8, 10, 3};
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		System.out.println("Duplicate elements in the array:");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
			}
		}

	}

}
