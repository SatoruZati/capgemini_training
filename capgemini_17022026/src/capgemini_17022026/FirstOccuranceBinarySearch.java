package capgemini_17022026;

public class FirstOccuranceBinarySearch {
	
	public static void firstOccurance(int[] arr) {
	    int target = 1;
	    int left = 0;
	    int right = arr.length - 1;

	    while (left <= right) {

	        int mid = left + (right - left) / 2;

	        if (arr[mid] == target) {

	            if (mid == 0 || arr[mid - 1] != target) {
	                System.out.println(mid);
	                return;
	            } else {
	                right = mid - 1;
	            }

	        } else if (arr[mid] < target) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }

	    System.out.println(-1); // if not found
	}

	public static void main(String[] args) {
		int arr [] = {0,0,0,0,0,0,1,1,1,1,1};
		firstOccurance(arr);
	}

}


