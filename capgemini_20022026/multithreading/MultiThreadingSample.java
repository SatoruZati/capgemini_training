package capgemini_20022026.multithreading;

public class MultiThreadingSample implements Runnable {
    // first we must implement the Runnable interface and override the run() method to define the code that will be executed by the thread.
    // then we can create instances of the Thread class, passing our Runnable implementation to the constructor, and start the threads using the start() method.
    // we need to override the run() method to specify the code that will be executed by each thread.
    // In this example, we simply print the thread name and a count from 0 to 9.
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate some work being done
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // The sleep() method is used to pause the execution of the thread for a specified amount of time.
            // In this case, we are pausing for 1 second (1000 milliseconds) to simulate some work being done.
            // needs to be wrapped in a try-catch block because it can throw an InterruptedException if the thread is interrupted while sleeping.

            // Thread.yield();
            // The yield() method is a static method of the Thread class that causes the currently executing thread to pause
            // and allow other threads of the same priority to execute.

        }
    }
}

class Main{
    public static void main(String[] args) {

        // Thread class is used to create and manage threads in Java. We can create a thread by instantiating the Thread class and passing a Runnable object to its constructor.
        // The Runnable interface is a functional interface that has a single method, run(), which contains the code that will be executed by the thread.
        Thread thread1 = new Thread(new MultiThreadingSample());
        Thread thread2 = new Thread(new MultiThreadingSample());

        // thread.start() method is used to start the execution of the thread.
        // When we call start(), the JVM creates a new thread and calls the run() method of our Runnable implementation in that thread.

        System.out.println("--- Main thread 1 is running ---");
        System.out.println("thread1: " + thread1.getState());
        thread1.start();
        thread2.start();

        System.out.println("--- Main thread 2 is running ---");

        ThreadImplementation threadImplementation = new ThreadImplementation();
        threadImplementation.start();

        System.out.println("--- Main thread 3 is running ---");

        Thread thread3 = new Thread(new MultiThreadingSample());
        thread3.start();

    }
}

class ThreadImplementation extends Thread {
    // Alternatively, we can also create a thread by extending the Thread class and overriding its run() method.
    // In this case, we don't need to implement the Runnable interface, as the Thread class itself implements it.

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate some work being done
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void start() {
        super.start(); // Call the start() method of the Thread class to start the thread
        System.out.println("Thread: " + Thread.currentThread().getName() + " - Start");
    }
}

class ThreadDemo extends Employee implements  Runnable {
    public ThreadDemo(String name, int id) {
        super(name, id);
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + " - Employee Name: " + getName() + ", Employee ID: " + getId());
    }
}
