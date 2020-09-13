package practiceEx;

public class EvenOddArray {

	public static void main(String[] args) {
		
		
				int[] A = {13, 20, 45, 69, 78, 100, 127, 155};
				
				System.out.println("Before:");
				
				for(int i=0; i < A.length; i++)
				{
					System.out.print(A[i]+" ");
				}
				
				rearrange(A);
				
				System.out.println("\nAfter:");
				
				for(int i=0; i < A.length; i++)
				{
					System.out.print(A[i]+" ");
				}

	}


	private static int[] rearrange(int[] a) {
		
		for(int i = 0; i <a.length-1; i++) {
			
			//if the index is in an even position and it is greater than the number next to it
			//we will swap it 
			if(isEven(i) && a[i] >= a[i+1]) {
				swap(a, i, i+1);
			}
			
			if ((!isEven(i)) && a[i] <= a[i+1]) {
				//if the index is in an odd position and it is less than the number next to it
				//we will swap it 
				swap(a, i, i+1);
			}		
		}
		return a;
	}
	
	//method to swap two array elements
	private static void swap(int[] a, int x, int y) {
		int temp = a[x]; a[x] = a[y]; a[y] = temp;	
	}

	//method to check if something is even
	private static boolean isEven(int i) {
		return (i % 2 == 0) ? true : false;
		
	}

}
