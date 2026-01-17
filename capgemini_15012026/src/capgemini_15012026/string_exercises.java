package capgemini_15012026;

public class string_exercises {

	public static int countWordOccurrences(String str, String word) {
		String[] words = str.split(" "); 
		int count = 0;
		for (String w : words) {
			if (w.equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}

	public static void getIndexChars(){
		String input = "Capgemini";
		char[] chars = input.toCharArray();
		
		System.out.println("Even Indexed Characters: ");
		for (int i = 0; i < chars.length; i += 2) {
			System.out.print(chars[i]);
		}

		System.out.println("\nOdd Indexed Characters: ");
		for (int i = 1; i < chars.length; i += 2) {
			System.out.print(chars[i]);
		}
		
	}

	public static void FirstAndLastChar(String str) {
		if (str != null && str.length() > 0) {
			char firstChar = str.charAt(0);
			char lastChar = str.charAt(str.length() - 1);
			System.out.println("First Character: " + firstChar);
			System.out.println("Last Character: " + lastChar);
		} else {
			System.out.println("String is empty or null.");
		}
	}

	public static void LastFourChars(String str) {
		if (str != null && str.length() >= 4) {
			String lastFourChars = str.substring(str.length() - 4);
			System.out.println("Last 4 Characters: " + lastFourChars);
		} else {
			System.out.println("String is too short or null.");
		}

	}

	public static void main(String[] args) {
		// count word occurances in a string
		String str = "Java is a programming language Java is widely used This is a Java program";
		String wordToCount = "Java";
		int count = countWordOccurrences(str, wordToCount);
		System.out.println("The word '" + wordToCount + "' occurs " + count + " times in the given string.");
		
		// even indexed characters in a string and odd indexed characters in a string
		getIndexChars();

		// print first character and last character of a string
		String inputStr = "Capgemini Training Program";
		FirstAndLastChar(inputStr);

		// print last 4 characters in a string
		String inputStrForLastFour = "Capgemini Programs";
		LastFourChars(inputStrForLastFour);

		// 

	}

}
