package practiceEx;

import java.util.Arrays;
import java.util.HashSet;


public class Intersection {

	public static void main(String[] args) {

		int arr1[] = {8, 9, 3, 2, 11};
		int arr2[] = {9, 4, 9, 8, 4, 11, 12, 1, 2, 2};
		System.out.print("Intersection #s are: " + Arrays.toString(intersectNumbers(arr1, arr2)));
	}




	private static int[] intersectNumbers(int[] arr1, int[] arr2) {
		
		HashSet<Integer> vd = new HashSet<Integer>();
		HashSet<Integer> ed = new HashSet<Integer>();
		
		for(int number: arr1) {
			vd.add(number);
		}
		for(int number: arr2) {
			ed.add(number);
		}
		
		int count = 0;
		
		for(int num: ed) {
			if(vd.contains(num)) {
				count++;
			}
		}
		int j = 0;
		int [] result = new int[count];
		
		for(int i: ed) {
			if(vd.contains(i)) {
				result[j] = i;
				j++;
			}
		}
		
		
		
		return result;
	}

}
