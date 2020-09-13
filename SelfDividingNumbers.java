package practiceEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {

		
		int leftBound = 1;
		int rightBound = 22;
		
		System.out.print(selfDividingNumbers(leftBound, rightBound).toString());
	}

	private static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
	
		for(;left<=right;left++) {
			if(isSelfDivisible(left)) list.add(left);
		}
		return list;
		
	}

	private static boolean isSelfDivisible(int num) {
		for(char c: String.valueOf(num).toCharArray()) {
			if(c == '0' || num % (c -'0') > 0){
				return false;
			}
		}
		return true;
	}

}
