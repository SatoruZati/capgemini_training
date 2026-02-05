package capgemini_04022026;

// Enums in Java are a special data type that enables for a variable to be a set 
// of predefined constants.

// Enums are used when we know all possible values at compile time, such as
// choices on a menu, rounding modes, command line flags, etc.

// Enums are more powerful than simple constants because they can have fields,
// methods, and constructors.

// Example of Enum declaration
/*
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
*/
// Enums can also have fields, methods, and constructors
/*
public enum Planets {
    Mercury(1), Venus(2), Earth(3), Mars(4), Jupiter(5), Saturn(6), Uranus(7), Neptune(8);
}
*/

/////////////////////////////////////////////////////////////////////////////////

// Hashing Algorithm
/*
 * A hashing algorithm is a function that converts an input (or 'message') into a fixed-size string of bytes.
 * The output is typically a 'digest' that is unique to each unique input.
 * Hashing is commonly used in various applications such as data integrity verification, password storage, and digital signatures.
 */

// two objects that are equal must have the same hash code
// two objects that have the same hash code are not necessarily equal
// why? because of hash collisions, i.e. different objects producing the same hash code
// why does this happen? because the range of possible hash codes is limited (e.g., 32-bit integer)

// Hashing first computes the hash code of the key using the hashCode() method
// Then, it maps the hash code to an index in an array (the hash table) using a compression function
// into a HashMap, the index is computed as: index = hashCode(key) % arraySize
// Hash Table uses linked lists or balanced trees to handle collisions at the same index


// Step by Step Hashing Process:
// 1. Compute the hash code of the key using its hashCode() method.
// 2. Map the hash code to an index in the hash table using a compression function.
// 	  <hashCode(key) % arraySize> is the common way to compute the index. i.e. index = hashCode(key) % arraySize
// 3. If the index is empty, insert the key-value pair.
// 4. If the index is occupied, check if the key already exists:
//    - If it exists, update the value.
//    - If it doesn't exist, add the new key-value pair to the list/tree at that index.
// 5. To retrieve a value, repeat steps 1 and 2 to find the index, then search the list/tree at that index for the key.

/////////////////////////////////////////////////////////////////////////////////

// Hashing converts data into linked lists or balanced trees for efficient storage and retrieval in hash tables.

// To avoid Hashing Collisions:
// 1. Use a good hash function that distributes keys uniformly across the hash table.
// 2. Choose an appropriate size for the hash table, preferably a prime number.
// 3. Implement collision resolution techniques like chaining (linked lists) or open addressing.
// 4. Monitor the load factor (number of entries / table size) and resize the table when it exceeds a certain threshold (e.g., 0.7).
// 5. Use a well-designed hash function to minimize collisions and ensure a uniform distribution of keys.
// 6. Regularly rehash the table when the load factor exceeds a certain threshold to maintain performance.
// Note: to avoid collisions, hashmaps 
// Internally equals() and hashCode() methods are used to determine object equality and compute hash codes respectively.

/////////////////////////////////////////////////////////////////////////////////

