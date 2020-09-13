package practiceEx;

public class reverseInt {

	public static void main(String[] args) {

		int k = 112;
		System.out.print("The reverse Integer for " + k + " is: " + reverseInteger(k));
		
}

	private static int reverseInteger(int x) {
		int res = 0;  
		while (x != 0) {
	            res = res * 10 + x % 10;
	            x = x / 10;
	   
	        }
	
	return res;
	
	}	
	
	
}