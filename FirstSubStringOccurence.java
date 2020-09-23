package practiceEx;

public class FirstSubStringOccurence {

	public static void main(String[] args) {
		String hay_stack = "Leetcode";
		String needle = "ee";
		
		int k = firstOccuence(hay_stack, needle);
		
		System.out.println(needle + " first appeared at index " + k);

	}

	private static int firstOccuence(String s1, String s2) {
		
		if(s1.length() == 0) { 
			return -1;
		}
		
		int index = s1.indexOf(s2);
		
		
		return index;
	}

}
