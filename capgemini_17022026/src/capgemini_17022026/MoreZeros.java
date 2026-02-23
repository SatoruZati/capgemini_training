package capgemini_17022026;

public class MoreZeros {
	
	public void moveZeroes(int[] nums) {
	        for (int i=0;i<nums.length-1; i++) {
	        	
	  		  if (nums[i] == 0) {
	                for (int j=i+1; j<nums.length; j++) {
	                    if (nums[j] != 0) {
	                        int temp = nums[i];
	                        nums[i] = nums[j];
	                        nums[j] = temp;
	                        break;
	                    }
	                }
	            }
	        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {0,1,0,3,12};
		MoreZeros mz = new MoreZeros();
		mz.moveZeroes(arr);
	}

}
