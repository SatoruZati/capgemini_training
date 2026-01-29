package capgemini_29012026;

import java.util.ArrayList;

public class arrays {

	public static void main(String[] args) {
		
		// 1D Array
		
		// int [] arr = {25, 33, 8, 17, 25, 10, 9, 17};
		int [] arr = new int[8]; 
		arr[0] = 25;
		arr[1] = 33;
		arr[2] = 8;
		arr[3] = 17;
		arr[4] = 25;
		arr[5] = 10;
		arr[6] = 9;
		arr[7] = 17;
		
		int pos = 2;
		int value = 99;
		
		// inserting value at position pos
		for(int i=arr.length-1; i>pos; i--) {
			arr[i] = arr[i-1];
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------");
		
		// shift elements to right
		arr[pos] = value;
		System.out.println("After inserting " + value + " at position " + pos + ":");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// ArrayList 
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(25);
		list.add(33);
		list.add(8);
		list.add(17);
		list.add(25);
		list.add(10);
		list.add(9);
		list.add(17);
		System.out.println("ArrayList before insertion: " + list);
		
		list.add(pos, value);
		System.out.println("ArrayList after inserting " + value + " at position " + pos + ": " + list);

	}

}
