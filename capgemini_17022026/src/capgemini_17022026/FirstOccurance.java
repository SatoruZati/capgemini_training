package capgemini_17022026;

public class FirstOccurance {
	
	public static void firstOccurance(int arr[]) {
		int i = 0;
		int l = arr.length;
		
		while (i<l) {
			if (arr[i] == 1) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int arr [] = {0,0,0,0,1,1,1,1,1,1};
//		int target = 1;

		firstOccurance(arr);
	}

}
