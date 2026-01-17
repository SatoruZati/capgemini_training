package capgemini_14012026;

// Arrays: an object that can store multiple elements of same data-type, 
// the point that variables lack by storing one single value.

// ARRAYs are immutable

// length of array is found with reference to the object reference variable.
// for eg: arr is array object reference variable. arr.len returns array length.

// to access values in arrays we use index references starting from 0.

// types of arrays:
// 1. single dimensional arrays 
// 2. multi dimensional arrays
// 3. circular arrays
// 4. dynamic arrays
// 5. static arrays

// continuous memory allocation

// declaration of arrays
// datatype [] variableName = {e1, e2, e3, ... , eN};
// datatype variableName [] = {e1, e2, e3, ... , eN};
// datatype []variableName = {e1, e2, e3, ... , eN};

// int arr [] = {17,9,10,12,2004,5,2024};

// array index out of bound exception is caused if we access or use or associate elements out of length of the array

/////////////////////////////////////////////////////////////////////
/// 
/// input scenario
// we can input by the following ways:
// based on data types:
// 1. nextInt() - int
// 2. nextFloat() - float
// 3. nextDouble() - double
// 4. nextLong() - long
// 5. next() - String (single word)
// 6. nextLine() - String (multiple words)
// 7. nextBoolean() - boolean   
// 8. nextByte() - byte
// 9. nextShort() - short
// 10. next().charAt() - char
/// 
// based on structure:
// 1. single input
// 2. multiple inputs
// 3. inputs using loops
// 4. inputs using arrays

/////////////////////////////////////////////////////////////////////
/// 
/// Just like System.out.println() is used to print output to console,
/// Scanner class is used to take input from console.
/// System.out is an output stream while System.in is an input stream.
/// 
/// To use Scanner class, we need to import it from java.util package.
/// import java.util.Scanner;
/// 
/// To create a Scanner object:
/// Scanner sc = new Scanner(System.in);
/// 
/// To take input using Scanner object:
/// datatype variableName = sc.nextDatatype();
/// 
/// To close the Scanner object:
/// sc.close();
/// 
/// Why do we need to close the Scanner object?
/// It is a good practice to close the Scanner object to free up the resources.
/// Not closing the Scanner object may lead to memory leaks.
/// 
/// What are memory leaks?
/// Memory leaks occur when objects are no longer needed but are not garbage collected
/// because there are still references to them.
/// This can lead to increased memory usage and eventually to OutOfMemoryError.
/// 
/// ///////////////////////////////////////////////////////////////////
/// 
/// 2D arrays:
/// A two-dimensional array is an array of arrays.
/// It can be visualized as a table with rows and columns.
/// To declare a 2D array:
/// datatype [][] variableName = new datatype[rows][columns];
/// or
/// datatype variableName [][] = new datatype[rows][columns];
/// or
/// datatype [][] variableName = { {e11, e12, ... , e1N},
///                               {e21, e22, ... , e2N},
///                             ... {eM1, eM2, ... , eMN} };
/// 
/// []-> represents 1 dimension
/// [][]-> represents 2 dimensions where first [] represents rows and second [] represents columns
/// 
/// [][][]-> represents 3 dimensions where first [] represents depth, second [] represents rows and third [] represents columns
/// and so on...
/// 
/// ///////////////////////////////////////////////////////////////////
/// 
/// 2D array example:
/// int arr [][] = { {1, 2, 3},
///                 {4, 5, 6},
///               {7, 8, 9} };
/// 
/// To access elements in 2D array:
/// 
/// for(int i=0; i<rows; i++) {
///     for(int j=0; j<columns; j++) {
///        System.out.println("Element at (" + i + "," + j + "): " + arr[i][j]);
///   }
/// }
/// 
/// ///////////////////////////////////////////////////////////////////
/// 
/// Java.util.Arrays class:
/// The Arrays class contains various methods for manipulating arrays (such as sorting and searching).
/// Some commonly used methods are:
/// 1. Arrays.sort(arr) - sorts the array
/// 2. Arrays.binarySearch(arr, key) - searches for the key in the sorted array
/// 3. Arrays.equals(arr1, arr2) - checks if two arrays are equal
/// 4. Arrays.fill(arr, value) - fills the array with the specified value
/// 5. Arrays.copyOf(arr, newLength) - copies the array to a new array
/// 6. Arrays.toString(arr) - returns string representation of the array
/// 7. Arrays.asList(arr) - converts array to a List
/// and many more.
/// 
/// ///////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Difference between Arrays class and ArrayList class:
///  1. Arrays class is used for manipulating arrays, while ArrayList is a resizable array 
///          implementation of the List interface.
///  2. Arrays class provides static methods, while ArrayList provides instance methods.
///  3. Arrays class works with fixed-size arrays, while ArrayList can grow and shrink dynamically.
///  4. Arrays class is part of java.util package, while ArrayList is part of java.util package and 
//          implements List interface.
/// 
/// Arrays vs HashMap:
/// 1. Arrays are ordered collections of elements accessed by index, while HashMaps are unordered
///    collections of key-value pairs accessed by keys.
/// 2. Arrays have a fixed size, while HashMaps can dynamically grow and shrink.
/// 3. Arrays allow duplicate values, while HashMaps do not allow duplicate keys.
/// 4. Arrays are more efficient for indexed access, while HashMaps provide faster lookups based on keys.
/// 5. Arrays are suitable for storing homogeneous data types, while HashMaps can store heterogeneous data types.
///
/// ///////////////////////////////////////////////////////////////////
/// 
/// 