package capgemini_21012026;

public class throw_keyword {
	
	// Custom Exception class
	static class AgeMismatchException extends RuntimeException {
		public AgeMismatchException(String message) {
			super(message);
		}
	}
	
	public static void validateAge(int age) {
		if (age < 10) {
			throw new AgeMismatchException("Age must be 10 or older.");
		} else {
			System.out.println("Age is valid: " + age);
		}
	}

	public static void main(String[] args) {
		// Custom Exception using throw keyword
		try {
			validateAge(15); // This will throw AgeMismatchException
		} catch (AgeMismatchException e) {
			System.out.println("Custom Exception caught: " + e.getMessage());
		}

	}

}
