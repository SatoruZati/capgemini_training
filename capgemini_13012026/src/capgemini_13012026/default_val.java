package capgemini_13012026;

public class default_val {

    // default data types values

    // primitive data types
    byte byteVar;           // default value 0
    short shortVar;         // default value 0
    int intVar;             // default value 0
    long longVar;           // default value 0
    float floatVar;         // default value 0.0
    double doubleVar;       // default value 0.0
    char charVar;           // default value '\u0000' (null character)
    boolean booleanVar;     // default value false

    // non-primitive data types
    String stringVar;       // default value null
    int[] arrayVar;         // default value null
    Object objectVar;       // default value null

    public static void main(String[] args) {
        default_val obj = new default_val();
        System.out.println("Default byte value: " + obj.byteVar);
        System.out.println("Default short value: " + obj.shortVar);
        System.out.println("Default int value: " + obj.intVar);
        System.out.println("Default long value: " + obj.longVar);
        System.out.println("Default float value: " + obj.floatVar);
        System.out.println("Default double value: " + obj.doubleVar);
        System.out.println("Default char value: '" + obj.charVar + "'");
        System.out.println("Default boolean value: " + obj.booleanVar);
        System.out.println("Default String value: " + obj.stringVar);
        System.out.println("Default array value: " + obj.arrayVar);
        System.out.println("Default Object value: " + obj.objectVar);

        // Addition addition = new Addition(); // not required since static class
        // calling static method using class name i.e. without creating object of the class
        int sum = Addition.add(5, 10);
        System.out.println("Sum from static method: " + sum);


    }

    void sleep(){
        System.out.println("This is a void method.");
        // just stating void and after that a method name and parentheses and curly braces
        // we can create a void method
        // void means no return type, so this method does not return any value.
        // we can just call this method to execute the statements inside it.
        // void methods are used when we want to perform some action but do not need to return any value.
        // for example, printing a message, updating a variable, etc.
        // we can call this method from main method or any other method. even from another class.
        // example: sleep();
    }

    // static method

    static class Addition {

        static int add(int a, int b) {
            return a + b;
        }

    }

}

