package practiceEx;

public class PalindromeNum {

	public static void main(String[] args) {

		int j = 212;
		System.out.print("It is " + palindrome(j) + " that " + j +" is a Palindrome Number");
	}

	private static boolean palindrome(int j) {
		String parseInt = Integer.toString(j);
		StringBuilder input = new StringBuilder();
		input.append(parseInt);
		input = input.reverse();
		
		if (input.toString().contentEquals(parseInt)) {
			return true;
		}
		
		else {
			return false;
			
		}
	}

}
