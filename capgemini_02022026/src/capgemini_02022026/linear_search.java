package capgemini_02022026;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        // Linear Search Implementation
        Scanner scanner = new Scanner(System.in);
        // we need an array for linear search
        // sorted or unsorted array works for linear search
        int[] arr = { 5, 15, 25, 35, 45, 55, 65, 75, 85, 95 };
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
        scanner.close();

    }
}
