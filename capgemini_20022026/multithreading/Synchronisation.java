package capgemini_20022026.multithreading;

public class Synchronisation {
    // synchronized keyword is used to control access to a particular resource or block of code by multiple threads.
    // When a thread enters a synchronized block, it acquires a lock on the object that is being synchronized,
    // and other threads that try to access the same block will be blocked until the lock is released.
    public synchronized void function01 (){
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println("Function 01: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate some work being done
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void function02 (){
        for (int i = 1; i <= 26; i++) {
            System.out.println("Function 02: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate some work being done
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Controller {
    public static void main(String[] args) {
        Synchronisation synchronisation = new Synchronisation();

        Thread thread1 = new Thread(() -> synchronisation.function01());
        Thread thread2 = new Thread(() -> synchronisation.function02());

        thread1.start();
        thread2.start();

        // what is exactly happening here is that both thread1 and thread2 are executing their respective functions concurrently,
        // which means that the output from both threads will be interleaved. The order of the output may vary each time you run the program,
        // as it depends on how the threads are scheduled by the JVM. This can lead to a situation where the output from both threads is mixed together,
        // making it difficult to read and understand.
        // To avoid this, we can use synchronization techniques to ensure that only one thread can access a shared resource at a time,
        // which will help to maintain the integrity of the output and prevent interleaving.

        // If a function is synchronized, it is thread-safe, meaning that only one thread can access the function at a time.
        // This is achieved by using the synchronized keyword in the method declaration.
        // But if multiple threads are trying to access the same synchronized function, they will be blocked until the function is available,
        // which can lead to performance issues and potential deadlocks if not used carefully.

    }
}