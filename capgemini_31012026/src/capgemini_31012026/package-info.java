package capgemini_31012026;

// Stack Data Structure Implementation in Java

// Hierarchical class representation
// List Interface -> Vector Class -> Stack Class

// Stack class extends Vector class
// Stack follows LIFO (Last In First Out) principle
// Main operations: push, pop, peek, isEmpty, search
// push: adds an item to the top of the stack
// pop: removes and returns the top item of the stack
// peek: returns the top item without removing it
// isEmpty: checks if the stack is empty
// search: returns the position of an item in the stack

// Stack does not allow null elements
// Stack is synchronized (thread-safe)
// Even though it is a sub-class of List it does not support all List operations
// Stack does not allow random access to elements

// Real-world examples of Stack usage:
// CTRL + Z or Undo operation can be implemented using Stack
// Redo operation can be implemented using another Stack

// Structure	          |  Size Type
// Array	              |  Static (fixed size)
// Stack (Collection)	  |  Dynamic (resizable)
// ArrayList	          |  Dynamic
// LinkedList	          |  Dynamic

///////////////////////////////////////////////////////////////////////////////////

// Queue Data Structure Implementation in Java
// Queue follows FIFO (First In First Out) principle
// Main operations: add, remove, peek, isEmpty, size
// add: adds an item to the end of the queue
// remove: removes and returns the front item of the queue
// peek: returns the front item without removing it
// isEmpty: checks if the queue is empty
// size: returns the number of items in the queue

// Queue is not synchronized (not thread-safe) and allows null elements

// Real-world examples of Queue usage:
// Print queue in a printer
// CPU scheduling
// Call center systems where calls are answered in the order they are received

// Structure	          |  Size Type
// Array	              |  Static (fixed size)
// Queue (Collection)	  |  Dynamic (resizable)
// ArrayList	          |  Dynamic
// LinkedList	          |  Dynamic
