package capgemini_07022026;

// Dynamic Programming and Greedy Programming

// Criterions for a DP Problem:

// 1. Optimal Substructure or Optimal Subproblem: The optimal solution to the problem can be constructed from the optimal solutions 
// of its subproblems.
// i.e. the problem should have multiple subproblems and the optimal solution to the problem can be constructed from the optimal solutions
// of its subproblems.

// 2. DP has two approaches: Top-Down and Bottom-Up. 
// In Top-Down approach, we start with the original problem and break it down into smaller subproblems until 
// we reach the base case. 
// In Bottom-Up approach, we start with the base case and build up the solution to the original problem by 
// solving the subproblems iteratively.

// Greedy Programming:
// In Greedy Programming, we make the locally optimal choice at each step with the hope of finding the
// global optimal solution.
// Greedy algorithms do not always yield the optimal solution, but they can be efficient for certain problems 
// where the greedy choice property holds, meaning that a locally optimal choice leads to a globally optimal solution.

// Greedy has 2 options:
// 1. Greedy Choice Property: A globally optimal solution can be arrived at by making a locally optimal choice.
// 2. Optimal Substructure: An optimal solution to the problem contains optimal solutions to its subproblems.

// Example of a DP problem: Fibonacci Sequence, Knapsack Problem, Longest Common Subsequence, etc.
// Example of a Greedy problem: Activity Selection Problem, Huffman Coding, Shortest Path in a Graph (Dijkstra's Algorithm), etc.

// Note: 
/*
The Knapsack Problem is solved using either greedy or dynamic programming (DP) depending on the variant. 
   - The 0/1 Knapsack problem (items cannot be broken) requires Dynamic Programming to find the optimal solution. 
   - The Fractional Knapsack problem (items can be broken) is solved using a Greedy algorithm. 
*/

// To find optimal solution of Fractional Knapsack, we find profit per unit weight for each item and sort the items based on this ratio in descending order.
// Then, we pick items in this order until the knapsack is full, taking fractions of items if necessary.

// In normal 0/1 Knapsack, we cannot break items, so we use DP to find the optimal solution by building a table that stores the maximum profit for each subproblem defined by the first i items and a knapsack capacity of w.

// 