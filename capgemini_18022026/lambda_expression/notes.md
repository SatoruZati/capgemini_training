## Can we write main method inside interface? 
Yes. We **can** write a `main` method inside an interface in Java.

---

### Why It Works

Since **Java 8**, interfaces can contain:

* `static` methods
* `default` methods
* `private` methods (Java 9+)

A `main` method is:

```java
public static void main(String[] args);
```

Because it is `static`, it is allowed inside an interface.

---

### Example

```java
interface TestInterface {

    static void main(String[] args) {
        System.out.println("Main inside interface");
    }
}
```

This compiles and runs.

To execute:

```
java TestInterface
```

The JVM looks for a `public static void main(String[])` method — it does not require it to be inside a class specifically.

---

### Important Notes

1. The method **must be static**.
2. You cannot create objects of an interface.
3. This is rarely used in production code.
4. Mostly useful for:

    * Testing
    * Utility containers
    * Concept demonstration

---

### When It Does NOT Work

If you try:

```java
interface A {
    public void main(String[] args);  // ❌ Not static
}
```

This is invalid because `main` must be `static`.

---

### Practical Recommendation

Although legal, placing `main()` inside a class is standard practice.
Using it inside an interface is unconventional.

---

If you want, I can also explain how this relates to JVM entry point resolution.

## Anonymous Classes and Lambda Expressions
### Anonymous Classes
An anonymous class is a local class without a name. It is defined and instantiated in a single expression using the `new` keyword. Anonymous classes are often used to implement interfaces or extend classes in a concise way.
```
javaRunnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running in an anonymous class");
    }
};
r.run();
```
### Lambda Expressions
Lambda expressions are a more concise way to represent instances of functional interfaces (interfaces with a single abstract method). They were introduced in Java 8 and provide a clear and concise syntax for writing functional code.
```
javaRunnable r = () -> System.out.println("Running in a lambda expression");
r.run();            
```

### Functional Interfaces:
1. Runnable 
2. Callable
3. Comparator
4. Consumer
5. Supplier
6. Function
7. Predicate
8. BiFunction
9. BiConsumer
10. BiPredicate
11. UnaryOperator
12. BinaryOperator

#### Consumer interface methods:
1. `void accept(T t)` : Performs this operation on the given argument.
2. `default Consumer<T> andThen(Consumer<? super T> after)` : Returns a composed Consumer that performs, in sequence, this operation followed by the after operation. If performing either operation throws an exception, it is relayed to the caller of the composed operation. If performing this operation throws an exception, the after operation will not be performed.
3. `static <T> Consumer<T> identity()` : Returns a Consumer that always performs the same operation on the given argument. This consumer may be used where a Consumer is required but there is no meaningful operation to perform on the input argument. In this case, the consumer provided to accept will do nothing with its input argument.
4. `static <T> Consumer<T> of(Consumer<T> consumer)` : Returns a Consumer that performs the same operation as the given consumer. This method is useful for converting a lambda expression or method reference to a Consumer instance. If the given consumer is null, this method returns a Consumer that does nothing.
5. `static <T> Consumer<T> ofNullable(Consumer<T> consumer)` : Returns a Consumer that performs the same operation as the given consumer, or does nothing if the given consumer is null. This method is useful for converting a lambda expression or method reference to a Consumer instance while handling null values gracefully. If the given consumer is null, this method returns a Consumer that does nothing.
6. `static <T> Consumer<T> from(Consumer<T> consumer)` : Returns a Consumer that performs the same operation as the given consumer. This method is an alias for the of method and is provided for consistency with other functional interfaces. If the given consumer is null, this method returns a Consumer that does nothing.

#### Function interface methods:
1. `R apply(T t)` : Applies this function to the given argument.
2. `default <V> Function<V, R> compose(Function<? super V, ? extends T> before)` : Returns a composed function that first applies the before function to its input, and then applies this function to the result. If performing either operation throws an exception, it is relayed to the caller of the composed operation. If performing the before operation throws an exception, the after operation will not be performed.
3. `default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)` : Returns a composed function that first applies this function to its input, and then applies the after function to the result. If performing either operation throws an exception, it is relayed to the caller of the composed operation. If performing this operation throws an exception, the after operation will not be performed.
4. `static <T> Function<T, T> identity()` : Returns a function that always returns its input argument. This function may be used where a Function is required but there is no meaningful operation to perform on the input argument. In this case, the function provided to apply will return its input argument.
5. `static <T, R> Function<T, R> of(Function<T, R> function)` : Returns a Function that performs the same operation as the given function. This method is useful for converting a lambda expression or method reference to a Function instance. If the given function is null, this method returns a Function that always returns null.
6. `static <T, R> Function<T, R> ofNullable(Function<T, R> function)` : Returns a Function that performs the same operation as the given function, or returns null if the given function is null. This method is useful for converting a lambda expression or method reference to a Function instance while handling null values gracefully. If the given function is null, this method returns a Function that always returns null.
7. `static <T, R> Function<T, R> from(Function<T, R> function)` : Returns a Function that performs the same operation as the given function. This method is an alias for the of method and is provided for consistency with other functional interfaces. If the given function is null, this method returns a Function that always returns null.


### Classname::methodName -> method reference
what is method reference?
A method reference is a shorthand syntax for invoking a method in Java. It allows you to reference a method without invoking it, 
and it can be used in place of a lambda expression when the method being referenced matches the functional interface's method signature.

