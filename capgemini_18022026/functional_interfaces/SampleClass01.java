package capgemini_18022026.functional_interfaces;

public class SampleClass01 {
    // Parent Class

    public static void any() {
        System.out.println("This is Parent Class");
    }
}

class ChildClass01 extends SampleClass01 {
    // Child Class
    public static void main(String[] args) {
        any();
    }
//    public static void any(){
//        System.out.println("This is Child Class");
    // we can not override static method, it will give compile time error
}

