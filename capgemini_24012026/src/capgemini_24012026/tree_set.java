package capgemini_24012026;

import java.util.NavigableSet;
import java.util.TreeSet;

public class tree_set {

	public static void main(String[] args) {
		// Tree Set
		// A TreeSet is a NavigableSet that uses a Red-Black tree for storage.
		// It stores elements in a sorted order and does not allow duplicate elements.
		// The elements must implement the Comparable interface or a Comparator must be provided at set creation time.
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(9);
		treeSet.add(17);
		treeSet.add(8);
		treeSet.add(10);
		treeSet.add(4);
		treeSet.add(7);
		treeSet.add(12);
		treeSet.add(33);
		System.out.println("TreeSet: " + treeSet);
		System.out.println("Size of TreeSet: " + treeSet.size());
		System.out.println("Is TreeSet empty? " + treeSet.isEmpty());
		System.out.println("Does TreeSet contain '10'? " + treeSet.contains(10));
		treeSet.remove(33);
		System.out.println("TreeSet after removing '33': " + treeSet);
		System.out.println("Size of TreeSet after removal: " + treeSet.size());
		System.out.println("---------------------------------------------------");
		
		// comparator and comparable with tree set
		// Example of using Comparable with TreeSet
		NavigableSet< Employee.ComparableEmployee> employeeSet = new TreeSet<>();
		employeeSet.add(new Employee.ComparableEmployee(1, "Alice", 70000, "HR", true));
		employeeSet.add(new Employee.ComparableEmployee(2, "Bob", 60000, "IT", true));
		employeeSet.add(new Employee.ComparableEmployee(3, "Charlie", 80000, "Finance", true));
		System.out.println("Employee TreeSet (sorted by salary): " + employeeSet);
		
	}

}
