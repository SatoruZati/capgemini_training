package capgemini_17022026;

public class moreZerosOptimised {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            return;

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {0,1,0,3,12};
		moreZerosOptimised mz = new moreZerosOptimised();
		mz.moveZeroes(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
