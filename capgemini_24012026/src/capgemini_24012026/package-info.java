package capgemini_24012026;

// Day 13: Collections Framework - Sets
// Date: 24/01/2026

// Topics Covered:
// 1. Set Interface Introduction
//    - Part of Java Collections Framework
//    - Does NOT allow duplicate elements
//    - Does NOT maintain insertion order (except LinkedHashSet)
//    - Models mathematical set abstraction
//    - Extends Collection interface

// 2. HashSet Implementation and Characteristics
//    - Uses hash table (HashMap internally) to store elements
//    - No duplicate elements allowed
//    - Does NOT maintain any order of elements
//    - Allows one null element
//    - Fast performance for basic operations (add, remove, contains)
//    - Internal working:
//      * Calculates hash code of each element
//      * Determines bucket location based on hash code
//      * Handles collisions using linked lists or trees

// 3. LinkedHashSet for Ordered Sets
//    - Extends HashSet
//    - Maintains insertion order using a doubly-linked list
//    - Slightly slower than HashSet due to maintaining order
//    - Useful when iteration order matters
//    - Same characteristics as HashSet (no duplicates, allows null)

// 4. TreeSet and Sorted Sets
//    - Implements NavigableSet interface
//    - Uses Red-Black tree data structure for storage
//    - Stores elements in SORTED order (natural ordering or custom comparator)
//    - Does NOT allow null elements
//    - Slower performance than HashSet (O(log n) vs O(1))
//    - Elements must implement Comparable OR provide Comparator
//    - Maintains sorted order automatically

// 5. NavigableSet Interface and Methods
//    - Extends SortedSet interface
//    - Provides navigation methods:
//      * lower(E e) - Returns greatest element strictly less than given element
//      * floor(E e) - Returns greatest element less than or equal to given element
//      * ceiling(E e) - Returns least element greater than or equal to given element
//      * higher(E e) - Returns least element strictly greater than given element
//      * pollFirst() - Retrieves and removes first (lowest) element
//      * pollLast() - Retrieves and removes last (highest) element
//      * descendingSet() - Returns reverse order view of the set

// 6. Set Operations (add, remove, contains, size)
//    - add(E e) - Adds element if not already present, returns boolean
//    - remove(Object o) - Removes specified element if present
//    - contains(Object o) - Checks if set contains element
//    - size() - Returns number of elements
//    - isEmpty() - Checks if set is empty
//    - clear() - Removes all elements
//    - iterator() - Returns iterator for traversal

// 7. Difference between HashSet, LinkedHashSet, and TreeSet
//    Feature          | HashSet           | LinkedHashSet     | TreeSet
//    -------------------------------------------------------------------------------
//    Order            | No order          | Insertion order   | Sorted order
//    Performance      | O(1)              | O(1)              | O(log n)
//    Null elements    | One null allowed  | One null allowed  | Not allowed
//    Internal DS      | Hash table        | Hash table + DLL  | Red-Black tree
//    When to use      | Fast operations   | Maintain order    | Sorted data

// 8. Working with Custom Objects in Sets (Employee class example)
//    - Must override hashCode() and equals() for HashSet/LinkedHashSet
//    - Must implement Comparable or provide Comparator for TreeSet
//    - Example: Employee class sorted by salary using Comparable
//    - Custom comparators for different sorting criteria

// 9. Red-Black Tree Data Structure in TreeSet
//    - Self-balancing binary search tree
//    - Ensures O(log n) time complexity for operations
//    - Each node has a color (red or black)
//    - Maintains balance through rotations and color flips
//    - Guarantees that tree height stays logarithmic

// Key Concepts:
// - Sets are ideal when uniqueness is required
// - Choose implementation based on ordering needs and performance requirements
// - HashSet for best performance, TreeSet for sorted data, LinkedHashSet for order preservation