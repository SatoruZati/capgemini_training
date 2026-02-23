package capgemini_07022026;

public class AnagramValid {
	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";
		
		boolean isAnagram = false;
		
		// sorting the strings
		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		
		java.util.Arrays.sort(charArray1);
		java.util.Arrays.sort(charArray2);
		
		if (java.util.Arrays.equals(charArray1, charArray2)) {
			isAnagram = true;
		}
		if (isAnagram) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
}
