package capgemini_22012026;
import java.util.*;

public class more_collection_framework {

	public static void main(String[] args) {
		// Collection Framework More Examples
		
		// use List Interface
		List arrlist = new ArrayList();
		arrlist.add("Red");
		arrlist.add(17);
		arrlist.add("Green");
		arrlist.add("Yellow");
		arrlist.add(9);
		arrlist.add(null);
		arrlist.add(10);
		arrlist.add(12);
		arrlist.add("Blue");
		
		System.out.println("List: " + arrlist);
		System.out.println("------------------------------------------");
		
		// use add method
		arrlist.add("Orange");
		// add element at specific index
		arrlist.add(2, 25);
		// structure of add method: add(int index, Object element)
		
		System.out.println("After Addition: " + arrlist);
		System.out.println("------------------------------------------");
		
		// addAll method
		List new_elements = new ArrayList();
		new_elements.add("Cheetah");
		new_elements.add("Elephant");
		new_elements.add("Tiger");
		arrlist.addAll(new_elements);
		
		// addAll at specific index
		arrlist.addAll(3, new_elements);
		// structure of addAll method: addAll(int index, Collection c)
		System.out.println("New Elements: " + new_elements);
		System.out.println("After addAll at index 3: " + arrlist);
		System.out.println("------------------------------------------");
		
		System.out.println("After addAll: " + arrlist);
		System.out.println("------------------------------------------");
		
		// remove method
		arrlist.remove("Yellow");
		System.out.println("After Removal: " + arrlist);
		System.out.println("------------------------------------------");
		
		// removeAll method
		arrlist.removeAll(new_elements);
		// structure of removeAll method: removeAll(Collection c)
		System.out.println("After removeAll: " + arrlist);
		System.out.println("------------------------------------------");
		
		// retainAll method
		arrlist.retainAll(new_elements);
		System.out.println("After retainAll: " + arrlist);
		System.out.println("------------------------------------------");
		
		// Collection remove vs List remove
		// Collection remove(Object o) removes the first occurrence of the specified element from the collection.
		// List remove(int index) removes the element at the specified position in the list.
		// Example:
		List numlist = new ArrayList();
		numlist.add(10);
		numlist.add(25);
		numlist.add(33);
		numlist.add(17);
		numlist.add(9);		
		numlist.add(12);
		numlist.add(33);
		numlist.add(4);
		numlist.add(8);	
		numlist.add(20);
		numlist.add(33);
		System.out.println("Number List: " + numlist);
		
		numlist.remove(1); // removes element at index 1 (25)
		System.out.println("After Removing index 1: " + numlist);
		
		numlist.remove(Integer.valueOf(20)); // removes the first occurrence of 20
		System.out.println("After Removing element 20: " + numlist);
		
//		numlist.remove(-1); // throws IndexOutOfBoundsException
//		System.out.println("After Trying to Remove index -1: " + numlist);
//		System.out.println("------------------------------------------");
		
		// removeAll one element
		List elements_to_remove = new ArrayList();
		elements_to_remove.add(33);
		// structure of removeAll method: removeAll(Collection c)
		numlist.removeAll(elements_to_remove);
		System.out.println("After Removing All 33s: " + numlist);
		System.out.println("------------------------------------------");
		
		// get method
		Object element_at_index_3 = numlist.get(3);
		System.out.println("Element at index 3: " + element_at_index_3);
		System.out.println("------------------------------------------");
		
		// set method
		numlist.set(2, 99); // sets element at index 2 to 99
		System.out.println("After Setting index 2 to 99: " + numlist);
		System.out.println("------------------------------------------");
		
		// indexOf method
		int index_of_9 = numlist.indexOf(9);
		// structure of indexOf: indexOf(Object o)
		System.out.println("Index of 9: " + index_of_9);
		System.out.println("------------------------------------------");
		
		// lastIndexOf method
		int last_index_of_33 = numlist.lastIndexOf(33);
		// structure of lastIndexOf: lastIndexOf(Object o)
		System.out.println("Last Index of 33: " + last_index_of_33);
		System.out.println("------------------------------------------");
	}

}
