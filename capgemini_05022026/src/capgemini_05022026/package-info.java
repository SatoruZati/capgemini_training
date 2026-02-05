package capgemini_05022026;

// Heap is a special tree-based data structure that satisfies the heap property. In a max heap, for any given node C, if P is a parent node of C, then the key (the value) of P is greater than or equal to the key of C. In a min heap, the key of P is less than or equal to the key of C. The node at the "top" of the heap (with no parents) is called the root node.

// Heap uses Binary Tree structure and is commonly used to implement priority queues, where the highest (or lowest) priority element is always at the front of the queue. Heaps are also used in algorithms like heapsort and for efficient graph algorithms like Dijkstra's and Prim's algorithms.

// In a max heap, the largest element is always at the root, while in a min heap, the smallest element is at the root. Heaps are typically implemented using arrays, where the parent-child relationships can be easily calculated using index arithmetic. For example, for a node at index i, its left child is at index 2i + 1 and its right child is at index 2i + 2.
// The main operations on a heap include insertion, deletion of the root element, and heapification (maintaining the heap property after insertion or deletion). Heaps are efficient for these operations, with a time complexity of O(log n) for insertion and deletion, and O(n) for building a heap from an unsorted array.

// In a min heap, the smallest element is always at the root, while in a max heap, the largest element is at the root. Heaps are typically implemented using arrays, where the parent-child relationships can be easily calculated using index arithmetic. For example, for a node at index i, its left child is at index 2i + 1 and its right child is at index 2i + 2.
// The main operations on a heap include insertion, deletion of the root element, and heapification (maintaining the heap property after insertion or deletion). Heaps are efficient for these operations, with a time complexity of O(log n) for insertion and deletion, and O(n) for building a heap from an unsorted array.

// In summary, a heap is a specialized tree-based data structure that maintains a specific order (max or min) and is widely used for efficient priority queue management and sorting algorithms.

// Priority queue uses Min Heap or Max Heap to manage the elements based on their priority. In a priority queue implemented with a min heap, the element with the highest priority (the smallest value) is always at the front of the queue. Conversely, in a priority queue implemented with a max heap, the element with the highest priority (the largest value) is at the front of the queue. This allows for efficient retrieval and management of elements based on their priority levels.
// 

/*
K-Frequency Elements: Given an array of integers and an integer k, return the k most frequent elements in the array. You can return the answer in any order.
This uses which data structure?

A: This problem can be efficiently solved using a HashMap to count the frequency of each element, and then a Min Heap (or Max Heap) to keep track of the top k elements based on their frequency.
*/ 

/*


  
*/

