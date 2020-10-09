package practiceEx;

public class MaxCSubArray {

	public static void main(String[] args) {

		int[] arr = new int[] {-1, 2, -3, 4, 5, 2, -8, 11};
		int k = findMaxContigousSubArray(arr);
		System.out.println("The max sub Array is: " + k);
	}

	private static int findMaxContigousSubArray(int[] arr) {
		int curr_sum = arr[0];
		int max_sum = curr_sum;
		
		for(int i = 0; i < arr.length; i++) {
			curr_sum = Math.max(arr[i] + curr_sum, arr[i]);
			max_sum = Math.max(max_sum, curr_sum);
		}
		
		return max_sum;
		
	}

}
