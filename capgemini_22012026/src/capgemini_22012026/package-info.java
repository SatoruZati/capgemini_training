package capgemini_22012026;

// Collection framework package

// In Java, Collection Framework is a unified architecture that provides 
// a set of classes and interfaces to store and manipulate groups of objects. 
// It includes data structures like lists, sets, maps, and queues, along with 
// algorithms for sorting and searching. 

// The Collection Framework simplifies data handling and improves code efficiency 
// by providing ready-to-use implementations for common data operations.

// Some commonly used interfaces in the Collection Framework are:
// 1. Collection
// 2. List
// 3. Set
// 4. Map
// 5. Queue
// 6. Deque
// 7. Iterator
// 8. Comparable
// 9. Comparator
// 10. SortedSet
// 11. SortedMap
// 12. NavigableSet
// 13. NavigableMap
// 14. RandomAccess
// 15. Cloneable
// 16. Serializable
// 17. Enumeration
// 18. Spliterator
// 19. Iterable
// 20. Dictionary
// 21. ListIterator
// 22. WeakHashMap
// 23. IdentityHashMap
// 24. LinkedHashMap
// 25. TreeMap
// 26. HashMap

// Some commonly used classes in the Collection Framework are:
// 1. ArrayList
// 2. LinkedList
// 3. HashSet
// 4. TreeSet
// 5. HashMap
// 6. TreeMap
// 7. LinkedHashSet
// 8. LinkedHashMap
// 9. PriorityQueue
// 10. Stack
// 11. Vector
// 12. Hashtable
// 13. Arrays
// 14. Collections
// 15. EnumSet
// 16. EnumMap
// 17. BitSet

// Collection is a interface present in java.util package. It is the root interface
// of the collection hierarchy. It defines the basic operations that can be performed
// on collections, such as adding, removing, and iterating over elements.

// Collection Hierarchy and Map Hierarchy are two separate hierarchies in the Java Collection Framework.

// Iterable is a interface present in java.lang package. It is the root interface
// Collection Hierarchy. It defines a single method, iterator(), which returns an Iterator 
// object that can be used to iterate over the elements in the collection.

// List. Set and Queue are subinterfaces of Collection interface.

// Map is a separate interface in the Collection Framework that represents a collection
// of key-value pairs. It allows for the storage and retrieval of values based on unique keys.
// Map does not extend the Collection interface, but it is considered part of the 
// Collection Framework.

// Under List, we have ArrayList, LinkedList, Vector and Stack classes.
// Under Set, we have HashSet, LinkedHashSet and TreeSet classes.
// Under Queue, we have PriorityQueue and Deque interfaces.
// Under Map, we have HashMap, LinkedHashMap and TreeMap classes.
// 

// Abstract methods to perform task
// add(Object o);
// addAll(Collection c);
// remove(Object o);
// removeAll(Collection c);
// retainAll(Collection c);
// contains(Object o);
// containsAll(Collection c);
// size();
// isEmpty();
// clear();
// toArray();
// iterator();
// spliterator();
// stream();

// What are these methods used for?
// These methods are used to perform various operations on collections in Java.
// For example, add() is used to add an element to a collection, remove() is used to remove an element,
// contains() is used to check if a collection contains a specific element, size() returns the number of elements
// in the collection, isEmpty() checks if the collection is empty, clear() removes all elements from the collection,
// toArray() converts the collection to an array, iterator() returns an iterator for the collection,
// spliterator() returns a spliterator for the collection, and stream() returns a stream for the collection.

// These methods provide a standardized way to manipulate and interact with collections in Java, 
// 

// what does retainAll(Collection c) do?
// The retainAll(Collection c) method is used to retain only the elements in the collection 
// that are also present in the specified collection c.
// In other words, it removes all elements from the collection that are not present in the specified collection c.

// Vector vs ArrayList
// Both Vector and ArrayList are classes in Java that implement the List interface and are used to store
// dynamic arrays. However, there are some key differences between the two:

// 1. Synchronization: Vector is synchronized, which means it is thread-safe and can be used in multi-threaded.
//    ArrayList is not synchronized, which means it is not thread-safe and should not be used in multi-threaded environments	

// 2. Performance: Because Vector is synchronized, it is generally slower than ArrayList for single-threaded operations.
//    ArrayList is faster for single-threaded operations because it does not have the overhead of synchronization.

// 3. Growth Rate: When the capacity of a Vector is exceeded, it doubles its size by default.
//    When the capacity of an ArrayList is exceeded, it increases its size by 50%.

// 4. Legacy: Vector is considered a legacy class in Java and is not recommended for new code.
//    ArrayList is part of the Java Collections Framework and is the preferred choice for new code.

// In summary, if you need a thread-safe collection, use Vector. If you do not need thread-safety,
// use ArrayList for better performance.

// Stack: 
// push(): Adds an item to the top of the stack.
// pop(): Removes and returns the item at the top of the stack.
// peek(): Returns the item at the top of the stack without removing it.
// isEmpty(): Checks if the stack is empty.
// search(Object o): Returns the position of the object in the stack.
// size(): Returns the number of items in the stack.

// Vector:
// add(Object o): Adds an item to the end of the vector.
// remove(Object o): Removes the first occurrence of the specified item from the vector.
// get(int index): Returns the item at the specified index.
// set(int index, Object o): Replaces the item at the specified index with the specified item.
// size(): Returns the number of items in the vector.

// ArrayList:
// add(Object o): Adds an item to the end of the list.
// remove(Object o): Removes the first occurrence of the specified item from the list.
// get(int index): Returns the item at the specified index.
// set(int index, Object o): Replaces the item at the specified index with the specified item.
// size(): Returns the number of items in the list.
//

// Overall, Stack is used for LIFO operations, while Vector and ArrayList are used for dynamic arrays.

// Linked List vs ArrayList
// 1. Data Structure: ArrayList is based on a dynamic array, while LinkedList is based on a doubly linked list.
// 2. Memory Usage: ArrayList uses less memory than LinkedList because it stores elements in a contiguous block of memory.
// 3. Access Time: ArrayList provides faster access time for elements because it uses an index-based approach,
//    while LinkedList requires traversal of the list to access elements.
// 4. Insertion/Deletion: LinkedList provides faster insertion and deletion of elements because it only requires
//    updating the pointers of the adjacent nodes, while ArrayList requires shifting of elements.
// 5. Use Cases: ArrayList is preferred when frequent access to elements is required, while LinkedList is preferred
//    when frequent insertion and deletion of elements is required.

// Linked List 
// methods:
// add(Object o): Adds an item to the end of the list.
// addFirst(Object o): Adds an item to the beginning of the list.
// addLast(Object o): Adds an item to the end of the list.
// remove(Object o): Removes the first occurrence of the specified item from the list.
// removeFirst(): Removes and returns the first item from the list.
// removeLast(): Removes and returns the last item from the list.
// get(int index): Returns the item at the specified index.
// getFirst(): Returns the first item in the list.
// getLast(): Returns the last item in the list.
// size(): Returns the number of items in the list.

// LinkedList types:
// Singly Linked List: Each node contains a reference to the next node in the list.
// Doubly Linked List: Each node contains references to both the next and previous nodes in the list.
// Circular Linked List: The last node in the list points back to the first node, creating a circular structure.
// Circular Doubly Linked List: The last node points to the first node and the first node points to the last node,
// 						 creating a circular structure with references in both directions.
// 

