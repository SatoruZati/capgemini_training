package capgemini_04022026;

public class EnumsImplementation {
	
	enum Day {
		// explanation: enum constants
		// SUNDAY is assigned ordinal 0, i.e. its position in the enum declaration
		// is 0-based index. And so on for other days.
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	
	enum Planets {
		// explanation: enum with fields and constructor
		// Each planet is associated with its order from the sun, which is represented as an integer.
		// Mercury(1) means Mercury is the 1st planet from the sun, Venus(2) is the 2nd, and so on.
		// structural breakdown: enum constants with parameters, field to hold the parameter, constructor to initialize the field, and a method to retrieve the field value.
		// i.e. Mercury(1) is an enum constant with a parameter, orderFromSun is the field, the constructor initializes the field, and getOrderFromSun() retrieves the field value.
		Mercury(1), Venus(2), Earth(3), Mars(4), Jupiter(5), Saturn(6), Uranus(7), Neptune(8);
		
		private int orderFromSun;
		
		// Constructor for the enum, called when each constant is created
		Planets(int order) {
			this.orderFromSun = order;
		}
		
		public int getOrderFromSun() {
			return orderFromSun;
		}
	}

	public static void main(String[] args) {
		// enum usage example
		Day today = Day.WEDNESDAY;
		System.out.println("Today is: " + today);
		System.out.println("Ordinal value of today: " + today.ordinal());

		System.out.println("All Days:");
		for (Day d : Day.values()) {
			System.out.println(d + " is day number " + d.ordinal() + " of the week.");
		}
		
		System.out.println("--------------------------------------------");
		
		Planets planet = Planets.Earth;
		System.out.println("Planet: " + planet);
		System.out.println("Order from the Sun: " + planet.getOrderFromSun());
		System.out.println("Ordinal value of planet: " + planet.ordinal());
		System.out.println("All Planets:");
		for (Planets p : Planets.values()) {
			System.out.println(p + " is planet number " + p.getOrderFromSun() + " from the Sun.");
		}

	}

}
