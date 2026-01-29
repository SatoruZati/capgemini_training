package capgemini_29012026;

//// what is method shadowing?
//// method shadowing is a feature in java where a subclass can define a method with the same name and signature as a method in its superclass.
//// example:
//class Parent {
//	void display() {
//		System.out.println("Parent display method");
//	}
//}
//
//class Child extends Parent {
//	void display() {
//		System.out.println("Child display method");
//	}
//}
//
//// output:
//// Parent p = new Child();
//// p.display(); // Child display method
//// here, the display method in the Child class shadows the display method in the Parent class.
//// when we call the display method on the Parent reference, the Child's display method is invoked.
//// this is known as method shadowing.
//
//

// getting in depth of collections framework

// List
// - Ordered collection (also known as a sequence)
// - Can contain duplicate elements
// - Elements can be accessed by their integer index (position in the list)
// - Dynamic in size
// - Allows multiple null elements
// - List allows positional access and insertion of elements, i.e. random access
// - Common implementations: ArrayList, LinkedList, DoubleLinkedList

// Set
// - Unordered collection
// - Cannot contain duplicate elements
// - Common implementations: HashSet, TreeSet
// - Allows a single null element (HashSet), no null elements (TreeSet)
// - Does not maintain any order (HashSet), or maintains sorted order (TreeSet)
// - Used for storing unique elements

// Map
// - Collection of key-value pairs
// - Keys must be unique
// - Common implementations: HashMap, TreeMap
// - Allows one null key and multiple null values (HashMap)
// - Does not maintain any order (HashMap), or maintains sorted order based on keys (TreeMap)
// - Used for storing data in key-value pairs

// Queue
// - Collection used to hold multiple elements prior to processing
// - Typically follows FIFO (First In First Out) principle
// - Common implementations: LinkedList, PriorityQueue
// - Used in scenarios like task scheduling, order processing
// - Allows null elements (LinkedList)
// - Does not allow null elements (PriorityQueue)
// - Used for storing elements in a specific order for processing

// non-linear collections
// - Collections that do not store elements in a linear order
// - Examples: Trees (e.g., Binary Search Tree, AVL Tree), Graphs

// linear collections
// - Collections that store elements in a linear order
// - Examples: Lists, Queues, Stacks

// there is an interface in java called RandomAccess
// - Marker interface to indicate that a List implementation supports fast (generally constant time) random access
// - Implemented by classes like ArrayList
// - Not implemented by classes like LinkedList
// - Helps in optimizing algorithms that require frequent access to elements by index
// - Example: If a List implements RandomAccess, algorithms can use index-based access instead of iterator-based access for better performance
// it contains no methods or fields, serves to provide run-time type information about objects
// it is an empty interface used to indicate that a class supports a specific capability
// it is used by the Java Collections Framework to optimize certain operations based on the capabilities of the collection

// any variable inside an interface is by default public, static and final
// Why we have empty interfaces in Java?
// - Marker interfaces are used to indicate that a class possesses certain properties or capabilities without defining any methods
// - They provide a way to associate metadata with a class
// - They can be used for type checking and enforcing certain behaviors at runtime
// - Tagging interfaces are a common use case for empty interfaces in Java
// - Examples: Serializable, Cloneable, RandomAccess
// - They indicate that a class can be serialized, cloned, or supports fast random access respectively
// 
// Where exactly marker interfaces are used?
// - Serialization: The Serializable interface is a marker interface that indicates that a class can be serialized
// - Cloning: The Cloneable interface is a marker interface that indicates that a class can be cloned
// - Random Access: The RandomAccess interface is a marker interface that indicates that a List implementation supports fast random access
// They are just there to provide run-time type information about objects and indicate that a class possesses certain properties or capabilities,
// without requiring the class to implement any specific methods

// Additional Tree set info:
// - TreeSet is a NavigableSet implementation based on a Red-Black tree
// - It stores elements in a sorted order based on their natural ordering or a specified comparator
// - TreeSet does not allow duplicate elements
// - Common operations like add, remove, and contains have a time complexity of O(log n)
// - No null elements are allowed in a TreeSet
// - when iterating over a TreeSet, elements are returned in sorted order
// When to use TreeSet?
// - When you need a sorted collection of unique elements
// - When you need to perform range queries or need to maintain a sorted order of elements

// Why use ArrayList instead of Array?
// - Dynamic Sizing: ArrayList can grow and shrink in size as needed, while arrays have a fixed size
// - Convenience Methods: ArrayList provides built-in methods for common operations like adding, removing, and searching for elements
// - Type Safety: ArrayList can be parameterized with generics to ensure type safety, while arrays can lead to runtime errors if not used carefully
// - Integration with Collections Framework: ArrayList is part of the Java Collections Framework, making it easier to work with other collection types and algorithms

// 