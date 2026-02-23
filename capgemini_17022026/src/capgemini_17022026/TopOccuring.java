package capgemini_17022026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TopOccuring {

	public static int[] findTopOccurring(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println(map);

		// descending sorting of the map based on values
		
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		// System.out.println(list);
		
		// with lambda expression
		Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
		
//		System.out.println(list);
		
		return list.stream().limit(k).mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 2, 1, 3, 2, 2};
		int k = 2;
		int[] result = findTopOccurring(arr, k);
		
		System.out.print("Top " + k + " occurring elements: ");
		for (int num : result) {
			System.out.print(num + " ");
		}		
		
	}
}
