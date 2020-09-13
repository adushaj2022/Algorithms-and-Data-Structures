package practiceEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {

		int[] arr = {4, 5, 6, 2, 1, 2, 1, 7, 7, 8};
		findDuplicates(arr);
		
		
		
	}

	private static List<Integer> findDuplicates(int[] arr) {
			List<Integer> l = new ArrayList<Integer>();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for(int i = 0; i < arr.length; i++) {
				if(map.containsKey(arr[i])) {
					if(map.get(arr[i]) + 1 == 2) {
						l.add(arr[i]);
					}
				}
				
				else {
					map.put(arr[i], 1);
				}
				
				
			}
			
			
			return l;
		
		
	}

}
