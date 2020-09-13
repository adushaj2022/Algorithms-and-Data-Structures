package practiceEx;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 4};
		int target = 6;
		int [] n = findTargetNumber(arr, target);
		System.out.print(Arrays.toString(n));
		
	}

	private static int[] findTargetNumber(int[] arr, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
				map.put(arr[i], i);
		}
		
		for(int j = 0; j < arr.length; j++) {
			int compliment = target - arr[j];
			if (map.containsKey(compliment) == true && map.get(compliment) != j){
				return new int[] {j, map.get(compliment)};
			}
		}
			
		
		
		
		
		throw new IllegalArgumentException("No Target");
		
	}

}
