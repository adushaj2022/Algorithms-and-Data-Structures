package practiceEx;


//we will use this class ValueSet to encapsulate the max, min, and max difference within our recursive method
class ValueSet {
	
	int max_difference;
    int max_num; 
    int min_num; 
    
    ValueSet (int max_difference, int max_num, int min_num) {
    	this.max_difference = max_difference;
    	this.max_num = max_num;
    	this.min_num = min_num;
    }
}

public class Problem1_ {
	

	public static void main(String[] args) {
		
		// Test your findmaxdiff() method here
		
		int[] testarray1 = {2, 3, 10, 6, 4, 8, 1};
		// maxdiff: 8
				
		int[] testarray2 = {7, 9, 1, 6, 3, 2};
		// maxdiff: 5
		
		int[] testarray3 = {40, 0, 2, 30, 10, 3, 20};
		//maxdiff: 30
		
		System.out.println("The max difference for testarray1 is: " + findmaxdiff(testarray1));
		System.out.println("The max difference for testarray2 is: " + findmaxdiff(testarray2));
		System.out.println("The max difference for testarray2 is: " + findmaxdiff(testarray3));	
	}
	
	//helper recursive method
	private static int findmaxdiff(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		ValueSet result = get_max_diff(nums, 0, nums.length-1);
		
		//return our max difference
		return result.max_difference;
	}

	private static ValueSet get_max_diff(int[] nums, int start, int end) {
		
		//make sure we were given the right inputs
		assert start <= end;
		
		ValueSet result = new ValueSet(0, nums[start], nums[start]);
		
		//base case 
	    if (start == end) {
            return result;
	    }
	    
        int midIndex = start + (end - start) / 2;
        //divide the problem
        ValueSet left = get_max_diff(nums, start, midIndex);
        ValueSet right = get_max_diff(nums, midIndex+1, end);
        
        //combine results
        return merge(nums, left, right);
	}

	private static ValueSet merge(int[] nums, ValueSet left, ValueSet right) {
		//curr max diffrence will keep track of left and max difference
		int curr_max_diff = Math.max(left.max_difference, right.max_difference);
		/*
		 * max diff will be our final answer, this is checking the max of left and right, and the third
		 * case which is if the max diff occurs between the cross over of left and right 
		 */
	    int max_diff = Math.max(curr_max_diff, right.max_num - left.min_num);
	    //max and min keep track of min and max to help us calculate the corss over difference
	    int max =  Math.max(left.max_num, right.max_num);
	    int min =  Math.min(left.min_num, right.min_num);
	        
	    ValueSet result = new ValueSet(max_diff, max, min);
	    
	    //finally return result with its updated max difference
	    return result;
		
	}

	
	
	

}
