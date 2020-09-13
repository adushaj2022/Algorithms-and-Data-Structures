package practiceEx;


public class Insert {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 5, 6, 9};
		//{2, 4, 5, 6, 8, 9}
		System.out.print(searchInsert(arr, 8));
		
	}
		
	public static int searchInsert(int[] nums, int target) {
	    	
	
		
		if(nums[0] > target) {
			return 0;
		}
		
		if(nums[nums.length -1] < target) {
			return nums.length;
		}
		
			
	    for (int i = 0; i <= nums.length - 1 ; i++) {
	    	
	    	if (nums[i] == target){
	    		return i;
	    	}
	    	
	    	if(target > nums[i] && target < nums[i+1] ) {
	    		return i + 1;
	    	}
	    }
	    	
	    return -1;
	        
	}
}


