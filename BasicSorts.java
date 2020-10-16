
package practiceEx;

import java.util.Arrays;
import java.util.Scanner;

public class AllSorts {
	public static void main(String[] args) {
	
	
	System.out.println("Enter the required size of the array: ");
	
    	Scanner s = new Scanner(System.in);
    
  	int size = s.nextInt();
    
	int numList[] = new int[size];
	
	System.out.println("Enter the numbers for the list: ");
	
	for(int i = 0;i<numList.length; i++) {
		
		numList[i] = s.nextInt();
		
	}
	
	/*sort Functions */
	
	bubbleSort(numList);
	insertionSort(numList);
	//numList = mergeSort(numList);
	quickSort(numList, 0, numList.length-1);
	 
	System.out.println("Quick Sort: " + Arrays.toString(numList));
	s.close();
}

	
	private static int[] quickSort(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		//midpoint will be in between low and high
		int midpoint = (low+high)/2;
		//pivot will start off as the element in the mid point index in the array
		int pivot = (arr[midpoint]);
		int temp;
		
		
		while(i<=j) {
			
			//will increment until a higher number is given to allow swap
			while(arr[i] < pivot) {
				i++;
			}
			//will increment until a lower number is given to allow swap
			while(arr[j] > pivot) {
				j--;
			}
			
			//when two valid numbers are given, and both while loops are broken out of we will swap
			if(i<=j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				//increment to continue
				i++;
				j--;
			}
			
			//if still unsorted, i and j will become new arrays on the opposite side
			
			if(low < j) {
				//we will call the function recursively and further break down arrays till sorted
				quickSort(arr, low, j);
			}
			
			if (i < high) {
				//we will call the function recursively and further break down arrays till sorted
				quickSort(arr, i, high);
			}
			
			
			
			
		}
	
				
		return arr;
		
		
	}


	@SuppressWarnings("unused")
	private static int[] mergeSort(int[] list) {
		
		if(list.length <=1 ) {
			return list;
		}
		
		int midpoint = list.length / 2;
		int[] left = new int [midpoint];
		int[] right;
		
		if (list.length % 2 == 0) {
			right = new int[midpoint];
		} else {
			right = new int[midpoint+1];
		}
		
		int[]result = new int[list.length];
		
		
		
		for(int i =0 ;i<midpoint;i++) {
			left[i] = list[i];
		}
		
		for(int j =0 ; j <right.length;j++) {
			right[j] = list[midpoint + j];
	    }
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		
		result = merge(left, right);
	
		
		return result;
		
		
	}


	private static int[] merge(int[] left, int[] right) {
		int leftPointer, rightPointer, resultPointer;
		rightPointer = leftPointer = resultPointer = 0;
		
		int[] result = new int [left.length + right.length];
		
		
		while(leftPointer < left.length || rightPointer < right.length) {
			
			if(leftPointer < left.length && rightPointer < right.length) {
				
				if(left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];				
							
				
				}
				
				else {
					result[resultPointer++] = right[rightPointer++];	
					
				}
				
			} else if(leftPointer < left.length){
				result[resultPointer++] = left[leftPointer++];
				
				
			} else if (rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}
			
			
			
		}
		
		
		
		
		
		return result;
	}


	private static void insertionSort(int[] list) {
		int key;
		int j;
		int temp;
		int i;
		for(i=1;i<list.length;i++) {
			key = list[i];
			j = i-1;
			while (j >= 0 && list[j] > key) {
				temp = list[j];
				list[j] = list[j+1];
				list[j+1] = temp;
			}
		}
		
		
	}


	private static void bubbleSort(int[] setOfNum) {
		int temp = 0;
		
		for(int i=0; i<setOfNum.length;i++) {	
			for(int j=0;j<setOfNum.length - 1 - i; j++){
				if (setOfNum[j]>setOfNum[j+1]) {
					temp = setOfNum[j];
					setOfNum[j] = setOfNum[j+1];
					setOfNum[j+1] = temp;
				}
			}
		}
		
		
	}



}
