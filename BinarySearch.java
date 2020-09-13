package practiceEx;

public class BinarySearch {

	public static void main(String[] args) {
		int target = 7;
		int arr[] = {2, 3, 4, 5, 7, 8, 9, 11, 13, 19, 22};
		System.out.print(target + " was found at position " + findIndexPosition(arr, target));
		
	}

	private static int findIndexPosition(int[] arr, int target) {
		int left =  0;
		int right = arr.length - 1;
		
		while(left <= right) {
			
			int midpoint = (left + right) / 2;
			
			if(arr[midpoint] == target) {
				return midpoint;
			}
			else if (arr[midpoint] > target) {
				right = midpoint - 1;
			}
			else {
				left = midpoint + 1;
			}
			
		}
		
		return -1;
	}
}
