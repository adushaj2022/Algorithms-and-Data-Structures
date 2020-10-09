package practiceEx;

public class Problem_4 {
	
	public static void main(String[] args) {
		
		int x1 = 8;
		int x2 = 5;
		int x3 = 17;
		System.out.println("The square root of " + x1 + " is " + squareroot(x1));
		System.out.println("The square root of " + x2 + " is " + squareroot(x2));
		System.out.println("The square root of " + x3 + " is " + squareroot(x3));

	}

	private static int squareroot(int num) {
		
		//check to see if num is one or two, if so return ;this is an edge case
		if (num < 2) 
			return num;
		
		//check to see if num already has a square root
		if((Math.sqrt(num) - Math.floor(Math.sqrt(num))) == 0) 
			return (int) Math.sqrt(num); 
		
	
		int left = 0; //start at 0
		int right = num / 2; //the floor of a square root of num cannot be more than half of num
		
		
		while(left <= right) {
			int midpoint = (left + right) / 2;
			
			if(midpoint * midpoint == num){
				return midpoint;
			}
			//if the sq root is higher we know to look at smaller numbers only
			else if(midpoint * midpoint > num) {
				right = midpoint - 1; 
			}
			
			//if the sq root is lower we know to look at smaller numbers only
			else {
				left = midpoint + 1;
			}
			
		}
		
		/*once we exit the while loop, we will back track one as that is our 
		 * first floor below num, the last iteration will have gone over the value of num
		 * so we will do left - 1 because left is the last value that will be stored
		 */ 
		 
		return left - 1;
	}


}
