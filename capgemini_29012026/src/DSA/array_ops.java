package DSA;

public class array_ops {

	public static void main(String[] args) {
		// suppose an array 
		/*
		Strings – Basics
Count number of characters in a string.
Count vowels and consonants.
Reverse a string.
Check whether two strings are equal.
Convert string to uppercase and lowercase.
Find length without using length().
Remove spaces from a string.
Count words in a string.
Find frequency of each character.
Check if a string is binary.
 
		*/
		
		String str = "Real Madrid is the best football club in the world";
		
		// Count number of characters in a string.
		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			charCount++;
		}
		System.out.println("Original String: " + str);
		System.out.println("Character Count: " + charCount);

		
		// Count vowels and consonants.
		int vowels = 0;
		int consonants = 0;
		String lowerStr = str.toLowerCase();
		String vowelsList = "aeiou";
		
		for (int i = 0; i < lowerStr.length(); i++) {
			char c = lowerStr.charAt(i);
			if (vowelsList.indexOf(c) != -1) {
				vowels++;
			} else if (Character.isLetter(c)) {
				consonants++;
			}
		}
		
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		
		// Reverse a string.
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}
		// Print results
		System.out.println("Reversed String: " + reversedStr);
		
		// Check whether two strings are equal.
		String str2 = "Bayern Munich thrives in Bundesliga";

		if (str.equals(str2)) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are not equal.");
		}

		// Convert string to uppercase and lowercase.
		String upperStr = str.toUpperCase();
		// alternate way to convert to uppercase without using toUpperCase()
		String upperStrAlt = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				upperStrAlt += (char)(c - ('a' - 'A'));
			} else {
				upperStrAlt += c;
			}
		}
		
		
	}
	

}
