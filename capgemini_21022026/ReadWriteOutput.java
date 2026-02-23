package capgemini_21022026;

import java.io.*;

class ReadAndWrite {

    private String DataLocation = "Sample02.txt";
    private String Data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n " +
            "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \n " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n ";
    private boolean isWritten = false;

    public synchronized void readData() throws IOException, InterruptedException {
        if (!isWritten) {
            System.out.println("Data not written yet. Please write data before reading.");
            wait();
            // Wait until data is written
        }
        System.out.println("Reading data from " + DataLocation + ": " + Data);

        FileReader reader = new FileReader(DataLocation);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        bufferedReader.close();
    }

    public synchronized void writeData() throws IOException, InterruptedException {
        FileWriter writer = new FileWriter(DataLocation);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(Data);
        bufferedWriter.close();
        isWritten = true;
        notifyAll(); // Notify waiting threads that data is written

        writer.close();
        bufferedWriter.close();
    }
}

public class ReadWriteOutput {


    public static void main(String[] args) throws InterruptedException {
        ReadAndWrite obj = new ReadAndWrite();
        Thread writeThread = new Thread(() -> {
            try {
                // ReadAndWrite rw = new ReadAndWrite();
                obj.writeData();
                System.out.println("Data written successfully");
                System.out.println("\n");
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread readThread = new Thread(() -> {
            try {
                // ReadAndWrite rw = new ReadAndWrite();
                obj.readData();
                System.out.println("Data read successfully");
                System.out.println("\n");
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        writeThread.start();
        // writeThread.wait(1000);
        readThread.start();


    }
}
