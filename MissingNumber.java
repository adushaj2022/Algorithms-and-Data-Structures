package practiceEx;


import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {

		
		int a[] = new int[] {6, 3, 4, 5, 1};
		
		
		System.out.print("The missing number is " +  findMissingNumber(a));
		
		
		
	}
	

	private static int findMissingNumber(int[] arr) {
		HashSet<Integer> numberSet = new HashSet<Integer>();
		
		//add each element of the array in the HashSet
		for (int i = 0; i < arr.length; i++){
			numberSet.add(arr[i]);
		}
		System.out.println(numberSet.toString());
		
		//if the value of J is not inside of the HashSet we will return that number as that implies it is missing
		for (int j = 1; j <= arr.length + 1; j++) {
			if (numberSet.contains(j) == false) {return j;}
	     }
		
		return -1;

}
	
	
	
}
