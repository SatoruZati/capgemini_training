package DSA;

// Day 15: DSA Fundamentals and Advanced String Handling
// Date: 29/01/2026

// Topics Covered:
// 1. Data Structures and Algorithms (DSA) Introduction
//    - Understanding the importance of DSA in problem-solving
//    - Basic algorithmic thinking and problem decomposition
//    - Array manipulation and transformations
//    - Practical exercises: extracting digits, reversing arrays

// 2. Time and Space Complexity Analysis
//    - Big O notation for analyzing algorithm efficiency
//    - Time complexity: how execution time grows with input size
//    - Space complexity: how memory usage grows with input size
//    - Common complexities: O(1), O(log n), O(n), O(n log n), O(n²)
//    - Best case, average case, and worst case scenarios

// 3. Array Operations and Algorithms
//    - Array traversal and manipulation
//    - Reversing arrays using loops
//    - Using Collections.reverse() utility method
//    - Extracting and transforming array elements
//    - Working with ArrayList for dynamic array operations

// 4. String Manipulation Techniques
//    - Advanced string processing methods
//    - Character extraction and analysis
//    - String building and concatenation strategies
//    - Performance considerations with String operations

// 5. StringBuilder and StringBuffer Comparison
//    - String immutability and its implications
//    - StringBuilder:
//      * NOT synchronized (not thread-safe)
//      * Faster performance in single-threaded environments
//      * Mutable - can modify without creating new objects
//      * Methods: append(), insert(), delete(), reverse(), toString()
//    
//    - StringBuffer:
//      * Synchronized (thread-safe)
//      * Slower due to synchronization overhead
//      * Mutable like StringBuilder
//      * Use in multi-threaded environments
//      * Same methods as StringBuilder
//    
//    - When to use:
//      * StringBuilder: Single-threaded applications (recommended)
//      * StringBuffer: Multi-threaded applications requiring thread safety
//      * String: When immutability is desired

// 6. Immutable Class Concepts
//    - Understanding immutability in Java
//    - Why String class is immutable
//    - Benefits of immutability: thread safety, caching, security
//    - Creating custom immutable classes
//    - Rules for immutability:
//      * Declare class as final
//      * Make all fields private and final
//      * Don't provide setter methods
//      * Initialize all fields via constructor
//      * Return copies of mutable objects

// 7. String intern() Method and Memory Management
//    - String pool in Java memory
//    - How intern() works:
//      * Checks if string exists in pool
//      * Returns reference if exists, adds to pool if not
//    - Memory optimization with string literals
//    - String pool vs heap memory
//    - Performance implications of intern()

// Key Concepts:
// - Choosing right data structure affects performance
// - Mutability vs Immutability trade-offs
// - Thread safety considerations in string operations
// - Memory management with string pool