package capgemini_15012026;

// STRING AND STRING BUILDER

// String is a class as well as an object
// String Builder is a class that is used to create mutable strings

// Inheritance:
// String class inherits from Object class  
// String Builder class inherits from AbstractStringBuilder class which in turn inherits from Object class
// Both String and String Builder classes are part of java.lang package

// Inherited Methods:
// Both String and String Builder classes inherit methods from Object class such as toString(), equals(), hashCode(), etc.
// String class also inherits methods from CharSequence interface such as length(), charAt(), subSequence(), etc.
// String Builder class inherits methods from Appendable interface such as append(), etc.

// Inheritence concept is used to achieve code reusability and method overriding in both String and 
// String Builder classes. This allows us to create new classes based on existing classes and
// modify their behavior as needed.

// String is a group or collection of characters
// String is enclosed in double quotes (" ")
// Example: String str = "Hello World";

// String is immutable (cannot be changed)
// String Builder is mutable (can be changed)

// String Builder is faster than String when it comes to modifications

// String is used when we have a fixed set of characters
// String Builder is used when we have a dynamic set of characters

// For every java class there is a parent class called Object class
// String class is a child class of Object class
// String Builder class is also a child class of Object class

// String extends Object class
// String Builder extends AbstractStringBuilder class which extends Object class

// String implements Serializable, Comparable<String>, CharSequence, etc
// String Builder implements Serializable, CharSequence, Appendable, etc.

// lang package contains String and String Builder classes
// java.lang package is imported by default in every Java program

// If object is already created then we can not change the value of that object
// We can create a new object with the new value.
// In string we can not change the value of the existing object. 
// In String Builder we can change the value of the existing object itself.

// Overriding toString() method in String class returns the string representation of the object
// Overriding toString() method in String Builder class also returns the string representation of the object

// String class has many methods like length(), charAt(), substring(), indexOf(), etc.
// String Builder class has methods like append(), insert(), delete(), reverse(), etc.

// toString() method in String class returns the same string, 
// equals() method compares the content of two strings
// hashCode() method returns the hash code of the string object

// String is an example of constructor overloading, it has multiple constructors. For example:
// String() - creates an empty string
// String(String original) - creates a string with the value of the original string
// String(char[] value) - creates a string from a character array

// String Builder also has multiple constructors. For example:
// StringBuilder() - creates an empty string builder
// StringBuilder(int capacity) - creates a string builder with the specified capacity
// StringBuilder(String str) - creates a string builder with the value of the specified string
// StringBuilder(CharSequence seq) - creates a string builder with the value of the specified character sequence

// String Builder class is not synchronized, hence it is not thread-safe
// String class is immutable and thread-safe

// String Constant Pool Area (SCP):
// String literals are stored in a special memory area called String Constant Pool (SCP)
// When a string literal is created, the JVM checks the SCP first to see if the string already exists
// If it exists, a reference to the existing string is returned
// If it does not exist, a new string is created in the SCP and a reference to it is returned
// String has an index based structure where each character has an index starting from 0 
// SCP uses String address to manage memory efficiently

// when we update a string, a new object is created in the heap memory and 
// the reference is updated to point to the new object. 
// The existing object remains in the SCP until it is garbage collected.
// This is because strings are immutable and cannot be changed once created.
// Hence, any modification to a string results in the creation of a new string object.

// if we have two strings S1 and S2 with the same value,
// both S1 and S2 will point to the same memory location in the SCP.
// Because no duplicate values are allowed in the SCP. To save memory.

// In String class there are: 
// 11 non static method and 1 non argumented constructor in String class
// in them we can override only 3 methods from Object class
// toString(), equals(), hashCode()
//////////////////////////////////////////////////////////////////////////////////////////////
// getclass() method is final in Object class, getmethod() is final in String class
// getName() method is final in Object class, getName() is final in String class
// so we can not override them in String class
///////////////////////////////////////////////////////////////////////////////////////////////
// methods in String class:
// toString() method in String class returns the same string
// equals() method compares the content of two strings
// hashCode() method returns the hash code of the string object
// length() method returns the length of the string
// charAt() method returns the character at a specific index
// substring() method returns a substring of the string
// indexOf() method returns the index of a specific character or substring
// concat() method concatenates two strings
// replace() method replaces a specific character or substring with another character or substring
// toLowerCase() method converts the string to lowercase
// toUpperCase() method converts the string to uppercase
// trim() method removes leading and trailing whitespace from the string
// startsWith() method checks if the string starts with a specific prefix
// endsWith() method checks if the string ends with a specific suffix
// split() method splits the string into an array of substrings based on a specific delimiter
// valueOf() method converts different data types to a string representation
// format() method formats the string based on a specific format specifier
// intern() method returns the canonical representation of the string from the string pool
// compareTo() method compares two strings lexicographically
// isEmpty() method checks if the string is empty
// contains() method checks if the string contains a specific sequence of characters
// replaceAll() method replaces all occurrences of a specific regex pattern with another string
// replaceFirst() method replaces the first occurrence of a specific regex pattern with another string
// matches() method checks if the string matches a specific regex pattern
// toCharArray() method converts the string to a character array
// getBytes() method converts the string to a byte array
// compareToIgnoreCase() method compares two strings lexicographically, ignoring case differences
// regionMatches() method checks if two regions of the string match
// offsetByCodePoints() method returns the index within the string that is offset by a specific number of code points
// codePointAt() method returns the Unicode code point at a specific index
// codePointBefore() method returns the Unicode code point before a specific index
// codePointCount() method returns the number of Unicode code points in a specific range of the string
// subSequence() method returns a subsequence of the string as a CharSequence
// repeat() method returns a new string that is a repetition of the original string a specified number of times
// strip() method removes leading and trailing whitespace from the string using Unicode whitespace definition
// stripLeading() method removes leading whitespace from the string using Unicode whitespace definition
// stripTrailing() method removes trailing whitespace from the string using Unicode whitespace definition
// indent() method adds indentation to each line of the string
// transform() method applies a function to the string and returns the result
// describeConstable() method returns an Optional containing a String description of the string
// resolveConstantDesc() method resolves a constant description to a String object
// and many more...