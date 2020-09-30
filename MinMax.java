package practiceEx;

	class Pair {
		int min;
		int max;
	}
	

public class MinMax {

	public static void main(String[] args) {
		int[] nums = {2, -2, 4, 9, 12, 33};
		Pair res = min_max(nums, 0, nums.length - 1); 
	    System.out.printf("Minimum element is %d", res.min); 
	    System.out.printf("\nMaximum element is %d", res.max); 

	}

	private static Pair min_max(int[] nums, int start, int end) {
		Pair min_max_left = new Pair();
		Pair min_max_right = new Pair();
		Pair min_max_result = new Pair();
		int middle;
		
		if(start - end == 0) {
			min_max_result.min = min_max_result.max = nums[start];
			return min_max_result;
		}
		
		if(start + 1 == end) {
			min_max_result.max = Math.max(nums[start], nums[end]); 
			min_max_result.min = Math.min(nums[start], nums[end]); 
			return min_max_result;
		}
		

		middle = (start + end) / 2;
		
		min_max_left = min_max(nums, start, middle);
		min_max_right = min_max(nums, middle + 1, end);
		
		min_max_result.max = Math.max(min_max_left.max, min_max_right.max);
		min_max_result.min = Math.min(min_max_left.min, min_max_right.min);
		
		
		return min_max_result;
		
	}

}
