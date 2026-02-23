## Life Cycle of a Thread (Java)

In Java, a thread goes through different states during its execution. These states are defined in `Thread.State`.

---

### 1. NEW
- A thread is in the **NEW** state when it is created but not yet started.

Example:
```
java
Thread t = new Thread();
```

- The thread remains in this state until `start()` is called.

---

### 2. RUNNABLE
- A thread enters the **RUNNABLE** state after calling `start()`.
- In this state, the thread is ready to run and waiting for CPU scheduling.
- Java does not have a separate **Running** state; actual execution is controlled by the OS scheduler.

---

### 3. BLOCKED
- A thread enters the **BLOCKED** state when it is waiting to acquire a monitor lock.
- This occurs when multiple threads attempt to enter a synchronized block or method.

Example:
```
java
synchronized(obj) {
    // critical section
}
```

---

### 4. WAITING
- A thread enters the **WAITING** state when it waits indefinitely for another thread to perform an action.

Common methods:
- `wait()`
- `join()`
- `LockSupport.park()`

The thread remains in this state until:
- `notify()` or `notifyAll()` is called, or
- the required condition becomes true.

---

### 5. TIMED_WAITING
- A thread enters the **TIMED_WAITING** state when it waits for a specified amount of time.

Common methods:
- `sleep(time)`
- `wait(time)`
- `join(time)`

After the timeout expires, the thread returns to the RUNNABLE state.

---

### 6. TERMINATED
- A thread enters the **TERMINATED** state when:
    - The `run()` method completes, or
    - The thread stops due to an exception.

Once terminated, a thread **cannot** be restarted.

---

## Important Notes

- `start()` creates a new thread and internally invokes the `run()` method.
- Calling `run()` directly does **not** create a new thread.
- The method `stop()` is deprecated and should **not** be used.
- Proper synchronization is required to avoid:
    - Race conditions
    - Deadlocks
    - Thread starvation

--------------------------------------------------------------
----------------------------------------------------

## ByteStream vs CharacterStream
- **ByteStream**: Used for handling raw binary data. It reads and writes data in bytes. Example classes include `InputStream` and `OutputStream`.
- **CharacterStream**: Used for handling character data. It reads and writes data in characters. Example classes include `Reader` and `Writer`.
- ByteStream is used for binary files (like images, audio), while CharacterStream is used for text files.
- FileOutputStream and FileInputStream are examples of ByteStream, while FileReader and FileWriter are examples of CharacterStream.

---------------------------------------------------------------
---

## BufferedReader vs Scanner
### BufferedReader
- Used for reading text from an input stream (like a file or console).
- Faster than Scanner for reading large inputs.
```
java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String input = br.readLine();
```
### Scanner
- Used for parsing primitive types and strings using regular expressions.
- More convenient for reading formatted input.
```
java
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
String str = sc.nextLine();
```
---
## BufferedWriter vs PrintWriter
### BufferedWriter
- Used for writing text to an output stream with buffering.
```
java
BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
bw.write("Hello, World!");
bw.close();
```
### PrintWriter
- Used for printing formatted representations of objects to a text-output stream.
```
java
PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
pw.println("Hello, World!");
pw.close();
```

### println
- `println` is a method of `PrintWriter` that prints a line of text and moves to the next line. It is not a class but a method used for output.