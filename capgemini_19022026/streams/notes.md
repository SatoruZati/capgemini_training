### Streams in Java

Stream is a data type in Java that represents a sequence of elements. 
It provides a high-level API for processing collections of data in a functional programming style. 
Streams allow you to perform operations on collections of data, such as filtering, mapping, and reducing, 
without modifying the original collection.

### Stream API
Stream API is a pipeline process, in this we shall have 3 categories of operations:
1. Stream creation: We can create a stream from a collection, an array, or a generator function.
We need to create a stream before we can perform any operations on it. Convert an input data source into a stream.
2. Converting a collection into a stream: We can convert a collection into a stream using the stream() method.
3. Stream operations: We can perform various operations on a stream, such as filtering, mapping, and reducing. 
These operations can be intermediate or terminal. Intermediate operations return a new stream, 
while terminal operations return a result or a side-effect.
4. Intermediate operations: These operations return a new stream and are lazy, meaning they are not executed until a terminal operation is invoked. Examples include filter(), map(), and sorted().
5. Terminal operations: These operations return a result or a side-effect and are eager, meaning they are executed immediately. Examples include :
-   forEach(), collect(), and reduce().
-   toList(), toSet(), toMap() are terminal operations that collect the elements of a stream into a collection.
-   sort() is an intermediate operation that sorts the elements of a stream.
-   distinct() is an intermediate operation that removes duplicate elements from a stream.
-   filter() is an intermediate operation that returns a stream consisting of the elements that match a given predicate.
-   map() is an intermediate operation that returns a stream consisting of the results of applying a given function to the elements of a stream.
-   reduce() is a terminal operation that performs a reduction on the elements of a stream using an associative accumulation function and returns an Optional.
-   forEach() is a terminal operation that performs an action for each element of a stream.
-   collect() is a terminal operation that performs a mutable reduction operation on the elements of a stream using a Collector and returns the result of the reduction.

6. Stream pipelines: A stream pipeline is a sequence of stream operations that are connected together. 
The output of one operation is the input to the next operation. 
Stream pipelines are executed lazily, meaning that the operations are not executed until a terminal operation is invoked.

