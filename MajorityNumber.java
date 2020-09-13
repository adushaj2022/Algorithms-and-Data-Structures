package practiceEx;

import java.util.HashMap;

public class MajorityNumber {

	public static void main(String[] args) {
		
		//test case 2: 3, 3, 3, 4, 4, 6, 6, 6, 6, 6, 6, 6, 6
		
		int arr[] =  {2, 3, 4};
		
		
		
		System.out.print("The majority number is: " + findMajorityNumber(arr));
			
	
	}
	

	private static int findMajorityNumber(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				
				int currentCount = map.get(arr[i]) + 1;
				
				map.put(arr[i], currentCount);
				
				if (currentCount > (arr.length/2)) {
					return arr[i];
				}
				
			} 
			
			else {
					map.put(arr[i], 1);
				}
				
		}
		
		throw new IllegalArgumentException("No majority found");
			
	}
	
	
	

}
