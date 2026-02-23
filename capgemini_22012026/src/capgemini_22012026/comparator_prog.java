package capgemini_22012026;

import java.util.Comparator;
import java.util.ArrayList;

public class comparator_prog {

	public static void main(String[] args) {
		// Comparator 

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(66);
		marks.add(72);
		marks.add(57);
		marks.add(85);
		marks.add(92);
		marks.add(78);
		marks.add(90);
		marks.add(88);
		marks.add(95);
		System.out.println("Marks before sorting: " + marks);
		
		Comparator<Integer> ascendingOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer mark1, Integer mark2) {
				return mark1 - mark2; // Ascending order
			}
		};
		
		marks.sort(ascendingOrder);
		System.out.println("Marks after sorting in ascending order: " + marks);
		
		Comparator<Integer> descendingOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer mark1, Integer mark2) {
				return mark2 - mark1; // Descending order
			}
		};
		
		marks.sort(descendingOrder);
		System.out.println("Marks after sorting in descending order: " + marks);

	}

}
