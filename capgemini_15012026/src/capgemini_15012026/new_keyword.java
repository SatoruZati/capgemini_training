package capgemini_15012026;

import java.util.Arrays;

public class new_keyword {

	public static void main(String[] args) {
		// Using new keyword to create String object
		String str = new String("Hello World");
		// explanation: Here, we are using the new keyword to create a new String object in the heap memory.
		// The new keyword allocates memory for the object and returns a reference to it.

		System.out.println(str); // prints: Hello World

		String str2 = "Hello Java";
		// length method differs for String and other classes
		// In String class, length() is a method that returns the number of characters in the string.
		// In other classes like arrays, length is a property that returns the number of elements in the array.
		// For example:
		System.out.println("Length of str: " + str.length()); // prints: Length of str: 11
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Length of arr: " + arr.length); // prints: Length of arr: 5

		// string index out of bound exception
		// This exception occurs when we try to access an index that is outside the valid range of indices 
		// for a string.
		try {
			char ch = str.charAt(20); // trying to access index 20 which is out of bounds
			System.out.println("Character at index 20: " + ch);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
		}
		// output: StringIndexOutOfBoundsException caught: String index out of range: 20

		// charAT() method
		// This method returns the character at the specified index in the string.
		char ch = str.charAt(6);
		System.out.println("Character at index 6: " + ch); // prints: Character at index 6: W

		// toUpperCase() method and toLowerCase() method with str2
		System.out.println("Uppercase str2: " + str2.toUpperCase()); // prints: Uppercase str2: HELLO JAVA
		System.out.println("Lowercase str2: " + str2.toLowerCase()); // prints: Lowercase str2: hello java

		char ch100 = str2.charAt(4);
		System.out.println("Character at index 4 in str2: " + ch100); // prints: Character at index 4 in str2: o

		// substring() method
		String str03 = new String("Capgemini Training");
		String subStr = str03.substring(0, 9); // extracts substring from index 0 to 8
		System.out.println("Substring of str03: " + subStr); // prints: Substring of str03: Capgemini

		// toCharArray() method
		char[] charArray = str03.toCharArray();
		System.out.print("Character array of str03: ");

		for (char c : charArray) {
			System.out.print(c + " ");
		}

		// prints: Character array of str03: C a p g e m i n i   T r a i n i n g

		char charr [] = str2.toCharArray();
		System.out.println(Arrays.toString(charr));
		// prints: [H, e, l, l, o,  , J, a, v, a]

		// split and regex
		String str4 = "  This is a java Program ";
		String[] words = str4.trim().split(" ");
		System.out.println("Words in str4:");
		for (String word : words) {
			System.out.println(word);
		}	
		
		// prints: Words in str4:
		// This	
		// is
		// a
		// java
		// Program

		System.out.println(Arrays.toString(words));

		// prints: [This, is, a, java, Program]

		// seperating with regex using character
		String newarr [] = str4.trim().split("a");
		System.out.println(Arrays.toString(newarr));

		// prints: [This is ,  j, v, Progr, m]

		// trim method is used in the above example to remove leading and trailing spaces
		// if we do not use trim() method, the first element will have leading spaces
		// and output will be if regex is "a":
		// [  This is ,  j, v, Progr, m]

		// substring() 

		String str5 = "Put your number in my iPhone 16 Pro Max";
		String subStr2 = str5.substring(20); // extracts substring from index 20 to end
		System.out.println("Substring of str5 from index 20: " + subStr2);
		// prints: Substring of str5 from index 20: iPhone 16 Pro Max

		String subStr3 = str5.substring(4, 8); // extracts substring from index 4 to 7
		System.out.println("Substring of str5 from index 4 to 7: " + subStr3);
		// prints: Substring of str5 from index 4 to 7: your

		// contains() method
		boolean containsIphone = str5.contains("iPhone");
		System.out.println("Does str5 contain 'iPhone'? " + containsIphone);

		boolean containsPro = str5.contains(str5.charAt(25)+"Pro");	
		System.out.println("Does str5 contain 'Pro'? " + containsPro);
		
		// prints: Does str5 contain 'iPhone'? true
		// prints: Does str5 contain 'Pro'? true

		// concat() method
		String str6 = "Hello";
		String str7 = "Brother";

		String concatenatedStr = str6.concat(" ").concat(str7);
		System.out.println("Concatenated String: " + concatenatedStr);

		// prints: Concatenated String: Hello Brother

		// equals() method
		String str8 = "Test";
		String str9 = new String("Test");
		System.out.println("str8 equals str9? " + str8.equals(str9)); // prints: str8 equals str9? true
		System.out.println("str8 == str9? " + (str8 == str9)); // prints: str8 == str9? false
		// Explanation: equals() method compares the content of the strings, while '==' operator
		// compares the references (memory addresses) of the string objects. not the content.

		// equalsIgnoreCase() method
		String str10 = "hello";
		String str11 = "HELLO";
		System.out.println("str10 equalsIgnoreCase str11? " + str10.equalsIgnoreCase(str11)); 
		// prints: str10 equalsIgnoreCase str11? true
		// Explanation: equalsIgnoreCase() method compares the content of the strings ignoring case differences.

		// compareTo() method
		String str12 = "Apple";
		String str13 = "Banana";
		int comparisonResult = str12.compareTo(str13);
		System.out.println("Comparison result: " + comparisonResult); 
		// prints: Comparison result: -1
		// Explanation: compareTo() method compares two strings lexicographically.

		// indexOf() method
		String str14 = "Find the index of a character in this string";
		int index = str14.indexOf('a');	
		System.out.println("Index of 'a' in str14: " + index);
		// prints: Index of 'a' in str14: 16
		// Explanation: indexOf() method returns the index of the first occurrence of the specified character.

		// replace() method
		String str15 = "I love football";
		String modifiedStr = str15.replace("football", "formula 1");
		System.out.println("Modified String: " + modifiedStr);
		// prints: Modified String: I love formula 1
		// Explanation: replace() method replaces all occurrences of a specified substring 
		// with another substring. 
		
		// jagged array of strings
		String[][] jaggedArray = {
			{"Apple", "Banana", "Cherry"},
			{"Dog", "Elephant"},
			{"Fish", "Giraffe", "Hippo", "Iguana"}
		};
		
		System.out.println("Jagged Array of Strings:");
		
		for (int i = 0; i < jaggedArray.length; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
		// prints:
		// Jagged Array of Strings:	
		// Apple Banana Cherry
		// Dog Elephant
		// Fish Giraffe Hippo Iguana
		// Explanation: A jagged array is an array of arrays where each sub-array can have a different length.
		
	}

}
