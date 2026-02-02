package capgemini_02022026;

// Linear Search Implementation
// Time Complexity: O(n) in the worst case
// Space Complexity: O(1)
// Linear search is not efficient for large datasets compared to binary search
// but it works on both sorted and unsorted arrays.
// It is simple to implement and understand.
// It is useful when the dataset is small or when simplicity is preferred over efficiency.
// In practice, for large datasets, binary search or other efficient algorithms are preferred.
// Linear search can also be used in linked lists where binary search is not applicable.
// It is also used in scenarios where the data is constantly changing and sorting is not feasible.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Binary Search Implementation
// Time Complexity: O(log n) in the worst case
// Space Complexity: O(1)
// Binary search is much more efficient than linear search for large datasets.
// However, it requires the array to be sorted beforehand.
// It works by repeatedly dividing the search interval in half.
// If the target value is less than the middle element, it continues searching in the left half
// otherwise, it searches in the right half.
// Binary search is widely used in practice due to its efficiency.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Quick Search Implementation
// Time Complexity: O(n log n) on average, O(n^2) in the worst case
// Space Complexity: O(log n) due to recursive stack space
// Quick search (Quickselect) is an efficient algorithm for finding the k-th smallest element
// in an unordered list.
// It is related to the quicksort sorting algorithm.
// Quickselect works by partitioning the array around a pivot element
// such that elements less than the pivot are on the left, and elements greater are on the right.
// Depending on the position of the pivot, it recursively searches in the relevant partition.
// Quickselect is efficient for selection problems and is often used in practice
// when the full sorting of the array is not required.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

