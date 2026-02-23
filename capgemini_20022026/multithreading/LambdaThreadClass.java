package capgemini_20022026.multithreading;

public class LambdaThreadClass {

    public static void main(String[] args) throws InterruptedException {

        // main method is a main thread of execution in a Java program.
        // When we run a Java program, the JVM creates a main thread that executes the code in the main method.
        // We can create additional threads to perform concurrent tasks alongside the main thread.

        // Syntax breakdown:
        // Thread thread = new Thread(() -> {
        //     // Code to be executed in the thread goes here
        // });
        // In this syntax, we are creating a new Thread object and passing a lambda expression as the argument to the Thread constructor.
        // The lambda expression represents the code that will be executed in the thread.
        // The lambda expression is a concise way to implement the Runnable interface, which is required by the Thread constructor.
        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second to simulate some work being done
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(1500); // Sleep for 1 second to simulate some work being done
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        thread.join(); // Wait for thread to finish before starting thread2
        thread2.start();
        thread2.join();

        // Thread.currentThread().join(); // the program will get stuck here until the main thread is interrupted or finishes execution, which will never happen in this case, so the program will run indefinitely until it is manually terminated.
        Thread.currentThread().interrupt(); // Interrupt the main thread to exit the program
    }
}
