package practiceEx;

import java.util.HashMap;

public class RomanNumeral {

	public static void main(String[] args) {
		
		String romanNumeral = "IV";
		System.out.print("Roman numeral value for " + romanNumeral + " is " + convertRtoInt(romanNumeral));
		

	}

	private static int convertRtoInt(String romanNumeral) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int total = 0;
		for(int i = 0; i < romanNumeral.length(); i++) {
			char currentVal = romanNumeral.charAt(i);
			if(i + 1 < romanNumeral.length() && map.get(currentVal) < map.get(romanNumeral.charAt(i+1))) {
				total -= map.get(currentVal);
			} 
			else {
			
				total+= map.get(currentVal);
			}
			
		}
		
		
		
		return total;
	}

}
