package capgemini_22012026;

import java.util.*;

public class collections_framework {

	public static void main(String[] args) {
		// Using Collection Framework
		
		// Using ArrayList
		Collection list = new ArrayList();
		list.add("Apple");
		list.add(20);
		list.add(null);
		list.add("Banana");
		list.add(20);
		list.add(null);
		list.add("Apple");
		list.add("Orange");
		System.out.println("Collection: " + list);
		System.out.println("Size of Collection: " + list.size());
		System.out.println("------------------------------------------");
		
		// Allows multiple null values, it has indexing, it follows insertion order, allows multiple duplicate values
		
		// Using ArrayList with Generics
		ArrayList<String> football_teams = new ArrayList<String>();
		football_teams.add("Real Madrid");
		football_teams.add("Bayern Munich");
		football_teams.add("Manchester United");
		football_teams.add("Barcelona");
		football_teams.add("Liverpool");
		football_teams.add("Juventus");
		football_teams.add("Chelsea");
		football_teams.add("Arsenal");
		football_teams.add("Manchester City");
		football_teams.add("Barcelona");
		football_teams.add("Barcelona");
		football_teams.add("Tottenham Hotspur");
		System.out.println("Football Teams: " + football_teams);
		System.out.println("------------------------------------------");
		
		// addAll(Collection c);
		ArrayList<String> cricket_teams = new ArrayList<String>();
		cricket_teams.add("India");
		cricket_teams.add("Australia");
		cricket_teams.add("England");
		cricket_teams.add("South Africa");
		cricket_teams.add("New Zealand");
		System.out.println("Cricket Teams: " + cricket_teams);
		System.out.println("------------------------------------------");
		
		football_teams.addAll(cricket_teams);
		System.out.println("All Teams: " + football_teams);
		System.out.println("------------------------------------------");
		
		// remove(Object o);
		football_teams.remove("Barcelona");
		System.out.println("After Removal: " + football_teams);
		System.out.println("------------------------------------------");
		
		cricket_teams.remove("India");
		System.out.println("After Removal from Cricket Teams: " + cricket_teams);
		System.out.println("------------------------------------------");
		
		// removeAll(Collection c);
		football_teams.removeAll(cricket_teams);
		System.out.println("After Removing Cricket Teams: " + football_teams);
		System.out.println("------------------------------------------");
		
		// removeAll one element
		ArrayList<String> teams_to_remove = new ArrayList<String>();
		teams_to_remove.add("Barcelona");
		football_teams.removeAll(teams_to_remove);
		System.out.println("After Removing One Element (Barcelona): " + football_teams);
		System.out.println("------------------------------------------");

		ArrayList<String> items_to_remove = new ArrayList<String>();
		items_to_remove.add("Apple");
		list.removeAll(items_to_remove);
		System.out.println("After Removing One Element (Apple) from Collection: " + list);
		System.out.println("------------------------------------------");
		
		// retainAll(Collection c);
		ArrayList<String> favorite_teams = new ArrayList<String>();
		favorite_teams.add("Real Madrid");
		favorite_teams.add("Manchester United");
		football_teams.retainAll(favorite_teams);
		System.out.println("After Retaining Favorite Teams: " + football_teams);
		System.out.println("------------------------------------------");
		
		// contains(Object o);
		boolean has_team = football_teams.contains("Real Madrid");
		System.out.println("Contains Real Madrid: " + has_team);
		System.out.println("------------------------------------------");
		
	}

}
