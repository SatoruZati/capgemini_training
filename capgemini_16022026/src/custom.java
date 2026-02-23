import java.util.Scanner;

public class custom {

    int sz;
    int[] arr;
    int[] arrfinal;
    Scanner sc = new Scanner(System.in);

    public void getdata() {
        System.out.println("Enter the size of the array:");
        sz = sc.nextInt();

        arr = new int[sz];
        arrfinal = new int[sz + 1];

        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void display() {
        System.out.println("The elements of the array are:");
        for (int i = 0; i < sz; i++) {
            System.out.println(arr[i]);
        }
    }

    public void insert() {
        System.out.println("Enter the new value to be inserted:");
        int newvalue = sc.nextInt();

        int i;
        for (i = 0; i < sz; i++) {
            if (arr[i] > newvalue) {
                break;
            }
        }

        // Copy elements before insertion point
        for (int j = 0; j < i; j++) {
            arrfinal[j] = arr[j];
        }

        // Insert new value
        arrfinal[i] = newvalue;

        // Copy remaining elements
        for (int j = i; j < sz; j++) {
            arrfinal[j + 1] = arr[j];
        }

        sz++;
    }

    public static void main(String[] args) {
        custom obj = new custom();

        obj.getdata();
        obj.display();
        obj.insert();

        System.out.println("The elements of the array after insertion are:");
        for (int i = 0; i < obj.sz; i++) {
            System.out.print(obj.arrfinal[i] + " ");
        }
        System.out.println(); // Print a newline for better formatting
    }
}
