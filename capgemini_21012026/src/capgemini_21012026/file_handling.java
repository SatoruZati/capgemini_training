package capgemini_21012026;

import java.util.*;
import java.io.*;

public class file_handling {

	public static void main(String[] args) throws Exception {
		// file handling in Java
		File f = new File("C:/Local Drive/Capgemini_training/capgemini_21012026/src/capgemini_21012026/demo.txt");
		FileInputStream fis = new FileInputStream(f);
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		System.out.println("Successfully read the file.");
		fis.close();
		System.out.println("========================================");
		
		Scanner sc = new Scanner(f);
		System.out.println("Reading file using Scanner:");
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();

	}

}
