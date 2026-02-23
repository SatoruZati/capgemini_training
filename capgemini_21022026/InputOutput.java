package capgemini_21022026;

import java.io.*;

public class InputOutput {

    public static void main(String[] args) throws Exception {
        // Syntax explanation:
        // 1. FileWriter is a class in Java that is used to write character data to a file.
        // It provides methods to write characters, arrays of characters, and strings to a file.
        // 2. fw is the variable name for the FileWriter Object.
        // 3. new FileWriter("sample.txt") creates a new FileWriter object that is associated with the file named "sample.txt".
        // If the file does not exist, it will be created. If it already exists, it will be overwritten.
        // 4. ("sample.txt") is the argument passed to the FileWriter constructor, which specifies the name of the file to which the data will be written.
        FileWriter fw = new FileWriter("sample.txt");

        // Syntax explanation:
        // 1. BufferedWriter is a class in Java that is used to write text to a character-output stream, buffering characters to provide efficient writing of single characters, arrays, and strings.
        // 2. bw is the variable name for the BufferedWriter Object.
        // 3. new BufferedWriter(fw) creates a new BufferedWriter object that is associated with the FileWriter object fw. This allows the BufferedWriter to write data to the file specified by the FileWriter.
        // 4. fw is the argument passed to the BufferedWriter constructor, which specifies the FileWriter object that the BufferedWriter will use to write data to the file.
        BufferedWriter bw = new BufferedWriter(fw);

        // .write() is a method of the BufferedWriter class that is used to write a string to the output stream. It takes a string as an argument and writes it to the file. In this case, it writes the string to the file "sample.txt".
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris erat mi, dictum vel volutpat in, blandit eget erat. Morbi eu libero arcu. Duis a elementum ligula, eu rutrum nisl.");
        bw.newLine();
        bw.newLine();
        bw.write("Suspendisse sit amet lacus felis. In vehicula, purus vitae interdum dictum, ante ligula vulputate lorem, et hendrerit lectus diam sit amet felis. Quisque mauris orci, vestibulum.");
        bw.close();

        FileReader fr = new FileReader("sample.txt");

        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        fr.close();

    }
}
