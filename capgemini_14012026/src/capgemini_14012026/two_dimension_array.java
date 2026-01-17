package capgemini_14012026;
import java.util.Scanner;
import java.util.Arrays;

public class two_dimension_array {
    
    public static void main(String[] args) {
        
        System.out.println("2D Array Example:");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------- enter value of rows and columns ---------");
        int n = sc.nextInt();
        
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("2D Array Elements:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Accessing specific element at (1,2): " + arr[1][2]);

        sc.close();

    }

    static void moreexamples() {
        // more examples inside this function

        System.out.println("More examples on 2D Array :");

        // Example 1: Initializing a 2D array with predefined values
        int[][] predefinedArr = {{1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}};

        System.out.println("Predefined 2D Array Elements:");
        for (int i=0; i<predefinedArr.length; i++) {
            for(int j=0; j<predefinedArr[i].length; j++) {
                System.out.print(predefinedArr[i][j] + " ");
            }
            System.out.println();
        }

        // Example 2: Finding the sum of all elements in a 2D array
        int sum = 0;
        int [][] sumArr = {{17, 25, 33},
                          {4, 12, 10},
                          {12, 8, 9}};

        for(int i=0; i<sumArr.length; i++) {
            for(int j=0; j<sumArr[i].length; j++) { 
                sum += sumArr[i][j];
            }
        }

        System.out.println("Sum of all elements in the 2D array: " + sum);
        
        // usage of java.util.Arrays functions
        // (not directly applicable to 2D arrays, but can be used on individual rows)
        int[] rowToSort = {5, 2, 8, 1, 3};
        Arrays.sort(rowToSort);

        System.out.println("Sorted row: " + Arrays.toString(rowToSort));

        /////////////////////////////////////////////////////////////////////////////

        int key = 3;
        int index = Arrays.binarySearch(rowToSort, key);        

        if(index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the row.");
        }

        /////////////////////////////////////////////////////////////////////////////

        String [] arrdemo = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi"};

        System.out.println("String 2D Array Elements:");
        for (int i=0; i<arrdemo.length; i++) {
            System.out.print(arrdemo[i] + " ");
        }
        System.out.println();

        Arrays.toString(arrdemo);

        /////////////////////////////////////////////////////////////////////////////
        /// 
        /// Other functions from Arrays are as follows:
        int [] arr1 = {4, 8, 10};
        int [] arr2 = {4, 8, 10};
        int [] arr3 = {4, 8, 10, 17};

        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2)); // true
        System.out.println("Arrays.equals(arr1, arr3): " + Arrays.equals(arr1, arr3)); // false

        int [] fillArr = new int[5];
        Arrays.fill(fillArr, 17);    

        System.out.println("Arrays.fill(fillArr, 17): " + Arrays.toString(fillArr)); // [17, 17, 17, 17, 17]

        int [] copyArr = Arrays.copyOf(arr1, 5); // new length is 5
        System.out.println("Arrays.copyOf(arr1, 5): " + Arrays.toString(copyArr)); // [4, 8, 10, 0, 0]
        System.out.println("Arrays.toString(arr3): " + Arrays.toString(arr3)); // [4, 8, 10, 17]

        ///////////////////////////////////////////////////////////////////////////// 
        
        String [] arrlistdemo = {"Porsche", "Audi", "BMW", "Mercedes", "Volkswagen"};
        java.util.List<String> list = Arrays.asList(arrlistdemo);

        System.out.println("Arrays.asList(arrlistdemo): " + list); // [Porsche, Audi, BMW, Mercedes, Volkswagen]

        ////////////////////////////////////////////////////////////////////////// 
        
        String [] arrlistdemo2 = {"Real Madrid", "Barcelona", "Manchester United", "Liverpool", "Bayern Munich"};
        Arrays.asList(arrlistdemo2).forEach(team -> System.out.println("Team: " + team));


    }
}