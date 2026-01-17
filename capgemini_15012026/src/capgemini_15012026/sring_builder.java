package capgemini_15012026;

public class sring_builder {

	static void length_character(){
		
		// print length and all characters of a string
		String st = "Kevin De Bruyne";
		System.out.println("Length of the string: " + st.length());
		System.out.print("Characters in the string: ");
		for (int i = 0; i < st.length(); i++) {
			System.out.print(st.charAt(i) + " ");
		}

		// OR

		System.out.println("\nUsing toCharArray(): ");
		char[] charArray = st.toCharArray();
		for (char c : charArray) {
			System.out.print(c + " ");
		}	
	}

	static boolean isUniqueChars(String str) {
		// function to check if all characters in a string are unique
		boolean[] charSet = new boolean[256]; // assuming ASCII character set
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charSet[val]) {
				return false; // character already found in string
			}
			charSet[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		// Questions to be done without string buffer or builder but with String only
		length_character();

		//check two strings are anagram or not
		// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase
		// Example: "listen" and "silent" are anagrams. Because they contain the same letters in a different order.
		String str1 = "listen";
		String str2 = "silent";
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		java.util.Arrays.sort(charArray1);
		java.util.Arrays.sort(charArray2);

		boolean isAnagram = java.util.Arrays.equals(charArray1, charArray2);
		if (isAnagram) {
			System.out.println("\n" + str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println("\n" + str1 + " and " + str2 + " are not anagrams.");
		}

		// longest substring in string 
		String str = "abcaddbcbdbaacadbcbbdcdad";
		String longestSubstr = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substr = str.substring(i, j);
				if (isUniqueChars(substr) && substr.length() > longestSubstr.length()) {
					longestSubstr = substr;
				}
			}
		}

		System.out.println("Longest substring with all unique characters: " + longestSubstr);


	}
}
