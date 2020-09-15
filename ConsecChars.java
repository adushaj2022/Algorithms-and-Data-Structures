package practiceEx;

import java.util.Arrays;

public class ConsecChars {

	public static void main(String[] args) {

		System.out.print(maxPower("Leeeeetcode"));
		

	}

	private static int maxPower(String s) {
		
		if(s.length() == 1) {
			return 1;
		}
	
		int[] alphabet =  new int[26];
		
		int count = 1;
		
		for(int i = 0; i < s.length() - 1; i++) {
			
			if(s.charAt(i) == s.charAt(i+1)){
				count ++;
				if(count > alphabet[Math.abs(s.charAt(i) - 'a')]) {
					alphabet[Math.abs(s.charAt(i) - 'a')] = count;
				} continue;
			}
			
			count = 1;
			
			if(count > alphabet[Math.abs(s.charAt(i) - 'a')]) {
				alphabet[Math.abs(s.charAt(i) - 'a')] = count;
			}
			
		}
		
		
		int max = Integer.MIN_VALUE;
		
		for(int j = 0; j < alphabet.length; j++) {
			if(alphabet[j] > max) {
				max = alphabet[j];
			}
		}
		return max;
		
	}

}
