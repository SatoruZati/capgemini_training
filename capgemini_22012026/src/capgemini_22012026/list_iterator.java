package capgemini_22012026;

import java.util.ArrayList;
import java.util.ListIterator;

public class list_iterator {

	public static void main(String[] args) {
		// List Iterator Programs
		
		// what methods are there in ListIterator?
		// forward methods: hasNext(), next() 
		// backward methods: hasPrevious(), previous()
		
		// listIterator can be used only inside the List interface
		// but Iterator can be used in both List and Set interfaces, inside Collection interface.
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Pikachu");
		list.add("Bulbasaur");
		list.add("Charmander");
		list.add("Squirtle");
		list.add("Eevee");
		list.add("Snorlax");
		list.add("Mewtwo");
		list.add("Gengar");
		list.add("Charizard");
		
		System.out.println("Traversing in forward direction:");
		ListIterator<String> li = list.listIterator();
		
		while (li.hasNext()) {
			Object element = li.next();
			if (element.equals("Eevee")) {
				li.add("Vaporeon");
			}
			if (element.equals("Snorlax")) {
				li.add("Blastoise");
			}
			System.out.println("Element: " + element);
		}
		
		li.set("Ditto"); // sets the last element returned by next() or previous() to "Ditto"
		System.out.println(list);
		System.out.println("------------------------------");

	}

}
