package capgemini_21012026;

// Exceptions in Java

// An exception is an event that occurs during the execution of a program that disrupts the normal flow of 
// instructions.
// In Java, exceptions are objects that represent an error or an unexpected event that occurs during 
// the execution of a program.
// When an exception occurs, the Java Virtual Machine (JVM) creates an exception object and throws it.

// There are two types of exceptions in Java:
// 1. Checked Exceptions: These are exceptions that are checked at compile-time. The compiler checks 
// whether the code that may throw a checked exception is enclosed in a try-catch block or declared in 
// the method signature using the throws keyword. Examples of checked exceptions include 
// IOException, SQLException, and ClassNotFoundException.
// 
// 2. Unchecked Exceptions: These are exceptions that are not checked at compile-time. 
// They occur at runtime and are usually caused by programming errors, such as null pointer dereferencing 
// or array index out of bounds. Examples of unchecked exceptions include 
// NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.
// 

// for example:
// public static void main(String[] args) {
// int a = 10;
// int b = 0;
// int c = a / b; // This will throw an ArithmeticException
// System.out.println("Result: " + c);
// }
// To handle exceptions in Java, we use the try-catch-finally block.
// The try block contains the code that may throw an exception, the catch block contains the code
// that handles the exception, and the finally block contains the code that is always executed,
// regardless of whether an exception occurred or not.

// try-catch-block and throws keyword are used to handle exceptions in Java.

// Try - catch statment block example:
// public static void main(String[] args) {
// try {
// // code that may throw an exception
// } 
// catch (ExceptionType e) {
// // code to handle the exception
// }
// finally {
// // code that will always execute
// }
// }


