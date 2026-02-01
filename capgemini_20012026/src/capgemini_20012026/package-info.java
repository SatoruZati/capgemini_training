package capgemini_20012026;

// Day 10: Multilevel Inheritance and Wrapper Classes
// Date: 20/01/2026

// Topics Covered:
// 1. Multilevel Inheritance Implementation
//    - When a class is derived from a class which is also derived from another class
//    - Example: Grandparent → Parent → Child class hierarchy
//    - Each level can access methods and properties from previous levels
//    - Examples with mother, father, child classes demonstrating real-world relationships

// 2. Multiple Inheritance via Interfaces
//    - Multiple inheritance is NOT supported in Java using classes (to avoid Diamond Problem)
//    - Multiple inheritance IS supported using interfaces
//    - A class can implement multiple interfaces simultaneously
//    - Resolves ambiguity through explicit implementation

// 3. Difference between 'extends' and 'implements'
//    - extends keyword:
//      * Used for inheriting a class (single inheritance only)
//      * Example: class Dog extends Animal { }
//      * Inherits both state (fields) and behavior (methods)
//      * Can only extend one class at a time
//    
//    - implements keyword:
//      * Used for implementing an interface
//      * Example: class Dog implements Animal { }
//      * Must provide implementation for all abstract methods
//      * Can implement multiple interfaces: class Dog implements Animal, Pet { }

// 4. Wrapper Classes in Java
//    - Convert primitive data types into objects
//    - Each primitive has a corresponding wrapper class:
//      Primitive    |   Wrapper Class
//      --------------------------------
//      byte         |   Byte
//      short        |   Short
//      int          |   Integer
//      long         |   Long
//      float        |   Float
//      double       |   Double
//      char         |   Character
//      boolean      |   Boolean
//    
//    - Boxing: Converting primitive to wrapper object
//      Example: Integer intObj = Integer.valueOf(10);
//    
//    - Unboxing: Converting wrapper object back to primitive
//      Example: int num = intObj.intValue();
//    
//    - Auto-boxing/Auto-unboxing: Automatic conversion by compiler
//      Example: Integer num = 5; (auto-boxing)
//               int value = num; (auto-unboxing)

// 5. Java Object Class Methods
//    - Object class is the root of all classes in Java
//    - Every class inherits from Object class (implicitly or explicitly)
//    - Important methods:
//      * toString() - Returns string representation of object
//      * hashCode() - Returns hash code value for object
//      * equals() - Compares two objects for equality
//      * getClass() - Returns runtime class (final method, cannot override)
//      * clone() - Creates and returns a copy of object
//      * finalize() - Called by garbage collector before object destruction
//    
//    - equals() vs == operator:
//      * equals() compares content/value of objects
//      * == operator compares references/memory addresses

// 6. Type Conversion between Primitives and Objects
//    - Wrapper classes provide utility methods:
//      * parseInt(), parseDouble() - String to primitive
//      * valueOf() - String/primitive to wrapper object
//      * toString() - wrapper to String
//    - Used extensively with Collections (ArrayList, HashMap, etc.)
//    - Collections can only store objects, not primitives

