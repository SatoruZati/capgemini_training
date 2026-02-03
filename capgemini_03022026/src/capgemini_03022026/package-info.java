package capgemini_03022026;

// Comparable and Comparator interface have only one abstract method
// that is why they are called functional interfaces

// The compareTo() method of Comparable interface is used to compare the current object with the specified object
// It needs to be overridden in the class whose objects are to be compared

//////////////////////// GREEDY ALGORITHMS ///////////////////////

// // Greedy Algorithm is an algorithmic paradigm that builds up a 
// solution piece by piece. It always chooses the next piece
// that offers the most immediate benefit or the most optimal solution
// Greedy algorithms are used for optimization problems. 
// Job Scheduling, Huffman Coding, Prim's and Kruskal's algorithms are some examples of 
// greedy algorithms.
//
// Greedy Algorithm example: Coin Change Problem
// Given a set of coin denominations and a target amount, 
// the goal is to find the minimum number of coins needed to make the target amount.
// A greedy approach would be to always choose the largest denomination coin
// that is less than or equal to the remaining amount.


/* Rules to remember for Greedy Algorithm:
 * 1. Greedy choice property: A global optimum can be arrived at by selecting a local optimum.
 * 2. Optimal substructure: An optimal solution to the problem contains an optimal solution to subproblems.
 * 
 * Note: Greedy algorithms do not always produce the optimal solution for all problems.
 * They work well for problems that exhibit the greedy choice property and optimal substructure.
 */